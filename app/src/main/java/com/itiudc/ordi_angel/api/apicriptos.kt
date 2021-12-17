package com.itiudc.ordi_angel.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

var apicriptos =
    Retrofit
        .Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://api.coincap.io/v2/")
        .build()