package com.heiko.mymotionlayouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.widget.MotionLayout

class MotionLayout2Activity : AppCompatActivity() {
    private lateinit var motionLayout: MotionLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motion_layout_2)

        motionLayout = findViewById(R.id.motion_layout)
        //layoutDerection = motionLayout.layoutDirection
    }
}