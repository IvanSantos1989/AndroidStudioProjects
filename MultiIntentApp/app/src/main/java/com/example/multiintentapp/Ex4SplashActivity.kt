package com.example.multiintentapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.multiintentapp.databinding.ActivityEx4SplashBinding

class Ex4SplashActivity : AppCompatActivity() {

    private val binding by lazy { ActivityEx4SplashBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val produtos = intent.getStringArrayListExtra("produtos")
        val quantidades = intent.getIntegerArrayListExtra("quantidades")

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Ex4ResumoActivity::class.java)
            intent.putStringArrayListExtra("produtos", produtos)
            intent.putIntegerArrayListExtra("quantidades", quantidades)
            startActivity(intent)
            finish()
        }, 4000)
    }
}