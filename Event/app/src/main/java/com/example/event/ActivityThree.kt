package com.example.event

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class ActivityThree : AppCompatActivity(), View.OnClickListener {

    private lateinit var etRadius: EditText
    private lateinit var tvHasil: TextView
    private lateinit var btnHitung: Button

    private val PREF_NAME = "Shared"
    private val KEY_NAME = "ResultCalc"
    private val KEY_ET_ONE = "etRadius"
    private lateinit var sharedPreference: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        val bundle: Bundle? = intent.extras
        val button_name = bundle?.get("button_name")
        Toast.makeText(applicationContext, "klik menu " + button_name.toString(), Toast.LENGTH_SHORT).show()

        etRadius = findViewById(R.id.etRadius)
        tvHasil = findViewById(R.id.tvHasil2)
        sharedPreference = getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)

        btnHitung = findViewById(R.id.btnHitung2)
        btnHitung.setOnClickListener(this)

        val hasil = sharedPreference.getFloat(KEY_NAME, 0.0f)
        val etRadiusRestore = sharedPreference.getString(KEY_ET_ONE, "")
        tvHasil.text = hasil.toString()
        etRadius.setText(etRadiusRestore)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        val editor: SharedPreferences.Editor = sharedPreference.edit()
        editor.putFloat(KEY_NAME, tvHasil.text.toString().toFloat())
        editor.putString(KEY_ET_ONE, etRadius.text.toString())
        editor.apply()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        val hasil = sharedPreference.getFloat(KEY_NAME, 0.0f)
        tvHasil.text = hasil.toString()
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnHitung2 -> {
                val nilai = 3.14 * etRadius.text.toString().toFloat() * etRadius.text.toString().toFloat()
                tvHasil.text = nilai.toString()
            }
        }
    }
}