package com.example.event

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ActivityThree : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        val bundle: Bundle? = intent.extras
        val button_name = bundle?.get("button_name")
        Toast.makeText(applicationContext, "klik menu " + button_name.toString(), Toast.LENGTH_SHORT).show()
    }
}