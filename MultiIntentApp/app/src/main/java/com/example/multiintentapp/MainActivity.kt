package com.example.multiintentapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.multiintentapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnEx1.setOnClickListener {
            startActivity(Intent(this, Ex1Activity::class.java))
        }
        binding.btnEx2.setOnClickListener {
            startActivity(Intent(this, Ex2Activity::class.java))
        }
        binding.btnEx3.setOnClickListener {
            startActivity(Intent(this, SplashActivity::class.java))
        }

        binding.btnEx4.setOnClickListener {
            startActivity(Intent(this, Ex4Activity::class.java))
        }

    }
}