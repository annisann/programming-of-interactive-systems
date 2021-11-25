package com.example.viewmodel_livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProvider(this).get(VMDataMhs::class.java)
        val adapter = AdapterDataMhs(viewModel.getData())
        val rv = findViewById<RecyclerView>(R.id.rvData)
        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(this)

        btnSimpan.setOnClickListener{
            viewModel.addData(DataMhs(etName.text.toString(), etNim.text.toString(), etClass.text.toString()))
            adapter.notifyDataSetChanged()
            Toast.makeText(applicationContext, "Menambahkan data berhasil.", Toast.LENGTH_SHORT).show()
        }

    }
}