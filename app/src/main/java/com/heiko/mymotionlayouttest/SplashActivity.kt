package com.heiko.mymotionlayouttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.heiko.mymotionlayouttest.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTransitionManagerGo.setOnClickListener {
            launcherActivity(TransitionManagerGoActivity::class.java)
        }
        binding.btnMotionLayout.setOnClickListener {
            launcherActivity(MotionLayoutActivity::class.java)
        }
        binding.btnMotionLayout2.setOnClickListener {
            launcherActivity(MotionLayout2Activity::class.java)
        }
        binding.btnMotionLayout3.setOnClickListener {
            launcherActivity(MotionLayout3Activity::class.java)
        }
        binding.btnYoutubeLike.setOnClickListener {
            launcherActivity(YoutubeLikeActivity::class.java)
        }
        binding.btnCoordinatorLayout.setOnClickListener {
            launcherActivity(CoordinatorLayoutActivity::class.java)
        }
        binding.btnCoordinatorLayout2.setOnClickListener {
            launcherActivity(CoordinatorLayout2Activity::class.java)
        }
        binding.btnNewUi.setOnClickListener {
            launcherActivity(NewUIActivity::class.java)
        }
    }

    private fun launcherActivity(clazz: Class<*>) {
        val intent = Intent(this, clazz)
        startActivity(intent)
    }
}