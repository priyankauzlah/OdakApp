package com.kei.odakapp.auth.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kei.odakapp.MainActivity
import com.kei.odakapp.R
import com.kei.odakapp.auth.login.LoginActivity
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        supportActionBar?.hide()
        btn_register.setOnClickListener {
            val moveActivityIntent = Intent(this, MainActivity::class.java)
            startActivity(moveActivityIntent)
        }
        tv_login_register.setOnClickListener {
            val moveActivityIntent = Intent(this, LoginActivity::class.java)
            startActivity(moveActivityIntent)
        }
    }
}