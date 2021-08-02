package com.podium.userinteractionv2

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text1: TextView = findViewById(R.id.textView)
        val text2: TextView = findViewById(R.id.textView2)
        val btn1: Button = findViewById(R.id.button4)
        btn1.setOnClickListener {
            text1.setBackgroundColor(Color.RED)
            text2.setBackgroundColor(Color.RED)
        }
    }
}