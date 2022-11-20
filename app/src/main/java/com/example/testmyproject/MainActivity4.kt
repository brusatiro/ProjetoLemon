package com.example.testmyproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val btnInicio = findViewById<Button>(R.id.btnInicio)

        btnInicio.setOnClickListener{
            val i = Intent (this, MainActivity3::class.java)
            startActivity(i)
        }

        val btnInicioIcon = findViewById<ImageButton>(R.id.btnInicioIcon)

        btnInicioIcon.setOnClickListener{
            val i = Intent (this, MainActivity3::class.java)
            startActivity(i)
        }

        val btnMapaEcopontos = findViewById<Button>(R.id.btnMapaEcopontos)

        btnMapaEcopontos.setOnClickListener{
            val i = Intent (this, MainActivity5::class.java)
            startActivity(i)
        }

    }
}