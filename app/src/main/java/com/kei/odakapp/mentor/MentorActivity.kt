package com.kei.odakapp.mentor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kei.odakapp.R

class MentorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mentor)

        //supportActionBar?.hide()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}