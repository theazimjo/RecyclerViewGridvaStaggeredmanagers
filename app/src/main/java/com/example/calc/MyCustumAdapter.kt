package com.example.calc

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.calc.databinding.ItemListLayoutBinding

class MyCustumAdapter(val list: List<String>) : Adapter<MyCustumAdapter.MyViewholder>() {
    inner class MyViewholder(val binding: ItemListLayoutBinding) : ViewHolder(binding.root) {
        fun bind(title: String) {
            binding.title.text = title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewholder {
        val binding =
            ItemListLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewholder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewholder, position: Int) {
        val title = list[position]
        holder.bind(title)
    }
}