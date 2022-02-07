package com.example.imagefindmvp.app

import android.app.Application
import com.example.imagefindmvp.app.di.AppComponent
import com.example.imagefindmvp.app.di.DaggerAppComponent

class App : Application() {
    lateinit var appComponent: AppComponent
    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}