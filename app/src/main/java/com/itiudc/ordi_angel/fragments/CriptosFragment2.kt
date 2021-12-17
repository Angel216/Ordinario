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
import com.itiudc.ordi_angel.models.CriptosModel
import com.itiudc.ordi_angel.viewModels.criptosViewModel

class CriptosFragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val CriptosViewModel = ViewModelProvider(this).get(criptosViewModel::class.java)
        val binding = FragmentCriptos2Binding.inflate(inflater, container, false)

        CriptosViewModel.criptomonedas.observe(viewLifecycleOwner, Observer<MutableList<CriptosModel>>{
                criptos ->
            val adapter = CriptosListAdapter(criptos)

            binding.recyclerCriptosList.layoutManager = LinearLayoutManager(requireActivity())
            binding.recyclerCriptosList.adapter = adapter
        })

        return binding.root
    }
}