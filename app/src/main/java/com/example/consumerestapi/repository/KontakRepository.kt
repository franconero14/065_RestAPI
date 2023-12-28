package com.example.consumerestapi.repository

import com.example.consumerestapi.model.Kontak
import com.example.consumerestapi.network.KontakService

interface KontakRepository {
    suspend fun getKontak(): List<Kontak>
    suspend fun insertKontak(kontak: Kontak)
}

class NetworkKontakRepository(
    private val kontakApiService: KontakService
) : KontakRepository {
    override suspend fun getKontak(): List<Kontak> =
        kontakApiService.getKontak()

    override suspend fun insertKontak(kontak: Kontak) {
        kontakApiService.insertKontak(kontak)
    }
}