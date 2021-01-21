package com.kei.odakapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FocusTimerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_focus_timer)

        supportActionBar?.hide()
    }
}