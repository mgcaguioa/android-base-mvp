package com.mgcaguioa.base_mvp.screens.main

import com.mgcaguioa.base_mvp.screens.base.MvpView

interface MainView: MvpView {

    fun saySomething(string: String)
}