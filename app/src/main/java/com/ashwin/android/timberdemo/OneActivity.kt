package com.ashwin.android.timberdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class OneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, OneFragment.newInstance())
            .commitNow()
    }
}