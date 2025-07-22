package com.example.multiintentapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.multiintentapp.databinding.ActivityEx4Binding

class Ex4Activity : AppCompatActivity() {

    private val binding by lazy { ActivityEx4Binding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnEfetuarPedido.setOnClickListener {
            val produtos = ArrayList<String>()
            val quantidades = ArrayList<Int>()

            if (binding.checkCafe.isChecked) {
                val qtd = binding.qtyCafe.text.toString().toIntOrNull() ?: 1
                produtos.add("Café")
                quantidades.add(qtd)
            }
            if (binding.checkSumo.isChecked) {
                val qtd = binding.qtySumo.text.toString().toIntOrNull() ?: 1
                produtos.add("Sumo")
                quantidades.add(qtd)
            }
            if (binding.checkSandes.isChecked) {
                val qtd = binding.qtySandes.text.toString().toIntOrNull() ?: 1
                produtos.add("Sandes")
                quantidades.add(qtd)
            }
            if (binding.checkGelado.isChecked) {
                val qtd = binding.qtyGelado.text.toString().toIntOrNull() ?: 1
                produtos.add("Gelado")
                quantidades.add(qtd)
            }

            if (produtos.isEmpty()) {
                Toast.makeText(this, "Selecione pelo menos um produto!", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, Ex4SplashActivity::class.java)
                intent.putStringArrayListExtra("produtos", produtos)
                intent.putIntegerArrayListExtra("quantidades", quantidades)
                startActivity(intent)
            }
        }
    }
}