package com.heiko.mymotionlayouttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.heiko.mymotionlayouttest.databinding.ActivitySplashBinding

/**
 * 具体详见
 * https://developer.android.google.cn/training/constraint-layout/motionlayout/examples?hl=zh_cn
 * https://blog.csdn.net/u013762572/article/details/90347011
 *
 * 官方示例:
 * https://github.com/android/views-widgets-samples/tree/master/ConstraintLayoutExamples
 */
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