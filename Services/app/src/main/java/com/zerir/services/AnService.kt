package com.zerir.services

import android.app.Service
import android.content.Intent
import android.os.IBinder

class AnService : Service() {

    private var isRunning = false
    private lateinit var thread: Thread

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        isRunning = true

        thread = Thread {
            while (isRunning) {
                Thread.sleep(1000)
                println("Running")
            }
        }
        thread.start()

        return START_STICKY
    }

    override fun onDestroy() {
        isRunning = false
        super.onDestroy()
    }
}