package com.example.consumerestapi.ui.home.viewmodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.consumerestapi.KontakAplication
import com.example.consumerestapi.ui.home.viewmodel.HomeViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory {

//        initializer {
//            MarsViewModel(apkikasiMars().container.marsPhotosRepository)
//        }
        initializer {
            HomeViewModel(aplikasiMars().container.kontakRepository)
        }

    }
}

fun CreationExtras.aplikasiMars(): KontakAplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY]as KontakAplication)