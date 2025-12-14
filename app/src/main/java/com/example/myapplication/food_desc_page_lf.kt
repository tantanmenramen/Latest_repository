package com.example.myapplication

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.imageview.ShapeableImageView

class food_desc_page_lf : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_food_desc_page_lf)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //ingredients list dynamic
        val ingredients = listOf(
            "10 egg yolks",
            "1 can (300 ml) sweetened condensed milk",
            "1 can (370 ml) evaporated milk",
            "1 cup white sugar (for caramel)",
            "1 teaspoon vanilla extract"
        )

        val ingredientList = findViewById<LinearLayout>(R.id.ingredientList)

        for (item in ingredients) {
            val bulletItem = TextView(this)
            bulletItem.text = "• $item"
            bulletItem.textSize = 16f
            bulletItem.setTextColor(Color.parseColor("#333333"))
            bulletItem.setPadding(0, 8, 0, 8) // adds vertical spacing
            ingredientList.addView(bulletItem)
        }

        //equipment list dynamic
        val equipments = listOf(
            "Llanera",
            "Mixing bowls",
            "Strainer",
            "Aluminum foil"
        )

        val equipmentsList = findViewById<LinearLayout>(R.id.equipmentList)

        for (item in equipments) {
            val bulletItem2 = TextView(this)
            bulletItem2.text = "• $item"
            bulletItem2.textSize = 16f
            bulletItem2.setTextColor(Color.parseColor("#333333"))
            bulletItem2.setPadding(0, 8, 0, 8) // adds vertical spacing
            equipmentsList.addView(bulletItem2)
        }

        //direction list dynamic
        val directions = listOf(
            "Heat sugar in a pan over low heat until it melts and turns golden brown.",
            "Quickly pour the caramel into llaneras (flan molds) and spread evenly. Set aside.",
            "In a bowl, whisk egg yolks gently (avoid too much foam).\n" +
                    "\n" +
                    "Add condensed milk, evaporated milk, and vanilla extract. Mix until smooth."
        )

        val directionList = findViewById<LinearLayout>(R.id.directionList)

        for (item in directions) {
            val bulletItem3 = TextView(this)
            bulletItem3.text = "• $item"
            bulletItem3.textSize = 16f
            bulletItem3.setTextColor(Color.parseColor("#333333"))
            bulletItem3.setPadding(0, 8, 0, 8) // adds vertical spacing
            directionList.addView(bulletItem3)
        }

        //mp4 video logic
        val videoView = findViewById<VideoView>(R.id.videoView)
        val videoPath = "android.resource://${packageName}/${R.raw.sample_video}"
        videoView.setVideoURI(Uri.parse(videoPath))

        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)

        videoView.start()

        val profilePic = findViewById<ShapeableImageView>(R.id.profile_picture)
        profilePic.setOnClickListener {
            val intent = Intent(this, profile_page::class.java)
            startActivity(intent)
        }
        val homeNav = findViewById<LinearLayout>(R.id.nav_home)
        homeNav.setOnClickListener {
            val intent = Intent(this, home_page::class.java)
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