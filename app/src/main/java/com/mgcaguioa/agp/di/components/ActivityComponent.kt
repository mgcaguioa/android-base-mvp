package com.mgcaguioa.agp.di.components

import com.mgcaguioa.agp.screens.base.BaseActivity
import com.mgcaguioa.agp.screens.main.MainActivity
import com.mgcaguioa.agp.di.ActivityScope
import com.mgcaguioa.agp.di.modules.ActivityModule
import dagger.Component

/**
 * This component inject dependencies to all Activities across the application
 */
@ActivityScope
@Component(modules = [ActivityModule::class], dependencies = [ApplicationComponent::class])
interface ActivityComponent {

    fun inject(baseActivity: BaseActivity)

    fun inject(mainActivity: MainActivity)
}