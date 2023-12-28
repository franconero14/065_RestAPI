package com.example.consumerestapi.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Kontak(
    val id:Int,
    val nama: String,
    @SerialName(value = "")
    val alamat: String,
    @SerialName(value = "telpon")
    val nohp:String
)
