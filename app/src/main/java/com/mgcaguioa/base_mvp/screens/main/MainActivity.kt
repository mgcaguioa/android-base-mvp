package com.mgcaguioa.base_mvp.screens.main

import android.os.Bundle
import com.mgcaguioa.base_mvp.R
import com.mgcaguioa.base_mvp.screens.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : BaseActivity(), MainView {

    @Inject
    lateinit var mPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // inject mainScreen dependency
        activityComponent().inject(this)

        // set layout
        setContentView(R.layout.activity_main)

        // attach presenter
        mPresenter.attachView(this)
    }

    override fun saySomething(string: String) {
        tvSaySomething?.text = string
    }
}
