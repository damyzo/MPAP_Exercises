package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.provider.ContactsContract
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstButton: Button = findViewById(R.id.firstButton)
        val nameControl: TextView = findViewById(R.id.name)
        val implicitButton: Button = findViewById(R.id.implicitButton)

        firstButton.setOnClickListener(){
            val firstIntent = Intent(this, FirstActivity::class.java)
            val nameValue = nameControl.text
            firstIntent.putExtra("UserName",nameValue)
            startActivity(firstIntent)
        }

        implicitButton.setOnClickListener(){
            val secondIntent = Intent(Intent.ACTION_VIEW)

            secondIntent.data = Uri.parse("https://www.javatpoint.com/")

            startActivity(secondIntent)

        }


    }



//    override fun onStart() {
//        super.onStart()
//        Log.println(Log.VERBOSE,"V", "On Start")
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Log.println(Log.VERBOSE,"V", "On Resume")
//
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Log.println(Log.VERBOSE,"V", "On Pause")
//
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Log.println(Log.VERBOSE,"V", "On Stop")
//
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.println(Log.VERBOSE,"V", "On Destroy")
//
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//        Log.println(Log.VERBOSE,"V", "On Restart")
//
//    }



}
