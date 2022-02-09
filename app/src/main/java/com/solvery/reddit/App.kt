package com.solvery.reddit

import android.app.Application
import com.solvery.reddit.storage.UserNameStorage

class App: Application() {

    val storage by lazy { UserNameStorage.getStorage(this) }

}