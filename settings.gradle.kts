rootProject.name = "Bukkript"

include("script-definition", "script-definition-embedded", "script-host", "plugin", "cli")

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven ("https://dl.bintray.com/kotlin/kotlin-eap")
    }
}
