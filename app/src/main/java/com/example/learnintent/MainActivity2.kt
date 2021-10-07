package com.example.learnintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //get data from intent
        var intent = intent
        val name = intent.getStringExtra("Username")
        val email = intent.getStringExtra("Email")
        val phoneNumber = intent.getStringExtra("Phone Number")

        // text view
        val userInformation = findViewById<TextView>(R.id.result)
        //set Text
        userInformation.text = "Name: "+ name+"\nEmail: "+email+"\nPhone Number: "+phoneNumber
    }
}