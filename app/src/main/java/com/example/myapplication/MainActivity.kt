package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.provider.ContactsContract
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener(){
            val intent = Intent(Intent.ACTION_VIEW, ContactsContract.Contacts.CONTENT_URI)


        }



    }



}
