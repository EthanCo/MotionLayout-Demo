package com.heiko.mymotionlayouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.heiko.mymotionlayouttest.databinding.ActivityYoutubeLikeBinding

class YoutubeLikeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityYoutubeLikeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYoutubeLikeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}