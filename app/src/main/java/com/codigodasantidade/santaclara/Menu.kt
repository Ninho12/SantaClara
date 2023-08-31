package com.codigodasantidade.santaclara

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val historia = findViewById<Button>(R.id.historia)

        historia.text = "Eu sou sabido"

        val milagres = findViewById<Button>(R.id.milagres)

        milagres.setOnClickListener {
            historia.text = "Historia"
        }
    }
}