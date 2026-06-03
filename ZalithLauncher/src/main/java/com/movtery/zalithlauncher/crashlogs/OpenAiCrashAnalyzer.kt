package com.movtery.zalithlauncher.crashlogs

import com.google.gson.JsonArray
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import com.movtery.zalithlauncher.path.createOkHttpClientBuilder
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.util.concurrent.TimeUnit

object OpenAiCrashAnalyzer {
    private val client by lazy {
        createOkHttpClientBuilder { builder ->
            builder.connectTimeout(30, TimeUnit.SECONDS)
            builder.readTimeout(120, TimeUnit.SECONDS)
            builder.writeTimeout(120, TimeUnit.SECONDS)
            builder.callTimeout(180, TimeUnit.SECONDS)
        }.build()
    }
    private val jsonMedia = "application/json; charset=utf-8".toMediaType()

    private fun normalizeBaseUrl(baseUrl: String): String = baseUrl.trim().trimEnd('/')

    private fun modelsUrls(baseUrl: String): List<String> {
        val normalized = normalizeBaseUrl(baseUrl)
        return if (normalized.endsWith("/v1")) {
            listOf("$normalized/models")
        } else {
            listOf("$normalized/models", "$normalized/v1/models")
        }
    }

    private fun chatCompletionsUrl(baseUrl: String): String {
        val normalized = normalizeBaseUrl(baseUrl)
        return if (normalized.endsWith("/v1")) "$normalized/chat/completions" else "$normalized/v1/chat/completions"
    }

    suspend fun listModels(baseUrl: String, apiKey: String): List<String> = withContext(Dispatchers.IO) {
        val errors = mutableListOf<String>()
        for (url in modelsUrls(baseUrl)) {
            runCatching {
                val request = Request.Builder()
                    .url(url)
                    .header("Authorization", "Bearer ${apiKey.trim()}")
                    .header("User-Agent", "ZalithLauncher-CrashAI")
                    .get()
                    .build()
                client.newCall(request).execute().use { response ->
                    val body = response.body?.string().orEmpty()
                    if (!response.isSuccessful) error("$url -> HTTP ${response.code}: ${body.take(500)}")
                    val trimmed = body.trimStart()
                    if (!trimmed.startsWith("{")) error("$url -> 返回的不是 JSON，可能 API 地址不正确：${body.take(120)}")
                    val root = JsonParser.parseString(body).asJsonObject
                    return@withContext root.getAsJsonArray("data")
                        ?.mapNotNull { it.asJsonObject.get("id")?.asString }
                        ?.filter { it.isNotBlank() }
                        ?: emptyList()
                }
            }.onFailure { e ->
                errors += e.localizedMessage ?: e.message ?: e.toString()
            }
        }
        error(errors.joinToString("\n"))
    }

    suspend fun analyze(
        baseUrl: String,
        apiKey: String,
        model: String,
        logContent: String
    ): String = withContext(Dispatchers.IO) {
        val trimmedLog = logContent.takeLast(60_000)
        val messages = JsonArray().apply {
            add(JsonObject().apply {
                addProperty("role", "system")
                addProperty("content", "你是专业的 Minecraft/Fabric/Android 启动器崩溃日志分析助手。请用中文输出，且必须严格使用两个分区标题：\n关键原因\n修复方法\n要求：关键原因只写最可能根因和相关模组/组件；修复方法写可执行步骤并优先给最推荐方案；说明与启动器本身是否相关。不要编造不存在的信息。")
            })
            add(JsonObject().apply {
                addProperty("role", "user")
                addProperty("content", "请分析下面的 Minecraft 崩溃/启动日志：\n\n$trimmedLog")
            })
        }
        val payload = JsonObject().apply {
            addProperty("model", model)
            addProperty("temperature", 0.2)
            add("messages", messages)
        }.toString()

        val request = Request.Builder()
            .url(chatCompletionsUrl(baseUrl))
            .header("Authorization", "Bearer ${apiKey.trim()}")
            .header("User-Agent", "ZalithLauncher-CrashAI")
            .post(payload.toRequestBody(jsonMedia))
            .build()

        client.newCall(request).execute().use { response ->
            val body = response.body?.string().orEmpty()
            if (!response.isSuccessful) error("HTTP ${response.code}: ${body.take(800)}")
            val root = JsonParser.parseString(body).asJsonObject
            root.getAsJsonArray("choices")
                ?.firstOrNull()
                ?.asJsonObject
                ?.getAsJsonObject("message")
                ?.get("content")
                ?.asString
                ?.takeIf { it.isNotBlank() }
                ?: error("响应中没有 choices[0].message.content")
        }
    }
}