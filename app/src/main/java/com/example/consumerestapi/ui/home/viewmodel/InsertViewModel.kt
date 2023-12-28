package com.example.consumerestapi.ui.home.viewmodel

import androidx.lifecycle.ViewModel
import com.example.consumerestapi.repository.KontakRepository

class InsertViewModel(private val kontakRepository: KontakRepository) : ViewModel(){}

data class InsertUiEvent(
    val id: Int = 0,
    val nama: String = "",
    val alamat: String = "",
    val nohp: String = ""
)