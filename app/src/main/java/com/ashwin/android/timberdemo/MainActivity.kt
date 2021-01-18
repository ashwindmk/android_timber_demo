package com.ashwin.android.timberdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Timber.d("onStart")
    }

    override fun onResume() {
        super.onResume()
        Timber.d("onResume")
    }

    fun openActivityOne(view: View) {
        startActivity(Intent(MainActivity@this, OneActivity::class.java))
    }
}
