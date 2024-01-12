package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class AkunSelesai : AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.akunselesai)

        val btnlanjut = findViewById<Button>(R.id.lanjut)
        btnlanjut.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }


    }
}