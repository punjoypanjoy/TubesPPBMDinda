package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class login : AppCompatActivity () {
    override fun onCreate (savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val btnsigninmasuk = findViewById<TextView>(R.id.signinmasuk)
        btnsigninmasuk.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
            }

        val btnLupa = findViewById<TextView>(R.id.lupa)
        btnLupa.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }




    }
}