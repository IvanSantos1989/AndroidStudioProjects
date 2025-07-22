package com.example.shoppinglist

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.shoppinglist.databinding.ActivitySplashBinding

/**
 * SplashActivity é a atividade de introdução do aplicativo de lista de compras.
 * Exibe uma tela de carregamento por 3 segundos antes de redirecionar para a MainActivity.
 */
class SplashActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivitySplashBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Fecha a SplashActivity para que não possa voltar a ela
        }, 3000) // 3000 milissegundos = 3 segundos
    }
}