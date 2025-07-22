package com.example.multiintentapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.multiintentapp.databinding.ActivityEx2ResultBinding

class Ex2_ResultActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityEx2ResultBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val numero1 = intent.getStringExtra("numero1")?.toIntOrNull() ?: 0
        val numero2 = intent.getStringExtra("numero2")?.toIntOrNull() ?: 0

        val soma = numero1 + numero2
        val diferenca = numero1 - numero2
        val produto = numero1 * numero2
        val divisao = if (numero2 != 0) (numero1 / numero2).toString() else "Indefinida"

        val texto = """
            $numero1 + $numero2 = $soma
            $numero1 - $numero2 = $diferenca
            $numero1 x $numero2 = $produto
            $numero1 ÷ $numero2 = $divisao
        """.trimIndent()

        binding.tvResultado.text = texto
    }
}