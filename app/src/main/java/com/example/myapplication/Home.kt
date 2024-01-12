package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val account = findViewById<ImageView>(R.id.profile_image)
        account.setOnClickListener {
            val intent = Intent(this, Accountedit::class.java)
            startActivity(intent)
        }

        val transfer = findViewById<ImageView>(R.id.transfer)
        transfer.setOnClickListener {
            val intent = Intent(this, Transfer::class.java)
            startActivity(intent)
        }

        val qris = findViewById<ImageView>(R.id.scanqr)
        qris.setOnClickListener {
            val intent = Intent(this, qrpayment::class.java)
            startActivity(intent)
        }

        val activities = findViewById<ImageView>(R.id.activity)
        activities.setOnClickListener {
            val intent = Intent(this, history::class.java)
            startActivity(intent)
        }
    }
}