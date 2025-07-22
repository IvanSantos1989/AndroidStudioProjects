package com.example.multiintentapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.multiintentapp.databinding.ActivityEx4ResumoBinding

class Ex4ResumoActivity : AppCompatActivity() {

    private val binding by lazy { ActivityEx4ResumoBinding.inflate(layoutInflater) }

    // Preços fixos no código
    private val precos = mapOf(
        "Café" to 1,
        "Sumo" to 2,
        "Sandes" to 4,
        "Gelado" to 3
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val produtos = intent.getStringArrayListExtra("produtos") ?: arrayListOf()
        val quantidades = intent.getIntegerArrayListExtra("quantidades") ?: arrayListOf()

        var total = 0
        val builder = StringBuilder()
        builder.append("Pedido efetuado:\n\n")
        for (i in produtos.indices) {
            val nome = produtos[i]
            val qtd = quantidades.getOrNull(i) ?: 1
            val preco = precos[nome] ?: 0
            val subtotal = preco * qtd
            total += subtotal
            builder.append("$qtd x $nome (${preco}€ cada) = ${subtotal}€\n")
        }
        builder.append("\nTotal: ${total}€")
        binding.tvResumoPedido.text = builder.toString()
    }
}