package com.example.viewmodel_livedata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class AdapterDataMhs (val datamhs: LiveData<List<DataMhs>>) : RecyclerView.Adapter<AdapterDataMhs.TodoViewHolder>(){

    inner class TodoViewHolder(items: View) : RecyclerView.ViewHolder(items)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TodoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.data, parent, false)
        return TodoViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterDataMhs.TodoViewHolder, position: Int) {
        holder.itemView.apply {
            val namaMhs = findViewById<TextView>(R.id.tvName)
            val nimMhs = findViewById<TextView>(R.id.tvNim)
            val kelasMhs = findViewById<TextView>(R.id.tvClass)

            namaMhs.text = datamhs.value?.get(position)?.name?: ""
            nimMhs.text = datamhs.value?.get(position)?.nim?: ""
            kelasMhs.text = datamhs.value?.get(position)?.kelas?: ""
        }
    }

    override fun getItemCount(): Int {
        return datamhs.value?.size?:0
    }

}