package com.zyhang.damon.example

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by zyhang on 2018/8/10.10:30
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun single(view: View) {
        startActivity(Intent(this, SinglePresenterActivity::class.java))
    }

    fun multi(view: View) {
        startActivity(Intent(this, MultiPresenterActivity::class.java))
    }
}