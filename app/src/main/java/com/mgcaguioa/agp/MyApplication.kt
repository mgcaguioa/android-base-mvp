package com.mgcaguioa.agp

import android.app.Application
import android.content.Context
import com.mgcaguioa.agp.di.components.ApplicationComponent
import com.mgcaguioa.agp.di.components.DaggerApplicationComponent
import com.mgcaguioa.agp.di.modules.ApplicationModule
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