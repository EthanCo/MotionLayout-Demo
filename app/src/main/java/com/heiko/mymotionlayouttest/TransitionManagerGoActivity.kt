package com.heiko.mymotionlayouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.*
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class TransitionManagerGoActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var img01: ImageView
    private var toggle = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transition_manager_go)
        bindData()
    }

    override fun onClick(v: View) {
        val root = findViewById<ViewGroup>(R.id.root)
        val startScene = Scene.getSceneForLayout(root, R.layout.activity_transition_manager_go, this)
        val endScene = Scene.getSceneForLayout(root, R.layout.activity_main_end, this)
        if (toggle) {
            TransitionManager.go(endScene, ChangeBounds())
        } else {
            TransitionManager.go(startScene, ChangeBounds())
        }

        bindData() //需要重新设置点击事件，因为在动画开始的一瞬间，原来的View已经从布局中移除
        toggle = !toggle
    }

    private fun bindData() {
        img01 = findViewById(R.id.img_01)
        img01.setOnClickListener(this)
    }
}