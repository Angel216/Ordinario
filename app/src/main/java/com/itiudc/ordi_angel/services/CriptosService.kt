package com.itiudc.ordi_angel.services

import com.itiudc.ordi_angel.api.CriptosResponse
import com.itiudc.ordi_angel.api.apicriptos
import com.itiudc.ordi_angel.models.CriptosModel
import retrofit2.http.GET

interface CriptosService {
    @GET("assets")
    suspend fun getCriptos(): CriptosResponse<MutableList<CriptosModel>>
}

var criptosServices: CriptosService = apicriptos.create<CriptosService>(CriptosService::class.java)