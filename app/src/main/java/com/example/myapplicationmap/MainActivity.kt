package com.example.myapplicationmap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeActivity()
    }

    private fun changeActivity() {
        Handler().postDelayed({
            val intent = Intent(this, MainActivityStart::class.java)
            startActivity(intent)
        }, 1200L)
    }
}