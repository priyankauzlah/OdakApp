package com.kei.odakapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first_onboarding.*
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide()

        btnLogin.setOnClickListener {
            val moveActivityIntent = Intent(this, MainActivity::class.java)
            startActivity(moveActivityIntent)
        }
        tv_signup_login.setOnClickListener {
            val moveActivityIntent = Intent(this, RegisterActivity::class.java)
            startActivity(moveActivityIntent)
        }
    }
}