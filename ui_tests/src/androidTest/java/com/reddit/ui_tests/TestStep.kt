package com.reddit.ui_tests

import android.util.Log


private const val TEST_TAG = "TEST_EXECUTION"

typealias TestAction = () -> Unit

fun step(description: String, action: TestAction) {
    Log.d(TEST_TAG, description)
    action()
}