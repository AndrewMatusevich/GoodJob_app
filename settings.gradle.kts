pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "GoodJobApp"
include(":app")
include(":domain_models")
include(":data")
include(":data_api")
include(":core:ui")
include(":core:navigation")
include(":features:word_screen")
include(":features:settings_screen")
include(":features:settings_screen_api")
include(":features:word_screen_api")
