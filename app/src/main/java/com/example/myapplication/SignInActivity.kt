package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class SignInActivity : AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signin)

        val btnmasuk = findViewById<Button>(R.id.masuk)
        btnmasuk.setOnClickListener {
            val intent = Intent(this, AkunSelesai::class.java)
            startActivity(intent)
        }




    }
}