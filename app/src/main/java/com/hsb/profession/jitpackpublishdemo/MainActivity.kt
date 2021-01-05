package com.hsb.profession.jitpackpublishdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hsb.profession.mylibrary.FullscreenActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_skip.setOnClickListener {
            FullscreenActivity.start(this)
        }
    }
}