package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.imageview.ShapeableImageView

class favorites_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_favorites_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val profilePic = findViewById<ShapeableImageView>(R.id.profile_picture)
        profilePic.setOnClickListener {
            val intent = Intent(this, profile_page::class.java)
            startActivity(intent)
        }
        val createNav = findViewById<LinearLayout>(R.id.nav_create)
        createNav.setOnClickListener {
            val intent = Intent(this, create_recipe_page::class.java)
            startActivity(intent)
        }
        val homeNav = findViewById<LinearLayout>(R.id.nav_home)
        homeNav.setOnClickListener {
            val intent = Intent(this, home_page::class.java)
            startActivity(intent)
        }
        val profileNav = findViewById<LinearLayout>(R.id.nav_profile)
        profileNav.setOnClickListener {
            val intent = Intent(this, profile_page::class.java)
            startActivity(intent)
        }
        val notificationLayout = findViewById<LinearLayout>(R.id.click_notification)
        notificationLayout.setOnClickListener {
            val intent = Intent(this, notification_page::class.java)
            startActivity(intent)
        }
    }
}