package com.kei.odakapp.rank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kei.odakapp.R

class GlobalRankActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_global_rank)

        //supportActionBar?.hide()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}