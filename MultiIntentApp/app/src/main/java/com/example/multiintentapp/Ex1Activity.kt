package com.example.multiintentapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.multiintentapp.databinding.ActivityEx1Binding

class Ex1Activity : AppCompatActivity() {

    private val binding by lazy {
        ActivityEx1Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnEnviar.setOnClickListener {
            val intent = Intent(this, ResumoActivity::class.java)
            intent.putExtra("nome", binding.editNome.text.toString())
            intent.putExtra("morada", binding.editMorada.text.toString())
            intent.putExtra("telefone", binding.editTelefone.text.toString())
            intent.putExtra("email", binding.editEmail.text.toString())
            intent.putExtra("genero", binding.spinnerGenero.selectedItem.toString())
            startActivity(intent)
        }
    }
}