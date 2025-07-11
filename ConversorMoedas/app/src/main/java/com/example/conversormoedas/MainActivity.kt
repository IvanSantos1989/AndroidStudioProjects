package com.example.conversormoedas

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.conversormoedas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonReal.setOnClickListener {
            converterMoeda(4.4,"reais")
        }

        binding.buttonDolar.setOnClickListener {
            converterMoeda(1.20,"dólares")
        }

        binding.buttonPeso.setOnClickListener {
            converterMoeda(31.5,"pesos")
        }
    }

    private fun converterMoeda(cambio: Double, nomeMoeda: String) {
        val euroStr = binding.editEuros.text.toString()
        val euros = euroStr.toDoubleOrNull()
        if (euros != null) {
            val convertido = euros * cambio
            Toast.makeText(this, "$euros euros = $convertido $nomeMoeda", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "Por favor, insira um valor válido em euros.", Toast.LENGTH_SHORT).show()
        }
    }
}