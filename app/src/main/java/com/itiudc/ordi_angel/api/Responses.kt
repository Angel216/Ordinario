package com.itiudc.ordi_angel.api

import com.itiudc.ordi_angel.models.CriptosModel
import com.itiudc.ordi_angel.models.JokeModel

class CriptosResponse<T>(
    val data: ArrayList<CriptosModel>
){
}

class JokeResponse(
    val value: String,
){
}
