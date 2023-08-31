package com.codigodasantidade.santaclara

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val historia = findViewById<Button>(R.id.historia)

        historia.text = "Historia Legal"

        val milagres = findViewById<Button>(R.id.milagres)

        milagres.setOnClickListener {
            historia.text = "Historia 4"
        }
    }
}