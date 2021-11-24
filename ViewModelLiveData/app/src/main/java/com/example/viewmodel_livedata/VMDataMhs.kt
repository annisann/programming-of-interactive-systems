package com.example.viewmodel_livedata

class VMDataMhs {
    var mhsList = mutableListOf<DataMhs>()
    init {
        mhsList.add(DataMhs("Annisa", "175150200111068", "PSI-B"))
    }

    fun getData() = mhsList

    fun addData(newData: DataMhs){
        mhsList.add(newData)
    }
}