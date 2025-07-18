package com.example.multiintentapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResumoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resumo)

        val nome = intent.getStringExtra("nome")
        val morada = intent.getStringExtra("morada")
        val telefone = intent.getStringExtra("telefone")
        val email = intent.getStringExtra("email")
        val genero = intent.getStringExtra("genero")

        val texto = "O $nome mora na $morada, tem o telefone $telefone, o email $email e género $genero."

        findViewById<TextView>(R.id.tvResumo).text = texto
    }
}