package com.example.myapplication

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class create_recipe_page : AppCompatActivity() {
    private val IMAGE_PICK_CODE = 1001
    private val VIDEO_PICK_CODE = 1002
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_create_recipe_page)

        //Step 2 logics
        val descInput = findViewById<EditText>(R.id.desc_input)
        val charCount1 = findViewById<TextView>(R.id.char_count)
        val maxChars1 = 10000

        descInput.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val remaining = maxChars1 - (s?.length ?: 0)
                charCount1.text = "$remaining characters left"
            }
            override fun afterTextChanged(s: Editable?) {}
        })

        val spinner1 = findViewById<Spinner>(R.id.category_spinner)

        val categories1 = listOf(
            "Staple",
            "Drinks",
            "Desserts",
            "Side Dishes",
            "Main Dishes",
        )

        val adapter1 = object : ArrayAdapter<String>(
            this,
            android.R.layout.simple_spinner_item,
            categories1
        ) {
            override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
                val view = super.getView(position, convertView, parent)
                (view as TextView).setTextColor(Color.WHITE)
                return view
            }

            override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
                val view = super.getDropDownView(position, convertView, parent)
                (view as TextView).setTextColor(Color.GRAY)
                return view
            }
        }

        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner1.adapter = adapter1

        //Step 3 logics
//        val spinner2 = findViewById<Spinner>(R.id.unit_spinner)
//
//        val categories2 = listOf(
//            "cup",
//            "tsp",
//            "tbsp",
//            "L",
//            "gal",
//            "mL",
//            "mg",
//            "g",
//            "kg",
//            "oz",
//            "lb",
//            "in",
//            "cm",
//            "mm"
//        )
//
//        val adapter2 = object : ArrayAdapter<String>(
//            this,
//            android.R.layout.simple_spinner_item,
//            categories2
//        ) {
//            override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//                val view = super.getView(position, convertView, parent)
//                (view as TextView).setTextColor(Color.WHITE)
//                return view
//            }
//
//            override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
//                val view = super.getDropDownView(position, convertView, parent)
//                (view as TextView).setTextColor(Color.GRAY)
//                return view
//            }
//        }
//
//        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        spinner2.adapter = adapter2

        //Step 4 logics
        val equipmentsInput = findViewById<EditText>(R.id.equipments_input)
        val charCount2 = findViewById<TextView>(R.id.char_count2)
        val maxChars2 = 10000

        equipmentsInput.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val remaining = maxChars2 - (s?.length ?: 0)
                charCount2.text = "$remaining characters left"
            }
            override fun afterTextChanged(s: Editable?) {}
        })

        //Step 5 logics
        val btnUploadImage = findViewById<Button>(R.id.btn_upload_image)
        val imagePreview = findViewById<android.widget.ImageView>(R.id.image_preview)

        btnUploadImage.setOnClickListener {
            val intent = Intent(Intent.ACTION_PICK)
            intent.type = "image/*"
            startActivityForResult(intent, IMAGE_PICK_CODE)
        }

        val btnUploadVideo = findViewById<Button>(R.id.btn_upload_video)
        val videoPreview = findViewById<android.widget.VideoView>(R.id.video_preview)

        btnUploadVideo.setOnClickListener {
            val intent = Intent(Intent.ACTION_PICK)
            intent.type = "video/*"
            startActivityForResult(intent, VIDEO_PICK_CODE)
        }



        val btnGetStarted = findViewById<Button>(R.id.btn_next_1)
        val btnStep1Page = findViewById<Button>(R.id.btn_next_2)
        val btnStep2Page = findViewById<Button>(R.id.btn_next_3)
        val btnStep3Page = findViewById<Button>(R.id.btn_next_4)
        val btnStep4Page = findViewById<Button>(R.id.btn_next_5)
        val container1 = findViewById<ConstraintLayout>(R.id.mainContainer1)
        val container2 = findViewById<ConstraintLayout>(R.id.mainContainer2)
        val container3 = findViewById<ConstraintLayout>(R.id.mainContainer3)
        val container4 = findViewById<ConstraintLayout>(R.id.mainContainer4)
        val container5 = findViewById<ConstraintLayout>(R.id.mainContainer5)
        val container6 = findViewById<ConstraintLayout>(R.id.mainContainer6)

        btnGetStarted.setOnClickListener {
            container1.visibility = View.GONE
            container2.visibility = View.VISIBLE
        }
        btnStep1Page.setOnClickListener {
            container2.visibility = View.GONE
            container3.visibility = View.VISIBLE
        }
        btnStep2Page.setOnClickListener {
            container3.visibility = View.GONE
            container4.visibility = View.VISIBLE
        }
        btnStep3Page.setOnClickListener {
            container4.visibility = View.GONE
            container5.visibility = View.VISIBLE
        }
        btnStep4Page.setOnClickListener {
            container5.visibility = View.GONE
            container6.visibility = View.VISIBLE
        }

        val doneBtn = findViewById<Button>(R.id.btn_next_6)
        doneBtn.setOnClickListener {
            val intent = Intent(this, home_page::class.java)
            startActivity(intent)
        }

//        val homeNav = findViewById<LinearLayout>(R.id.nav_home)
//        homeNav.setOnClickListener {
//            val intent = Intent(this, home_page::class.java)
//            startActivity(intent)
//        }
//        val favoritesNav = findViewById<LinearLayout>(R.id.nav_favorites)
//        favoritesNav.setOnClickListener {
//            val intent = Intent(this, favorites_page::class.java)
//            startActivity(intent)
//        }
//        val profileNav = findViewById<LinearLayout>(R.id.nav_profile)
//        profileNav.setOnClickListener {
//            val intent = Intent(this, profile_page::class.java)
//            startActivity(intent)
//        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == IMAGE_PICK_CODE && resultCode == RESULT_OK) {
            val imageUri = data?.data
            val imagePreview = findViewById<android.widget.ImageView>(R.id.image_preview)
            imagePreview.setImageURI(imageUri)
            imagePreview.visibility = View.VISIBLE
        }

        if (requestCode == VIDEO_PICK_CODE && resultCode == RESULT_OK) {
            val videoUri = data?.data
            val videoPreview = findViewById<android.widget.VideoView>(R.id.video_preview)
            videoPreview.setVideoURI(videoUri)
            videoPreview.visibility = View.VISIBLE
            videoPreview.start()
        }
    }
}