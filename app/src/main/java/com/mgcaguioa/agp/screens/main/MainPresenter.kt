package com.mgcaguioa.agp.screens.main

import com.mgcaguioa.agp.screens.base.BasePresenter
import javax.inject.Inject

class MainPresenter @Inject internal constructor(): BasePresenter<MainView>() {

    override fun attachView(mvpView: MainView) {
        super.attachView(mvpView)

        if (isViewAttached)
            mvpView.saySomething("Hello World")
    }
}