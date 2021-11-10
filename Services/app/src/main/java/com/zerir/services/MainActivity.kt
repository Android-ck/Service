package com.zerir.services

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intentService = Intent(this, AnIntentService::class.java)
        val intent = Intent(this, AnService::class.java)

        findViewById<Button>(R.id.startService_bt).setOnClickListener {
            startService(intent)
            findViewById<TextView>(R.id.serviceState_tv).text = "Started"
        }

        findViewById<Button>(R.id.endService_bt).setOnClickListener {
            stopService(intent)
            findViewById<TextView>(R.id.serviceState_tv).text = "Ended"
        }
    }
}