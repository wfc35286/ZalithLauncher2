# Zalith Launcher 2 - WFC 个人分支

[English](README.md) | [繁體中文](README_ZH_TW.md)

> [!IMPORTANT]
> 本仓库是 [ZalithLauncher/ZalithLauncher2](https://github.com/ZalithLauncher/ZalithLauncher2) 的**非官方个人分支**，维护地址为 [wfc35286/ZalithLauncher2](https://github.com/wfc35286/ZalithLauncher2)。  
> 该分支主要用于适配我自己的使用习惯、设备环境和一些个人需求，**不是 Zalith Launcher 2 官方发布渠道**。

## 关于这个分支

本分支基于 **Zalith Launcher 2**。Zalith Launcher 2 是一个面向 **Android 设备** 的 [Minecraft: Java Edition](https://www.minecraft.net/) 启动器，使用 PojavLauncher 作为启动核心，并采用 Jetpack Compose 与 Material Design 3 构建界面。

本仓库的修改主要是个人向适配，包括但不限于：

- 手柄 / 控制器兼容性实验，尤其是 Android 环境下适配 Controlify；
- 调整包名、签名和构建流程，以便和上游官方应用共存；
- 按照我自己用不习惯的地方做一些 UI 与工作流个性化修改；
- 增加 OpenAI 兼容 API 的崩溃日志分析实验功能；
- 针对我个人环境中遇到的 Minecraft / Mod 组合问题加入兼容性补丁。

本仓库**不发布 GitHub Releases**。如果你需要稳定公开版本，请使用上游官方项目。

## 致谢

首先感谢原项目及其贡献者：

- 上游仓库：[ZalithLauncher/ZalithLauncher2](https://github.com/ZalithLauncher/ZalithLauncher2)
- 原 Zalith Launcher 项目：[ZalithLauncher/ZalithLauncher](https://github.com/ZalithLauncher/ZalithLauncher)
- PojavLauncher 项目：[PojavLauncherTeam/PojavLauncher](https://github.com/PojavLauncherTeam/PojavLauncher)

本分支保留原项目版权声明及 GPLv3 附加条款。

## 📦 构建方式

> 本仓库面向开发者或个人自行构建使用，不提供预构建 APK。

### 环境要求

* Android Studio Bumblebee 以上
* Android SDK：
    * **最低 API**：26
    * **目标 API**：35
* JDK 11

### 构建步骤

```bash
git clone git@github.com:wfc35286/ZalithLauncher2.git
# 使用 Android Studio 打开项目并进行构建
```




## 📜 License

本项目代码遵循 **[GPL-3.0 license](LICENSE)** 开源协议。

### 附加条款 (依据 GPLv3 开源协议第七条)  

1. 当你分发该程序的修改版本时，你必须以合理方式修改该程序的名称或版本号，以示其与原始版本不同。(依据 [GPLv3, 7(c)](https://github.com/ZalithLauncher/ZalithLauncher2/blob/969827b/LICENSE#L372-L374))
   - 修改版本 **不得在名称中包含原程序名称 “ZalithLauncher” 或其缩写 “ZL”，也不得使用与官方名称相近、可能导致混淆的名称**。
   - 所有修改版本 **必须在程序启动页面或主界面中以明显方式标注其为“非官方修改版”**。
   - 该程序的应用名称可在 [gradle.properties](./ZalithLauncher/gradle.properties) 中修改。

2. 你不得移除该程序所显示的版权声明。(依据 [GPLv3, 7(b)](https://github.com/ZalithLauncher/ZalithLauncher2/blob/969827b/LICENSE#L368-L370))

## 引用开源项目

本软件使用以下开源库:

| Library                               | Copyright                                                                                                     | License              | Official Link                                                                   |
|---------------------------------------|---------------------------------------------------------------------------------------------------------------|----------------------|---------------------------------------------------------------------------------|
| androidx-constraintlayout-compose     | Copyright © The Android Open Source Project                                                                   | Apache 2.0           | [链接](https://developer.android.com/develop/ui/compose/layouts/constraintlayout) |
| androidx-material-icons-core          | Copyright © The Android Open Source Project                                                                   | Apache 2.0           | [链接](https://developer.android.com/jetpack/androidx/releases/compose-material)  |
| androidx-material-icons-extended      | Copyright © The Android Open Source Project                                                                   | Apache 2.0           | [链接](https://developer.android.com/jetpack/androidx/releases/compose-material)  |
| ANGLE                                 | Copyright 2018 The ANGLE Project Authors                                                                      | BSD 3-Clause License | [链接](http://angleproject.org/)                                                  |
| Apache Commons Codec                  | -                                                                                                             | Apache 2.0           | [链接](https://commons.apache.org/proper/commons-codec)                           |
| Apache Commons Compress               | -                                                                                                             | Apache 2.0           | [链接](https://commons.apache.org/proper/commons-compress)                        |
| Apache Commons IO                     | -                                                                                                             | Apache 2.0           | [链接](https://commons.apache.org/proper/commons-io)                              |
| ByteHook                              | Copyright © 2020-2024 ByteDance, Inc.                                                                         | MIT License          | [链接](https://github.com/bytedance/bhook)                                        |
| BuildKeys                             | Copyright © 2026 MovTery                                                                                      | Apache 2.0           | [链接](https://github.com/MovTery/BuildKeys)                                      |
| Coil Compose                          | Copyright © 2025 Coil Contributors                                                                            | Apache 2.0           | [链接](https://github.com/coil-kt/coil)                                           |
| Coil Gifs                             | Copyright © 2025 Coil Contributors                                                                            | Apache 2.0           | [链接](https://github.com/coil-kt/coil)                                           |
| Coil SVG                              | Copyright © 2025 Coil Contributors                                                                            | Apache 2.0           | [链接](https://github.com/coil-kt/coil)                                           |
| Fishnet                               | Copyright © 2025 Kyant                                                                                        | Apache 2.0           | [链接](https://github.com/Kyant0/Fishnet)                                         |
| gl4es_extra_extra                     | Copyright © 2016-2018 Sebastien Chevalier; Copyright © 2013-2016 Ryan Hileman                                 | MIT License          | [链接](https://github.com/PojavLauncherTeam/gl4es_extra_extra)                    |
| Gson                                  | Copyright © 2008 Google Inc.                                                                                  | Apache 2.0           | [链接](https://github.com/google/gson)                                            |
| kotlinx.coroutines                    | Copyright © 2000-2020 JetBrains s.r.o.                                                                        | Apache 2.0           | [链接](https://github.com/Kotlin/kotlinx.coroutines)                              |
| ktor-client-cio                       | Copyright © 2000-2023 JetBrains s.r.o.                                                                        | Apache 2.0           | [链接](https://ktor.io)                                                           |
| ktor-client-content-negotiation       | Copyright © 2000-2023 JetBrains s.r.o.                                                                        | Apache 2.0           | [链接](https://ktor.io)                                                           |
| ktor-client-core                      | Copyright © 2000-2023 JetBrains s.r.o.                                                                        | Apache 2.0           | [链接](https://ktor.io)                                                           |
| ktor-http                             | Copyright © 2000-2023 JetBrains s.r.o.                                                                        | Apache 2.0           | [链接](https://ktor.io)                                                           |
| ktor-serialization-kotlinx-json       | Copyright © 2000-2023 JetBrains s.r.o.                                                                        | Apache 2.0           | [链接](https://ktor.io)                                                           |
| LWJGL - Lightweight Java Game Library | Copyright © 2012-present Lightweight Java Game Library All rights reserved.                                   | BSD 3-Clause License | [链接](https://github.com/LWJGL/lwjgl3)                                           |
| material-color-utilities              | Copyright 2021 Google LLC                                                                                     | Apache 2.0           | [链接](https://github.com/material-foundation/material-color-utilities)           |
| Maven Artifact                        | Copyright © The Apache Software Foundation                                                                    | Apache 2.0           | [链接](https://github.com/apache/maven/tree/maven-3.9.9/maven-artifact)           |
| Media3                                | Copyright © The Android Open Source Project                                                                   | Apache 2.0           | [链接](https://developer.android.com/jetpack/androidx/releases/media3)            |
| Mesa                                  | Copyright © The Mesa Authors                                                                                  | MIT License          | [链接](https://mesa3d.org/)                                                       |
| MMKV                                  | Copyright © 2018 THL A29 Limited, a Tencent company.                                                          | BSD 3-Clause License | [链接](https://github.com/Tencent/MMKV)                                           |
| Navigation 3                          | Copyright © The Android Open Source Project                                                                   | Apache 2.0           | [链接](https://developer.android.com/jetpack/androidx/releases/navigation3)       |
| NBT                                   | Copyright © 2016 - 2020 Querz                                                                                 | MIT License          | [链接](https://github.com/Querz/NBT)                                              |
| NG-GL4ES                              | Copyright © 2016-2018 Sebastien Chevalier; Copyright (c) 2013-2016 Ryan Hileman; Copyright © 2025-2026 BZLZHH | MIT License          | [链接](https://github.com/BZLZHH/NG-GL4ES)                                        |
| OkHttp                                | Copyright © 2019 Square, Inc.                                                                                 | Apache 2.0           | [链接](https://github.com/square/okhttp)                                          |
| Okio                                  | Copyright © 2013 Square, Inc.                                                                                 | Apache 2.0           | [链接](https://square.github.io/okio/)                                            |
| Process Phoenix                       | Copyright © 2015 Jake Wharton                                                                                 | Apache 2.0           | [链接](https://github.com/JakeWharton/ProcessPhoenix)                             |
| proxy-client-android                  | -                                                                                                             | LGPL-3.0 License     | [链接](https://github.com/TouchController/TouchController)                        |
| Reorderable                           | Copyright © 2023 Calvin Liang                                                                                 | Apache 2.0           | [链接](https://github.com/Calvin-LL/Reorderable)                                  |
| sora-editor                           | Copyright © 1991, 1999 Free Software Foundation, Inc.                                                         | LGPL-2.1 License     | [链接](https://github.com/Rosemoe/sora-editor)                                    |
| skinview3d                            | Copyright © 2014-2018 Kent Rasmussen; Copyright © 2017-2022 Haowei Wen, Sean Boult and contributors           | MIT License          | [链接](https://github.com/bs-community/skinview3d)                                |
| StringFog                             | Copyright © 2016-2023, Megatron King                                                                          | Apache 2.0           | [链接](https://github.com/MegatronKing/StringFog)                                 |
| XZ for Java                           | Copyright © The XZ for Java authors and contributors                                                          | 0BSD License         | [链接](https://tukaani.org/xz/java.html)                                          |