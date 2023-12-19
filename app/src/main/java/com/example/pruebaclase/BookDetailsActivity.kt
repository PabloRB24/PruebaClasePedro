package com.example.pruebaclase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class BookDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_details)

        var button : Button = findViewById(R.id.button2)
        var nomAutor : EditText = findViewById(R.id.nomAutor)
        var año : EditText = findViewById(R.id.año)

        var titulo = intent.getStringExtra("titulo")
        var numPag = intent.getStringExtra("numPag")
        var libro = intent.getStringExtra("libro")

        button.setOnClickListener {
            var intent = Intent(this,BookDisplayActivity::class.java)

            if(año.text.toString().toIntOrNull() != null){
                intent.putExtra("nomAutor",nomAutor.text.toString())
                intent.putExtra("año",año.text.toString())
                intent.putExtra("titulo",titulo)
                intent.putExtra("numPag",numPag)
                intent.putExtra("libro",libro)
                startActivity(intent)
            }

        }
    }
}