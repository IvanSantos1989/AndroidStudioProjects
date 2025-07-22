package com.example.multiintentapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.multiintentapp.databinding.ActivitySobreBinding

class SobreActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivitySobreBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        // Pode customizar o texto aqui se precisar
    }
}