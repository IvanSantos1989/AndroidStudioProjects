package com.example.welcomelogin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.welcomelogin.databinding.ActivityBotaoDoisBinding

class BotaoDoisActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityBotaoDoisBinding.inflate(layoutInflater)
    }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(binding.root)

            binding.buttonVoltar.setOnClickListener {
                val intent = Intent(this, MainActivityHome::class.java)
                startActivity(intent)
            }
        }
    }