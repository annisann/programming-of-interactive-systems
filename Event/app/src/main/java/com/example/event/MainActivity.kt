package com.example.event

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val btn1Name: String = "segitiga"
    private val btn2Name: String = "lingkaran"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnMenu1).setOnClickListener {
            intent = Intent(this, ActivityTwo::class.java)
            intent.putExtra("button_name", btn1Name)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnMenu2).setOnClickListener {
            intent= Intent(this, ActivityThree::class.java)
            intent.putExtra("button_name", btn2Name)
            startActivity(intent)
        }
    }
}