package com.itiudc.ordi_angel.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.itiudc.ordi_angel.databinding.CriptomonedaListItemBinding
import com.itiudc.ordi_angel.models.CriptosModel

class CriptosListAdapter(private val criptosList: List<CriptosModel>) : RecyclerView.Adapter<CriptosListAdapter.ViewHolder>(){
    inner class ViewHolder(private val binding: CriptomonedaListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(cripto: CriptosModel) {
            binding.criptoName.text = cripto.name
            binding.criptoPrecio.text = cripto.priceUsd.toString()
            binding.criptoPorcentaje.text = cripto.changePercent24Hr+"%"
            binding.criptoSymbol.text = "Symbol: "+cripto.symbol
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = CriptomonedaListItemBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(criptosList[position])
    }

    override fun getItemCount(): Int {
        return criptosList.count()
    }
}