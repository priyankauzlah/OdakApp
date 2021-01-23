package com.kei.odakapp.intro.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.kei.odakapp.R
import com.kei.odakapp.intro.onboard.FirstOnboardingActivity

class SplashActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT:Long = 4000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        supportActionBar?.hide()

        Handler().postDelayed({
            startActivity(
                Intent(this,
                    FirstOnboardingActivity::class.java)
            )
            finish()
        }, SPLASH_TIME_OUT)
    }
}