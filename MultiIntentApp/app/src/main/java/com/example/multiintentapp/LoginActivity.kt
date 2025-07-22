package com.example.multiintentapp

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.multiintentapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val username = binding.editUsername.text.toString()
            val password = binding.editPassword.text.toString()

            val prefs = getSharedPreferences("login", Context.MODE_PRIVATE)
            val savedUsername = prefs.getString("username", "")
            val savedPassword = prefs.getString("password", "")

            if (username == savedUsername && password == savedPassword && username.isNotEmpty()) {
                startActivity(Intent(this, SobreActivity::class.java))
                finish()
            } else {
                Toast.makeText(this, "Login ou senha inválidos!", Toast.LENGTH_SHORT).show()
                binding.editUsername.text.clear()
                binding.editPassword.text.clear()
            }
        }
    }
}