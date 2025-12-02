package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class login_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page) // your login layout

        val loginButton = findViewById<Button>(R.id.btn_login)
        loginButton.setOnClickListener {
            val intent = Intent(this, home_page::class.java) // or whatever class uses activity_main.xml
            startActivity(intent)
            finish()
        }
        val signupText = findViewById<TextView>(R.id.txt_signup)
        signupText.setOnClickListener {
            val intent = Intent(this, signup_page::class.java)
            startActivity(intent)
        }
    }
}