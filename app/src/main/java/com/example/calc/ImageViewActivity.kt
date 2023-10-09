package com.example.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calc.databinding.ActivityImageViewBinding

class ImageViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityImageViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val imageId = intent.getIntExtra("image", R.drawable.alan)

        binding.imageView2.setImageResource(imageId)
    }
}