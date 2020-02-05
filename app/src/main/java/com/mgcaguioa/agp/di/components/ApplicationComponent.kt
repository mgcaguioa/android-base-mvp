package com.mgcaguioa.agp.di.components

import android.app.Application
import android.content.Context
import com.mgcaguioa.agp.di.context.ApplicationContext
import com.mgcaguioa.agp.di.modules.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    @get:ApplicationContext
    val context: Context

    val application: Application
}
