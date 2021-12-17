package com.itiudc.ordi_angel.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

var apijoke =
    Retrofit
        .Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl("https://api.chucknorris.io/jokes/")
        .build()