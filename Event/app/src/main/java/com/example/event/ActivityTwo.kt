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

class ActivityTwo : AppCompatActivity(), View.OnClickListener {

    private lateinit var etAlas: EditText
    private lateinit var etTinggi: EditText
    private lateinit var tvHasil: TextView
    private lateinit var btnHitung: Button

    private val PREF_NAME = "Shared"
    private val KEY_NAME = "ResultCalc"
    private val KEY_ET_ONE = "etAlas"
    private val KEY_ET_TWO = "etTinggi"
    private lateinit var sharedPreference: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        val bundle: Bundle? = intent.extras
        val button_name = bundle?.get("button_name")
        Toast.makeText(applicationContext, "klik menu " + button_name.toString(), Toast.LENGTH_SHORT).show()

        etAlas = findViewById(R.id.etAlas)
        etTinggi = findViewById(R.id.etTinggi)
        tvHasil = findViewById(R.id.tvHasil)
        sharedPreference = getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)

        btnHitung = findViewById(R.id.btnHitung)
        btnHitung.setOnClickListener(this)

        val hasil = sharedPreference.getFloat(KEY_NAME, 0.0f)
        val etAlasRestore = sharedPreference.getString(KEY_ET_ONE, "")
        val etTinggiRestore = sharedPreference.getString(KEY_ET_TWO, "")
        tvHasil.text = hasil.toString()
        etAlas.setText(etAlasRestore)
        etTinggi.setText(etTinggiRestore)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        val editor: SharedPreferences.Editor = sharedPreference.edit()
        editor.putFloat(KEY_NAME, tvHasil.text.toString().toFloat())
        editor.putString(KEY_ET_ONE, etAlas.text.toString())
        editor.putString(KEY_ET_TWO, etTinggi.text.toString())
        editor.apply()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        val hasil = sharedPreference.getFloat(KEY_NAME, 0.0f)
        tvHasil.text = hasil.toString()
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnHitung -> {
                val nilai = etAlas.text.toString().toFloat() * etTinggi.text.toString().toFloat() * 1/2
                tvHasil.text = nilai.toString()
            }
        }
    }
}