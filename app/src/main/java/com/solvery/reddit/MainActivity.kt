package com.solvery.reddit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.solvery.reddit.storage.UserNameStorage

class MainActivity : AppCompatActivity() {

    private val storage by lazy { UserNameStorage.getStorage(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<AppCompatEditText>(R.id.userNameText).apply { setText(storage.userName) }

        findViewById<AppCompatButton>(R.id.save).setOnClickListener {
            storage.userName = editText.text.toString()
        }
    }
}