package com.example.welcomelogin

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.welcomelogin.databinding.ActivityMainHomeBinding

class MainActivityHome : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainHomeBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button1.setOnClickListener {
            Toast.makeText(applicationContext, "Botão 1 clicado!", Toast.LENGTH_SHORT).show()
        }

        binding.button2.setOnClickListener {
            val intent = Intent(this, BotaoDoisActivity::class.java)
            startActivity(intent)
        }

        binding.button3.setOnClickListener {
            val intent = Intent(this, InputNumberActivity::class.java)
            startActivity(intent)
        }

        binding.button4.setOnClickListener {
            val intent = Intent(this, WeeksNumberActivity::class.java)
            startActivity(intent)
        }

    }
}