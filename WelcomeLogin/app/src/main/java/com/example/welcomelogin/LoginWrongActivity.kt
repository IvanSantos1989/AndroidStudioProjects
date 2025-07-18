package com.example.welcomelogin

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.welcomelogin.databinding.ActivityLoginWrongBinding

class LoginWrongActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityLoginWrongBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Toast.makeText(applicationContext, "login inválido!", Toast.LENGTH_LONG).show()

        binding.buttonVoltarLogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}