package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class signup_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup_page)
        val signupButton = findViewById<Button>(R.id.btn_signup)
        signupButton.setOnClickListener {
            val intent = Intent(this, home_page::class.java) // or whatever class uses activity_main.xml
            startActivity(intent)
            finish()
        }
        val loginText = findViewById<TextView>(R.id.txt_login)
        loginText.setOnClickListener {
            val intent = Intent(this, login_page::class.java)
            startActivity(intent)
        }
    }
}