package com.example.consumerestapi.ui.home.viewmodel

import androidx.lifecycle.ViewModel
import com.example.consumerestapi.model.Kontak
import com.example.consumerestapi.repository.KontakRepository

class InsertViewModel(private val kontakRepository: KontakRepository) : ViewModel(){}

data class InsertUiEvent(
    val id: Int = 0,
    val nama: String = "",
    val alamat: String = "",
    val nohp: String = ""
)

fun InsertUiEvent.toKontak() : Kontak = Kontak(
    id = id,
    nama = nama,
    alamat = alamat,
    nohp = nohp,
)