package com.example.viewmodel_livedata

import android.provider.ContactsContract
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class VMDataMhs : ViewModel() {
    var dataMhs = mutableListOf<DataMhs>()
    var liveDataMhs = MutableLiveData<List<DataMhs>>()

    init {
        dataMhs.add(DataMhs("Annisa", "175150200111068", "PSI-B"))
    }

    fun getData() : LiveData<List<DataMhs>> {
        liveDataMhs.value = dataMhs
        return liveDataMhs
    }

    fun addData(newData: DataMhs){
        dataMhs.add(newData)
        liveDataMhs.value = dataMhs
    }

}