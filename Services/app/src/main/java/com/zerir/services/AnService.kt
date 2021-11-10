package com.zerir.services

import android.app.Service
import android.content.Intent
import android.os.IBinder

class AnService : Service() {


    override fun onBind(intent: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Thread {
            while (true) println("Running")
        }.start()
        return START_STICKY
    }
}