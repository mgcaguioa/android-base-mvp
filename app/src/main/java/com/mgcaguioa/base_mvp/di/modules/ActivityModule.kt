package com.mgcaguioa.base_mvp.di.modules

import android.app.Activity
import android.content.Context

import com.mgcaguioa.base_mvp.di.context.ActivityContext

import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val mActivity: Activity) {

    @Provides
    @ActivityContext
    internal fun provideContext(): Context {
        return mActivity
    }

    @Provides
    internal fun provideActivity(): Activity {
        return mActivity
    }
}
