package com.example.goodjobapp.di

import com.example.goodjobapp.settings.api.SettingsFeatureApi
import com.example.goodjobapp.settings.api.SettingsFeatureApiImpl
import com.example.goodjobapp.word.api.WordFeatureApi
import com.example.goodjobapp.word.api.WordFeatureApiImpl
import dagger.Binds
import dagger.Module


@Module
interface FeatureModule {

    @Binds
    fun bindWordFeature(wordFeatureImpl: WordFeatureApiImpl): WordFeatureApi

    fun bindSettingsFeature(settingsFeatureApiImpl: SettingsFeatureApiImpl): SettingsFeatureApi
}