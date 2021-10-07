package com.example.learnintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<EditText>(R.id.username)
        val email = findViewById<EditText>(R.id.email)
        val phoneNumber = findViewById<EditText>(R.id.phone_number)
        val loginButton = findViewById<Button>(R.id.login_button)

        // handle button click
        loginButton.setOnClickListener{
            // get text from edit text
            val username = name.text.toString()
            val emailUser = email.text.toString()
            val phoneNumberUser = phoneNumber.text.toString()

            // intent to start action
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra("Username", username)
            intent.putExtra("Email", emailUser)
            intent.putExtra("Phone Number", phoneNumberUser)
            startActivity(intent)
        }
    }
}