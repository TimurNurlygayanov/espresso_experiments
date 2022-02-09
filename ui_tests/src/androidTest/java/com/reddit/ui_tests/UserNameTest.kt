package com.reddit.ui_tests

import androidx.test.core.app.ActivityScenario
import com.reddit.ui_tests.BaseClass
import com.solvery.reddit.MainActivity
import com.solvery.reddit.pages.UserNamePage
import org.junit.Test
import org.junit.Rule
import com.solvery.reddit.MainActivity


@RunWith(AndroidJUnit4::class)
class UserNameTest : BaseClass() {

    @Rule
    var mActivityTestRule: ActivityTestRule<MainActivity?>? =
        ActivityTestRule(MainActivity::class.java)

    @Test
    fun testUserName() {
        startAppForUser("Reddit")

        UserNamePage.apply {
            checkThatUserNameIsCorrect("Redi")
            replaceUserName("Redi")
            clickOnSave()
            goToInfoScreen()
        }
    }
}