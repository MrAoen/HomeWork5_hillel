package com.example.homework5_hillel

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardView = findViewById<CardView>(R.id.cardView)
        cardView.setOnClickListener {
            Toast.makeText(this, getString(R.string.notImplemented), Toast.LENGTH_SHORT).show()
        }
    }
}