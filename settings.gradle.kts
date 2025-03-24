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
include(":features:word")
include(":features:word_api")
include(":features:settings")
include(":features:settings_api")
