package com.example.goodjobapp.app

import android.app.Application
import com.example.goodjobapp.di.AppDiProvider
import com.example.goodjobapp.di.DaggerAppComponent

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        initDagger()
    }

    private fun initDagger(){
        AppDiProvider.appComponent = DaggerAppComponent
                .builder()
                .addContext(this)
                .build()
    }
}