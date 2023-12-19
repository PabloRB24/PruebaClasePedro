package com.example.pruebaclase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ScrollView
import android.widget.TextView

class BookDisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_display)

        var titulo : TextView = findViewById(R.id.tituloMostrar)
        var numPag : TextView = findViewById(R.id.numPagMostrar)
        var nomAutor : TextView = findViewById(R.id.nomAutorMostrar)
        var año : TextView = findViewById(R.id.añoMostrar)
        var libroMostrar : TextView = findViewById(R.id.mostrar)
        var libroTxt : TextView = findViewById(R.id.libroObj)
        var inicio : Button = findViewById(R.id.button3)

        titulo.text = intent.getStringExtra("titulo")
        numPag.text = intent.getStringExtra("numPag")
        nomAutor.text = intent.getStringExtra("nomAutor")
        año.text = intent.getStringExtra("año")
// sin usar la clase
        var libroStr : String? =  intent.getStringExtra("libro")
        if (libroStr == null){
            libroStr  = " titulo: " +titulo.text.toString() + " numeroPag: "+ numPag.text.toString()+ " nombreAutor: " + nomAutor.text.toString()+ " año: " + año.text.toString()
        }else{
            libroStr  += " titulo: " +titulo.text.toString() + " numeroPag: "+ numPag.text.toString()+ " nombreAutor: " + nomAutor.text.toString()+ " año: " + año.text.toString()
        }

        libroMostrar.text = libroStr
//uso la clase
        var libro = Libro(titulo.text.toString(),numPag.text.toString().toInt(),nomAutor.text.toString(),año.text.toString().toInt())
        var libros = arrayListOf<Libro>()
        libros.add(libro)
        libroTxt.text = " titulo: " +libro.getTitulo() + " numeroPag: "+ libro.getnumPag() + " nombreAutor: " + libro.getNomAutor() + " año: " + libro.getAño()

        inicio.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            //intent.putExtra("libros", libros)
            intent.putExtra("libro", libroStr)
            startActivity(intent)
        }

    }
}