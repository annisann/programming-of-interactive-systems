package com.example.viewmodel_livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class VMDataMhs : ViewModel() {
    var mhsList = mutableListOf<DataMhs>()
    var liveDataMhs = MutableLiveData<List<DataMhs>>()

    init {
        mhsList.add(DataMhs("Annisa", "175150200111068", "PSI-B"))
    }

    fun getData() : LiveData<List<DataMhs>> {
        liveDataMhs.value = mhsList
        return liveDataMhs
    }

    fun addData(newData: DataMhs){
        mhsList.add(newData)
        liveDataMhs.value = mhsList
    }

}