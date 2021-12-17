package com.itiudc.ordi_angel.services

import com.itiudc.ordi_angel.api.JokeResponse
import com.itiudc.ordi_angel.api.apijoke
import retrofit2.http.GET

interface JokeService {
    @GET("random")
    suspend fun getJoke(): JokeResponse
}

var jokeServices: JokeService = apijoke.create<JokeService>(JokeService::class.java)