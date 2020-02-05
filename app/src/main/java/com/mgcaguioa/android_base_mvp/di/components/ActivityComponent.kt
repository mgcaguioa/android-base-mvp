package com.mgcaguioa.android_base_mvp.di.components

import com.mgcaguioa.android_base_mvp.screens.base.BaseActivity
import com.mgcaguioa.android_base_mvp.screens.main.MainActivity
import com.mgcaguioa.android_base_mvp.di.ActivityScope
import com.mgcaguioa.android_base_mvp.di.modules.ActivityModule
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