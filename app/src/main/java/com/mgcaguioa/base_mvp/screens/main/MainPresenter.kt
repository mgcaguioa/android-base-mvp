package com.mgcaguioa.base_mvp.screens.main

import com.mgcaguioa.base_mvp.screens.base.BasePresenter
import javax.inject.Inject

class MainPresenter @Inject internal constructor(): BasePresenter<MainView>() {

    override fun attachView(mvpView: MainView) {
        super.attachView(mvpView)

        if (isViewAttached)
            mvpView.saySomething("Hello World")
    }
}