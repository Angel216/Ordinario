package com.itiudc.ordi_angel.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.itiudc.ordi_angel.R
import com.itiudc.ordi_angel.adapters.CriptosListAdapter
import com.itiudc.ordi_angel.databinding.FragmentCriptos2Binding
import com.itiudc.ordi_angel.databinding.FragmentJokeBinding
import com.itiudc.ordi_angel.models.CriptosModel
import com.itiudc.ordi_angel.viewModels.JokeViewModel
import com.itiudc.ordi_angel.viewModels.criptosViewModel

class Joke : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val JokeViewModel = ViewModelProvider(this).get(JokeViewModel::class.java)
        val binding = FragmentJokeBinding.inflate(inflater, container, false)

        binding.joke.text = JokeViewModel.joke
        
        return binding.root
    }
}