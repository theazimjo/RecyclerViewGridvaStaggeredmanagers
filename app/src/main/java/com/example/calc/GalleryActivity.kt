package com.example.calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.calc.databinding.ActivityGalleryBinding

class GalleryActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGalleryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGalleryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = listOf<Int>(
            R.drawable.alan,
            R.drawable.ed,
            R.drawable.charlie,
            R.drawable.egor,
            R.drawable.eminem,
            R.drawable.enqirue,
            R.drawable.justin,
            R.drawable.alan,
            R.drawable.ed,
            R.drawable.charlie,
            R.drawable.egor,
            R.drawable.eminem,
            R.drawable.enqirue,
            R.drawable.justin,
        )

        val galleryAdapter = GalleryAdapter(list)
        val myManager = StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL)

        binding.recyclerview.apply {
            adapter = galleryAdapter
            layoutManager = myManager
        }

        galleryAdapter.setListener(object : RecyclerViewListener {
            override fun onitemClick(position: Int) {
//                Toast.makeText(this@GalleryActivity, "$position Clicked", Toast.LENGTH_SHORT).show()
                Intent(this@GalleryActivity, ImageViewActivity::class.java).apply {
                    putExtra("image", list[position])
                    startActivity(this)
                }
            }
        })
    }
}