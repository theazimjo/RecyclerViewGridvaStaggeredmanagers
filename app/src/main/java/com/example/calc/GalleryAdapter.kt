package com.example.calc

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.calc.databinding.ItemGalleryLayoutBinding

class GalleryAdapter(val imageList: List<Int>) : Adapter<GalleryAdapter.MyGalleryViewholder>() {

    private var recyclerViewListener: RecyclerViewListener? = null

    inner class MyGalleryViewholder(val binding: ItemGalleryLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.root.setOnClickListener {
                recyclerViewListener?.onitemClick(adapterPosition)
            }
        }

        fun bind(imageId: Int) {
            binding.imageView.setImageResource(imageId)
        }
    }

    fun setListener(listener: RecyclerViewListener) {
        recyclerViewListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyGalleryViewholder {
        return MyGalleryViewholder(
            ItemGalleryLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    override fun onBindViewHolder(holder: MyGalleryViewholder, position: Int) {
        holder.bind(imageList[position])
    }
}