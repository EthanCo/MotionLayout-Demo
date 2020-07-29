package com.heiko.mymotionlayouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.heiko.mymotionlayouttest.databinding.ActivityNewUiBinding

class NewUIActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNewUiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewUiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCustom.setOnClickListener {
            if (binding.motionLayout.progress <= 0) {
                binding.motionLayout.transitionToEnd()
            } else {
                binding.motionLayout.transitionToStart()
            }
        }
    }
}