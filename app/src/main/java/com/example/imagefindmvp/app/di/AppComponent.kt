package com.example.imagefindmvp.app.di

import com.example.imagefindmvp.app.ui.MainActivity
import dagger.Component
import javax.inject.Singleton

@Component(modules=[ImageListModule::class, RetrofitModule::class])
@Singleton
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}