package com.zerir.services

import android.app.IntentService
import android.content.Intent

class AnIntentService : IntentService("AnIntentService") {

    private var isRunning = false

    override fun onHandleIntent(intent: Intent?) {
        isRunning = true
        //Do what ever you want
        while (isRunning) {
            println("IsRunning")
            Thread.sleep(1000)
        }
    }
}