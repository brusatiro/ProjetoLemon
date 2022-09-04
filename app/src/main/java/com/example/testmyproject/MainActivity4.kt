package com.example.testmyproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val btnMapaEcopontos = findViewById<Button>(R.id.btnMapaEcopontos)

        btnMapaEcopontos.setOnClickListener{
            val i = Intent (this, MainActivity5::class.java)
            startActivity(i)
        }

    }
}