package com.example.goodjobapp.di

import com.example.goodjobapp.data.DailyProgressRepository
import com.example.goodjobapp.data.TaskRepository
import com.example.goodjobapp.data.repository.DailyProgressRepositoryImpl
import com.example.goodjobapp.data.repository.TaskRepositoryImpl
import dagger.Binds
import dagger.Module

@Module
interface RepositoryModule {

    @Binds
    fun getDailyProgressRepository(dailyProgressRepositoryImpl: DailyProgressRepositoryImpl): DailyProgressRepository

    @Binds
    fun getTaskRepository(taskRepositoryImpl: TaskRepositoryImpl): TaskRepository
}