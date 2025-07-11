package com.example.welcomelogin

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.welcomelogin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener {
            val username = binding.editUsername.text.toString()
            val password = binding.editPassword.text.toString()

            if (username == "user" && password == "pass") {
                Toast.makeText(applicationContext, "login válido!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, MainActivityHome::class.java)
                startActivity(intent)
            } else if (username.isNullOrEmpty() || password.isNullOrEmpty()) {
                Toast.makeText(applicationContext, "Por favor, preencha todos os campos.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "login inválido!", Toast.LENGTH_SHORT).show()
            }
            // Limpa os campos de entrada após o login
            binding.editUsername.text?.clear()
            binding.editPassword.text?.clear()
        }
    }
}