package com.kei.odakapp.timer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kei.odakapp.R

class FocusTimerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_focus_timer)

        //supportActionBar?.hide()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}