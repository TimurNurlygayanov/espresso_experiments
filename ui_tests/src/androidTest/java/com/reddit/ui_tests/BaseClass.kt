package com.reddit.ui_tests

import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4

import com.solvery.reddit.App
import com.solvery.reddit.MainActivity

import org.junit.Before
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
abstract class BaseClass {

    private lateinit var app: App

    @Before
    open fun setUp() = step("Запустили приложение") {
        app = ApplicationProvider.getApplicationContext() as App
    }

    fun startAppForUser(
        userName: String
    ) =
        step(
            "Стартуем приложение с параметрами:" +
                    " userName: $userName"
        ) {
            app.storage.userName = userName
            ActivityScenario.launch(MainActivity::class.java)
            Thread.sleep(2000L)
        }
}