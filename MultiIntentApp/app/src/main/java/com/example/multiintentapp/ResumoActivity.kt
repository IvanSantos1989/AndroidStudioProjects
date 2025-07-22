package com.example.multiintentapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.multiintentapp.databinding.ActivityResumoBinding

class ResumoActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityResumoBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val nome = intent.getStringExtra("nome")
        val morada = intent.getStringExtra("morada")
        val telefone = intent.getStringExtra("telefone")
        val email = intent.getStringExtra("email")
        val genero = intent.getStringExtra("genero")

        val texto = "O $nome mora na $morada, tem o telefone $telefone, o email $email e género $genero."

        binding.tvResumo.text = texto
    }
}