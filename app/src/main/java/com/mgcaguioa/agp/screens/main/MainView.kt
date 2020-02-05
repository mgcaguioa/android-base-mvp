package com.mgcaguioa.agp.screens.main

import com.mgcaguioa.agp.screens.base.MvpView

interface MainView: MvpView {

    fun saySomething(string: String)
}