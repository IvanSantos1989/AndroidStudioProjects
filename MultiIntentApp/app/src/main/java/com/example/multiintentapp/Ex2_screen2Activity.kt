package com.example.multiintentapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Ex2_screen2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ex2_screen2)

        val numero1 = intent.getStringExtra("numero1")
        val editNumero2 = findViewById<EditText>(R.id.editNumero2)
        val btnOK = findViewById<Button>(R.id.btnOK2)

        btnOK.setOnClickListener {
            val numero2 = editNumero2.text.toString()
            val intent = Intent(this, Ex2_ResultActivity::class.java)
            intent.putExtra("numero1", numero1)
            intent.putExtra("numero2", numero2)
            startActivity(intent)
        }
    }
}