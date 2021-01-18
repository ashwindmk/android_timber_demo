package com.ashwin.android.timberdemo

import android.app.Application
import timber.log.Timber

class MainApp : Application() {
    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}
