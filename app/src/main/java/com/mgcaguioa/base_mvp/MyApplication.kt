package com.mgcaguioa.base_mvp

import android.app.Application
import android.content.Context
import com.mgcaguioa.base_mvp.di.components.ApplicationComponent
import com.mgcaguioa.base_mvp.di.components.DaggerApplicationComponent
import com.mgcaguioa.base_mvp.di.modules.ApplicationModule
import timber.log.Timber

internal class MyApplication : Application() {

    lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        // enable timber logging on debug build
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())

        // initialize dagger application component
        component = DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build()
    }

    companion object {
        operator fun get(context: Context): MyApplication {
            return context.applicationContext as MyApplication
        }
    }
}