package com.kei.odakapp.intro.onboard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kei.odakapp.auth.login.LoginActivity
import com.kei.odakapp.R
import kotlinx.android.synthetic.main.activity_first_onboarding.*

class FirstOnboardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_onboarding)

        supportActionBar?.hide()

        btn_next_1.setOnClickListener {
            val moveActivityIntent = Intent(this, SecondOnboardingActivity::class.java)
            startActivity(moveActivityIntent)
        }
        tv_skip_1.setOnClickListener {
            val moveActivityIntent = Intent(this, LoginActivity::class.java)
            startActivity(moveActivityIntent)
        }
    }
}