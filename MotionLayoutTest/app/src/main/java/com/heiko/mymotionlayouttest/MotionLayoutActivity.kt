package com.heiko.mymotionlayouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.motion.widget.MotionLayout

class MotionLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motion_layout)

        var motionLayout = findViewById<MotionLayout>(R.id.motionLayout)
        var btnToggle = findViewById<Button>(R.id.btn_toggle)
        btnToggle.setOnClickListener {
            if (motionLayout.progress <= 0) {
                motionLayout.transitionToEnd()
            } else {
                motionLayout.transitionToStart()
            }
        }
    }
}