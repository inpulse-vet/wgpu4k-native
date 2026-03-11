rootProject.name = "wgpu4k-native-root"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
	includeBuild("generator")
	repositories {
		gradlePluginPortal()
		google()
		mavenCentral()
	}
}

plugins {
	id("org.gradle.toolchains.foojay-resolver-convention").version("1.0.0")
}

dependencyResolutionManagement {
	repositories {
		google()
		mavenCentral()
	}
}

include("wgpu4k-native")
include("wgpu4k-native-specs")
include("demo:common")
include("demo:desktop-and-ios")
include("demo:android")
include("demo:android-native")
