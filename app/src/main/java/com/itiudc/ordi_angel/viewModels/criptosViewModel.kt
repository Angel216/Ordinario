package com.itiudc.ordi_angel.viewModels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.itiudc.ordi_angel.models.CriptosModel
import com.itiudc.ordi_angel.services.criptosServices
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class criptosViewModel : ViewModel() {
    private var _criptos = MutableLiveData<MutableList<CriptosModel>>()
    val criptomonedas: LiveData<MutableList<CriptosModel>>
        get() = _criptos

    init {
        viewModelScope.launch {
            _criptos.value = fetch()
        }
    }
    private suspend fun fetch(): MutableList<CriptosModel>{
        return withContext(Dispatchers.IO){
            val criptomonedas: MutableList<CriptosModel> = criptosServices.getCriptos().data
            criptomonedas
        }
    }
}