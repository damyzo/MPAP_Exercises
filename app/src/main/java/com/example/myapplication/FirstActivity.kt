package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val usernameControl = findViewById<TextView>(R.id.username)
        val bundle: Bundle? = intent.extras
        val backButton: Button = findViewById(R.id.backButton)
        if(bundle != null){
            val username = bundle.get("UserName")
            usernameControl.text = String.format("%s %s", "Hello", username.toString())
        }

        backButton.setOnClickListener(){
            val backIntent = Intent(this, MainActivity::class.java)

            startActivity(backIntent)
        }


    }
}