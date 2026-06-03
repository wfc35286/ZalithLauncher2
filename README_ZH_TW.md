# Zalith Launcher 2 - WFC 個人分支

[English](README.md) | [简体中文](README_ZH_CN.md)

> [!IMPORTANT]
> 本倉庫是 [ZalithLauncher/ZalithLauncher2](https://github.com/ZalithLauncher/ZalithLauncher2) 的**非官方個人分支**，維護地址為 [wfc35286/ZalithLauncher2](https://github.com/wfc35286/ZalithLauncher2)。  
> 此分支主要用於適配我自己的使用習慣、裝置環境與一些個人需求，**不是 Zalith Launcher 2 官方發布渠道**。

## 關於這個分支

本分支基於 **Zalith Launcher 2**。Zalith Launcher 2 是一個面向 **Android 裝置** 的 [Minecraft: Java Edition](https://www.minecraft.net/) 啟動器，使用 PojavLauncher 作為啟動核心，並採用 Jetpack Compose 與 Material Design 3 構建介面。

本倉庫的修改主要是個人向適配，包括但不限於：

- 手把 / 控制器相容性實驗，尤其是 Android 環境下適配 Controlify；
- 調整套件名稱、簽名與構建流程，以便和上游官方應用共存；
- 針對我自己用不習慣的地方做一些 UI 與工作流個性化修改；
- 增加 OpenAI 相容 API 的崩潰日誌分析實驗功能；
- 針對我個人環境中遇到的 Minecraft / Mod 組合問題加入相容性補丁。

本倉庫**不發布 GitHub Releases**。如果你需要穩定公開版本，請使用上游官方專案。

## 致謝

首先感謝原專案及其貢獻者：

- 上游倉庫：[ZalithLauncher/ZalithLauncher2](https://github.com/ZalithLauncher/ZalithLauncher2)
- 原 Zalith Launcher 專案：[ZalithLauncher/ZalithLauncher](https://github.com/ZalithLauncher/ZalithLauncher)
- PojavLauncher 專案：[PojavLauncherTeam/PojavLauncher](https://github.com/PojavLauncherTeam/PojavLauncher)

本分支保留原專案版權聲明及 GPLv3 附加條款。

## 📦 構建方式

> 本倉庫面向開發者或個人自行構建使用，不提供預構建 APK。

### 環境要求

* Android Studio Bumblebee 以上
* Android SDK：
    * **最低 API**：26
    * **目標 API**：35
* JDK 11

### 構建步驟

```bash
git clone git@github.com:wfc35286/ZalithLauncher2.git
# 使用 Android Studio 開啟專案並進行構建
```




## 📜 License

本專案程式碼遵循 **[GPL-3.0 license](LICENSE)** 開源協議。

### 附加條款（依據 GPLv3 開源授權條款第七條）

1. 當你分發本程式的修改版本時，必須以合理方式修改該程式的名稱或版本號，以區別於原始版本。（依據 [GPLv3, 7(c)](https://github.com/ZalithLauncher/ZalithLauncher2/blob/969827b/LICENSE#L372-L374)）
    - 修改版本 **不得在名稱中包含原程式名稱「ZalithLauncher」或其縮寫「ZL」，亦不得使用與官方名稱相近、可能造成混淆的名稱**。
    - 所有修改版本 **必須在程式啟動畫面或主介面中以明顯方式標示其為「非官方修改版」**。
    - 程式的應用名稱可於 [gradle.properties](./ZalithLauncher/gradle.properties) 中進行修改。

2. 你不得移除本程式所顯示的版權聲明。（依據 [GPLv3, 7(b)](https://github.com/ZalithLauncher/ZalithLauncher2/blob/969827b/LICENSE#L368-L370)）

## 引用開源專案
  
本軟體使用以下開源函式庫:

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
| gl4es_extra_extra                     | Copyright © 2016-2018 Sebastien Chevalier; Copyright© 2013-2016 Ryan Hileman                                  | MIT License          | [链接](https://github.com/PojavLauncherTeam/gl4es_extra_extra)                    |
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
| NG-GL4ES                              | Copyright © 2016-2018 Sebastien Chevalier; Copyright © 2013-2016 Ryan Hileman; Copyright (c) 2025-2026 BZLZHH | MIT License          | [链接](https://github.com/BZLZHH/NG-GL4ES)                                        |
| OkHttp                                | Copyright © 2019 Square, Inc.                                                                                 | Apache 2.0           | [链接](https://github.com/square/okhttp)                                          |
| Okio                                  | Copyright © 2013 Square, Inc.                                                                                 | Apache 2.0           | [链接](https://square.github.io/okio/)                                            |
| Process Phoenix                       | Copyright © 2015 Jake Wharton                                                                                 | Apache 2.0           | [链接](https://github.com/JakeWharton/ProcessPhoenix)                             |
| proxy-client-android                  | -                                                                                                             | LGPL-3.0 License     | [链接](https://github.com/TouchController/TouchController)                        |
| Reorderable                           | Copyright © 2023 Calvin Liang                                                                                 | Apache 2.0           | [链接](https://github.com/Calvin-LL/Reorderable)                                  |
| skinview3d                            | Copyright © 2014-2018 Kent Rasmussen; Copyright © 2017-2022 Haowei Wen, Sean Boult and contributors           | MIT License          | [链接](https://github.com/bs-community/skinview3d)                                |
| sora-editor                           | Copyright © 1991, 1999 Free Software Foundation, Inc.                                                         | LGPL-2.1 License     | [链接](https://github.com/Rosemoe/sora-editor)                                    |
| StringFog                             | Copyright © 2016-2023, Megatron King                                                                          | Apache 2.0           | [链接](https://github.com/MegatronKing/StringFog)                                 |
| XZ for Java                           | Copyright © The XZ for Java authors and contributors                                                          | 0BSD License         | [链接](https://tukaani.org/xz/java.html)                                          |