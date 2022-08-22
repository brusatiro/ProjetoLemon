package com.example.testmyproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnAdmin = findViewById<Button>(R.id.botaoAdmin)
        val btnColab = findViewById<Button>(R.id.botaoColab)

        btnAdmin.setOnClickListener{
            val i = Intent (this, MainActivity2::class.java)
            startActivity(i)

        }

        btnColab.setOnClickListener {
            val i = Intent(this, MainActivity2::class.java)
            startActivity(i)
        }
    }
}
