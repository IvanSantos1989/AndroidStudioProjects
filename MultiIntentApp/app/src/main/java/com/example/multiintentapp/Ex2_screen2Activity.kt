package com.example.multiintentapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.multiintentapp.databinding.ActivityEx2Screen2Binding

class Ex2_screen2Activity : AppCompatActivity() {

    private val binding by lazy {
        ActivityEx2Screen2Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val numero1 = intent.getStringExtra("numero1")

        binding.btnOK2.setOnClickListener {
            val numero2 = binding.editNumero2.text.toString()
            val intent = Intent(this, Ex2_ResultActivity::class.java)
            intent.putExtra("numero1", numero1)
            intent.putExtra("numero2", numero2)
            startActivity(intent)
        }
    }
}