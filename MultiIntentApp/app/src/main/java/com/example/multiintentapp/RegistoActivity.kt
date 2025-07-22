package com.example.multiintentapp

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.multiintentapp.databinding.ActivityRegistoBinding

class RegistoActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityRegistoBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnSalvar.setOnClickListener {
            val username = binding.editUsername.text.toString()
            val password = binding.editPassword.text.toString()

            if (username.isNotEmpty() && password.isNotEmpty()) {
                val prefs = getSharedPreferences("login", Context.MODE_PRIVATE)
                prefs.edit().putString("username", username)
                    .putString("password", password)
                    .apply()
                Toast.makeText(this, "Usuário salvo!", Toast.LENGTH_SHORT).show()
                finish()
            } else {
                Toast.makeText(this, "Preencha todos os campos.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}