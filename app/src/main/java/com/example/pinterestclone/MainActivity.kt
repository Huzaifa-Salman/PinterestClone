package com.example.pinterestclone

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.welcome)  // yeh welcome.xml ko set karega

        // Email input aur button ko findViewById se link kar rahe hain
        val emailInput = findViewById<EditText>(R.id.email)
        val loginButton = findViewById<Button>(R.id.loginButton)

        // Login button pr click listener lagayenge
        loginButton.setOnClickListener {
            val email = emailInput.text.toString().trim()

            // Email ko check karenge
            if (email.isNotEmpty()) {
                // Email correct hai to LoginActivity (login.xml) par redirect karein
                val intent = Intent(this, LoginActivity::class.java)
                intent.putExtra("EMAIL", email)  // Email ko next activity me bhejenge
                startActivity(intent)
            } else {
                // Agar email khali ho to error message show karain
                Toast.makeText(this, "Please enter your email address", Toast.LENGTH_SHORT).show()
            }
        }
    }
}


