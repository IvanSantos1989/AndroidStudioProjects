package com.example.multiintentapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.multiintentapp.databinding.ActivityEx3MenuBinding

class Ex3MenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEx3MenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEx3MenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRegisto.setOnClickListener {
            startActivity(Intent(this, RegistoActivity::class.java))
        }
        binding.btnLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
        binding.btnSobre.setOnClickListener {
            startActivity(Intent(this, SobreActivity::class.java))
        }
    }
}