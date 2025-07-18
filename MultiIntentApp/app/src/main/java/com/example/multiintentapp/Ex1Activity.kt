package com.example.multiintentapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class Ex1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex1)

        val nome = findViewById<EditText>(R.id.editNome)
        val morada = findViewById<EditText>(R.id.editMorada)
        val telefone = findViewById<EditText>(R.id.editTelefone)
        val email = findViewById<EditText>(R.id.editEmail)
        val genero = findViewById<Spinner>(R.id.spinnerGenero)
        val btnEnviar = findViewById<Button>(R.id.btnEnviar)

        btnEnviar.setOnClickListener {
            val intent = Intent(this, ResumoActivity::class.java)
            intent.putExtra("nome", nome.text.toString())
            intent.putExtra("morada", morada.text.toString())
            intent.putExtra("telefone", telefone.text.toString())
            intent.putExtra("email", email.text.toString())
            intent.putExtra("genero", genero.selectedItem.toString())
            startActivity(intent)
        }
    }
}