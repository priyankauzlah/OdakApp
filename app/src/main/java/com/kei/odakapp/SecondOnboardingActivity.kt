package com.kei.odakapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first_onboarding.*
import kotlinx.android.synthetic.main.activity_second_onboarding.*

class SecondOnboardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_onboarding)

        supportActionBar?.hide()

        btn_next_2.setOnClickListener {
            val moveActivityIntent = Intent(this, ThirdOnboardingActivity::class.java)
            startActivity(moveActivityIntent)
        }
        tv_skip_2.setOnClickListener {
            val moveActivityIntent = Intent(this, LoginActivity::class.java)
            startActivity(moveActivityIntent)
        }
    }
}