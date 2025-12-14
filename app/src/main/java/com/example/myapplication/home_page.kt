package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.imageview.ShapeableImageView

class home_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page)
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

        val recipe1 = findViewById<LinearLayout>(R.id.recipe_1)
        recipe1.setOnClickListener {
            val intent = Intent(this, food_desc_page_pb::class.java)
            startActivity(intent)
        }

        val recipe2 = findViewById<LinearLayout>(R.id.recipe_2)
        recipe2.setOnClickListener {
            val intent = Intent(this, food_desc_page::class.java)
            startActivity(intent)
        }

        val recipe3 = findViewById<LinearLayout>(R.id.recipe_3)
        recipe3.setOnClickListener {
            val intent = Intent(this, food_desc_page_lf::class.java)
            startActivity(intent)
        }

        val recipe5 = findViewById<LinearLayout>(R.id.recipe_5)
        recipe5.setOnClickListener {
            val intent = Intent(this, food_desc_page_pb::class.java)
            startActivity(intent)
        }

        val recipe6 = findViewById<LinearLayout>(R.id.recipe_6)
        recipe6.setOnClickListener {
            val intent = Intent(this, food_desc_page::class.java)
            startActivity(intent)
        }

        val recipe7 = findViewById<LinearLayout>(R.id.recipe_7)
        recipe7.setOnClickListener {
            val intent = Intent(this, food_desc_page_lf::class.java)
            startActivity(intent)
        }

        val createNav = findViewById<LinearLayout>(R.id.nav_create)
        createNav.setOnClickListener {
            val intent = Intent(this, create_recipe_page::class.java)
            startActivity(intent)
        }
        val favoritesNav = findViewById<LinearLayout>(R.id.nav_favorites)
        favoritesNav.setOnClickListener {
            val intent = Intent(this, favorites_page::class.java)
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