package com.itiudc.ordi_angel.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.itiudc.ordi_angel.models.JokeModel
import com.itiudc.ordi_angel.services.jokeServices
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class JokeViewModel : ViewModel() {
    private var _joke: String = ""
    val joke: String
        get() = _joke

    init {
        viewModelScope.launch {
            _joke = fetch()
        }
    }

    private suspend fun fetch(): String{
        return withContext(Dispatchers.IO){
            val joke: String = jokeServices.getJoke().value
            joke
        }
    }

    fun cambiarJoke(){
        viewModelScope.launch {
            _joke = fetch()
        }
    }
}