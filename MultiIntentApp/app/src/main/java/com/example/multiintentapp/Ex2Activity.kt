package com.example.multiintentapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Ex2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex2)

        val editNumero1 = findViewById<EditText>(R.id.editNumero1)
        val btnOK = findViewById<Button>(R.id.btnOK1)

        btnOK.setOnClickListener {
            val numero1 = editNumero1.text.toString()
            val intent = Intent(this, Ex2_screen2Activity::class.java)
            intent.putExtra("numero1", numero1)
            startActivity(intent)
        }
    }
}