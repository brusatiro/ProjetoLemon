package com.example.testmyproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val btnDicas = findViewById<Button>(R.id.btnDicas)

        btnDicas.setOnClickListener{
            val i = Intent (this, MainActivity4::class.java)
            startActivity(i)
        }

        val btnDicasIcon = findViewById<ImageButton>(R.id.btnDicasIcon)

        btnDicasIcon.setOnClickListener{
            val i = Intent (this, MainActivity4::class.java)
            startActivity(i)
        }

    }
}

