package com.solvery.reddit.storage

import android.content.Context

class UserNameStorage private constructor(context: Context) {

    private val prefs = context.getSharedPreferences(USER_PREFS_NAME, Context.MODE_PRIVATE)

    var userName: String
        get() {
            return prefs.getString(USER_NAME_KEY, "") ?: ""
        }
        set(value) {
            prefs.edit().putString(USER_NAME_KEY, value).apply()
        }

    companion object {
        private const val USER_PREFS_NAME = "User_Prefs"
        private const val USER_NAME_KEY = "USER_NAME_KEY"

        fun getStorage(context: Context): UserNameStorage =
            UserNameStorage(context)
    }
}