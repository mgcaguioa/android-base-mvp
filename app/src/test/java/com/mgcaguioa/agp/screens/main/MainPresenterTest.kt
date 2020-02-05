package com.mgcaguioa.agp.screens.main

import com.mgcaguioa.agp.BaseUnitTest
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito

class MainPresenterTest : BaseUnitTest() {
    @Mock
    private lateinit var mView: MainView

    private lateinit var mPresenter: MainPresenter

    @Before
    fun setUp() {
        mPresenter = Mockito.spy(MainPresenter())
        mPresenter.attachView(mView)
    }

    @After
    fun tearDown() {
        mPresenter.detachView()
    }

    @Test
    fun attachView() {
        Mockito.verify(mView).saySomething("Hello World")
    }
}