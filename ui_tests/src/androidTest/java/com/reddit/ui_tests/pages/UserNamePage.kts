package com.reddit.ui_tests

import com.solvery.reddit.step
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.GeneralLocation
import androidx.test.espresso.action.GeneralSwipeAction
import androidx.test.espresso.action.Press
import androidx.test.espresso.action.Swipe
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.longClick
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withEffectiveVisibility
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withParent
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.solvery.reddit.MainActivity
import com.solvery.reddit.R


object UserNamePage: BasePage {

    private val userName = withId(R.id.userNameText)

    fun checkThatUserNameIsCorrect(userName: String) = step("Проверяем, что $userName корректен") {
        onView(this.userName).check(matches(withText(userName)))
    }

    fun replaceUserName(userName: String) = step("Replace..") {}

    fun clickOnSave() = step("Click on save") {}

    fun goToInfoScreen() = step("Info") {}
}