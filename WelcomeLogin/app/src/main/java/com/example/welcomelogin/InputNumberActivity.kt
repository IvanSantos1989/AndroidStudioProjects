package com.example.welcomelogin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.welcomelogin.databinding.ActivityInputNumberBinding

class InputNumberActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityInputNumberBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val EditNumber = findViewById<EditText>(R.id.editNumber)
        val ButtonCheck = findViewById<Button>(R.id.buttonCheck)
        val TextParImpar = findViewById<TextView>(R.id.textViewParImpar)
        val TextPrimo = findViewById<TextView>(R.id.textViewPrimo)

        ButtonCheck.setOnClickListener {
            val input = EditNumber.text.toString()
            val number = input.toIntOrNull()

            if (number != null) {
                // Verifica se é par ou ímpar
                if (number % 2 == 0) {
                    TextParImpar.setText("O número $number é Par")
                } else {
                    TextParImpar.setText("O número $number é Ímpar")
                }

                // Verifica se é primo
                fun isPrime(num: Int): Boolean {
                    if (num <= 1) return false
                    var divisores = 0
                    for (i in 1..num) {
                        if (num % i == 0) {
                            divisores++
                        }
                    }
                    return divisores == 2
                }

                if (isPrime(number)) {
                    TextPrimo.setText("O número $number é Primo")
                } else {
                    TextPrimo.setText("O número $number não é Primo")
                }
            }
        }
            binding.buttonVoltar.setOnClickListener {
            val intent = Intent(this, MainActivityHome::class.java)
            startActivity(intent)
        }
    }
}