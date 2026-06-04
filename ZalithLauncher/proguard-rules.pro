-dontwarn org.slf4j.impl.StaticLoggerBinder
-dontwarn com.github.luben.zstd.**
-dontwarn java.lang.management.**
-dontwarn io.ktor.util.debug.**

-keepattributes SourceFile,LineNumberTable
-renamesourcefileattribute SourceFile

# Keep annotations/signatures useful for Compose, Parcelable, kotlinx.serialization and reflection diagnostics.
-keepattributes *Annotation*,Signature,InnerClasses,EnclosingMethod

# Room
-keepclassmembers class * {
    @androidx.room.* <fields>;
    @androidx.room.* <methods>;
}

# JNI / Java-side entry points used from native code or the external JVM.
# These names must remain stable in Release builds.
-keep class com.movtery.zalithlauncher.bridge.** { *; }
-keep class com.oracle.dalvik.VMLauncher { *; }
-keep class org.lwjgl.glfw.** { *; }
-keep class com.movtery.zalithlauncher.game.input.CriticalNativeTest { *; }

# Hilt / Android entry points.
# Prevent R8 from over-optimizing constructors (causes StackOverflow with Hilt + proguard-android-optimize.txt).
-keepclassmembers,allowobfuscation class * {
    @dagger.hilt.internal.GeneratedEntryPoint <init>(...);
}
-keep,allowobfuscation @dagger.hilt.android.AndroidEntryPoint class *

# Vulkan native capability checks.
-keep class com.movtery.zalithlauncher.utils.device.VulkanChecker { *; }
-keep class com.movtery.zalithlauncher.utils.device.VulkanCapabilities { *; }
-keep interface com.movtery.zalithlauncher.utils.device.VulkanLogCallback { *; }

# WFC fork: OpenAI-compatible crash analysis.
# Keep the singleton and public suspend API stable; it is called from the crash UI in Release builds.
-keep class com.movtery.zalithlauncher.crashlogs.OpenAiCrashAnalyzer { *; }
-keep class com.movtery.zalithlauncher.crashlogs.OpenAiCrashAnalyzer$* { *; }

# WFC fork: crash screen AI dialog and Parcelable crash payload.
# Activity classes are normally kept by the manifest, but the nested/top-level Parcelable payload is safer to keep explicitly.
-keep class com.movtery.zalithlauncher.ui.activities.ErrorActivity { *; }
-keep class com.movtery.zalithlauncher.ui.activities.ErrorActivity$* { *; }
-keep class com.movtery.zalithlauncher.ui.activities.JvmCrash { *; }
-keepclassmembers class * implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator CREATOR;
}

# WFC fork: launcher settings added for AI crash analysis.
# Keep field names and accessors stable because settings are centralized in a singleton and used across Compose screens.
-keep class com.movtery.zalithlauncher.setting.AllSettings { *; }
-keep class com.movtery.zalithlauncher.setting.AllSettings$* { *; }
-keep class com.movtery.zalithlauncher.ui.screens.content.settings.LauncherSettingsScreenKt { *; }

# WFC fork: Microsoft OAuth diagnostics/custom client-id validation.
-keep class com.movtery.zalithlauncher.game.account.microsoft.MicrosoftAuthenticatorKt { *; }

# WFC fork: game launch compatibility patch for Controlify MerchantScreenMixin.
# Direct calls do not require strict keeping, but keeping this launcher class helps preserve useful Release stack traces.
-keep class com.movtery.zalithlauncher.game.launch.GameLauncher { *; }
-keep class com.movtery.zalithlauncher.game.launch.GameLauncher$* { *; }

# WFC fork: Android gamepad -> GLFW bridge lives in VMActivity and org.lwjgl.glfw.*.
# Keep VMActivity members to avoid Release-only optimization around input dispatch state machines.
-keep class com.movtery.zalithlauncher.ui.activities.VMActivity { *; }
-keep class com.movtery.zalithlauncher.ui.activities.VMActivity$* { *; }