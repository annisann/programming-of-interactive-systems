package com.example.uiwidget

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragOne = FragFirst()
        val fragTwo = FragSec()

        findViewById<ImageButton>(R.id.charImage).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_main, fragOne)
                .commit()
        }

        findViewById<Button>(R.id.characteristicButton).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_main, fragTwo)
                .commit()
        }
    }


//    override fun onStart() {
//        super.onStart()
//        findViewById<TextView>(R.id.hello).setText("onStart")
//        Log.i("Annisa", "method onStart()")
//    }
//
//    override fun onResume() {
//        super.onResume()
//        findViewById<TextView>(R.id.hello).setText("onResume")
//        Log.i("Annisa", "method onResume()")
//    }
//
//    override fun onPause() {
//        super.onPause()
//        tv_onpause.text = "paused"
//        findViewById<TextView>(R.id.hello).setText("onPause")
//        Log.i("Annisa", "method onPause")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        findViewById<TextView>(R.id.hello).setText("onStop")
//        Log.i("Annisa", "method onStop")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        findViewById<TextView>(R.id.hello).text = "onDestroy"
//        Log.i("Annisa", "method onDestroy")
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//        Log.i("Annisa", "method onRestart")
//    }
}