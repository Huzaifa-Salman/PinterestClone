package com.example.pinterestclone

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var welcomeTextView: TextView  // Declare the TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)  // Ensure this matches your layout file name

        welcomeTextView = findViewById(R.id.welcomeTextView)  // Initialize the TextView

        // Assuming you're passing the email via intent
        val email = intent.getStringExtra("EMAIL")
        welcomeTextView.text = "Welcome, $email!"  // Set text to the TextView
    }
}

