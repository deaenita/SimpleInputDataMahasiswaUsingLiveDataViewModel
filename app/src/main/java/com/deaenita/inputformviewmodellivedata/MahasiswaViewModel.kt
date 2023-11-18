package com.deaenita.inputformviewmodellivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MahasiswaViewModel : ViewModel() {

    private val _nama = MutableLiveData<String>()
    private val _nim = MutableLiveData<String>()
    private val _kelas = MutableLiveData<String>()

    val nama: LiveData<String>
        get() = _nama

    val nim: LiveData<String>
        get() = _nim

    val kelas: LiveData<String>
        get() = _kelas

    fun simpanData(nama: String, nim: String, kelas: String) {
        _nama.value = nama
        _nim.value = nim
        _kelas.value = kelas
    }
}
