package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class profile_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val homeNav = findViewById<LinearLayout>(R.id.nav_home)
        homeNav.setOnClickListener {
            val intent = Intent(this, home_page::class.java)
            startActivity(intent)
        }
        val favoritesNav = findViewById<LinearLayout>(R.id.nav_favorites)
        favoritesNav.setOnClickListener {
            val intent = Intent(this, favorites_page::class.java)
            startActivity(intent)
        }
        val createNav = findViewById<LinearLayout>(R.id.nav_create)
        createNav.setOnClickListener {
            val intent = Intent(this, create_recipe_page::class.java)
            startActivity(intent)
        }
        val editProfileButton = findViewById<Button>(R.id.btn_edit_profile)
        editProfileButton.setOnClickListener {
            val intent = Intent(this, edit_profile_page::class.java)
            startActivity(intent)
        }
        val favoritesButton = findViewById<Button>(R.id.btn_favorite_recipes)
        favoritesButton.setOnClickListener {
            val intent = Intent(this, favorites_page::class.java)
            startActivity(intent)
        }
        val uploadedRecipesButton = findViewById<Button>(R.id.btn_uploaded_recipes)
        uploadedRecipesButton.setOnClickListener {
            val intent = Intent(this, uploaded_recipes::class.java)
            startActivity(intent)
        }
        val logoutButton = findViewById<Button>(R.id.btn_logout)
        logoutButton.setOnClickListener {
            val intent = Intent(this, login_page::class.java)
            startActivity(intent)
        }
        val deleteButton = findViewById<Button>(R.id.btn_delete_account)
        deleteButton.setOnClickListener {
            val intent = Intent(this, login_page::class.java)
            startActivity(intent)
        }
    }
}