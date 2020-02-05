package com.mgcaguioa.base_mvp.screens.base

import androidx.appcompat.app.AppCompatActivity
import com.mgcaguioa.base_mvp.MyApplication
import com.mgcaguioa.base_mvp.di.components.ActivityComponent
import com.mgcaguioa.base_mvp.di.components.DaggerActivityComponent
import com.mgcaguioa.base_mvp.di.modules.ActivityModule

/**
 * Created by mgcaguioa on 7/26/2017.
 *
 *
 * All activities that does NOT require
 * session checking and inactivity should extend from this class
 */

abstract class BaseActivity : AppCompatActivity() {

    private lateinit var mActivityComponent: ActivityComponent

    fun activityComponent(): ActivityComponent {
        mActivityComponent = DaggerActivityComponent.builder()
            //  Just ignore this deprecated method
            //  It is intended to notify you of unused methods and modules
            .activityModule(ActivityModule(this))
            .applicationComponent(MyApplication[this].component)
            .build()
        return mActivityComponent
    }
}