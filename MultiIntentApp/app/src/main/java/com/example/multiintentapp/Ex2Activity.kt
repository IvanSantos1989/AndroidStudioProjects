package com.example.multiintentapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.multiintentapp.databinding.ActivityEx2Binding

class Ex2Activity : AppCompatActivity() {

    private val binding by lazy {
        ActivityEx2Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnOK1.setOnClickListener {
            val numero1 = binding.editNumero1.text.toString()
            val intent = Intent(this, Ex2_screen2Activity::class.java)
            intent.putExtra("numero1", numero1)
            startActivity(intent)
        }
    }
}