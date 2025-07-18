package com.example.welcomelogin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.welcomelogin.databinding.ActivityWeeksNumberBinding

class WeeksNumberActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityWeeksNumberBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val editHoras = findViewById<EditText>(R.id.editHoras)
        val buttonCalcular = findViewById<Button>(R.id.buttonCalcular)
        val textSemanas = findViewById<TextView>(R.id.textSemanas)
        val textDias = findViewById<TextView>(R.id.textDias)
        val textHoras = findViewById<TextView>(R.id.textHoras)

        buttonCalcular.setOnClickListener {
            val horasStr = editHoras.text.toString()
            val totalHoras = horasStr.toIntOrNull()

            if (totalHoras != null && totalHoras >= 0) {
                val semanas = totalHoras / 168         // 1 semana = 168 horas
                val dias = (totalHoras % 168) / 24     // O resto das semanas, convertidos em dias
                val horas = (totalHoras % 168) % 24    // O resto das semanas e dias, em horas

                textSemanas.text = "Semanas: $semanas"
                textDias.text = "Dias: $dias"
                textHoras.text = "Horas: $horas"
            } else {
                textSemanas.text = "Semanas: "
                textDias.text = "Dias: "
                textHoras.text = "Horas: "
            }
        }
            binding.buttonVoltar.setOnClickListener {
            val intent = Intent(this, MainActivityHome::class.java)
            startActivity(intent)
        }
    }
}