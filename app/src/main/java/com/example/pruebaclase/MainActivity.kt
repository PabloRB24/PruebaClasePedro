package com.example.pruebaclase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button : Button = findViewById(R.id.button)
        var titulo :EditText = findViewById(R.id.titulo)
        var numPag :EditText = findViewById(R.id.numPag)
        var libro = intent.getStringExtra("libro")
        button.setOnClickListener {
            var intent = Intent(this,BookDetailsActivity::class.java)

            if(numPag.text.toString().toIntOrNull() != null){
                intent.putExtra("titulo",titulo.text.toString())
                intent.putExtra("numPag",numPag.text.toString())
                intent.putExtra("libro",libro)
                startActivity(intent)
            }
        }

    }
}