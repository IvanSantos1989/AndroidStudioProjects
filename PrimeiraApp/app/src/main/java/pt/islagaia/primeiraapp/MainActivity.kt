package pt.islagaia.primeiraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button)?.setOnClickListener {
            val display = findViewById<TextView>(R.id.txt_display)
            var nome = findViewById<TextInputEditText>(R.id.Nome).text.toString()
            val apelido = findViewById<TextInputEditText>(R.id.Apelido).text.toString()
            display.text=""

            // val nomeCompleto = nome + " " + apelido
            val nomeCompleto = nome.plus(" ").plus(apelido)


            if (nome.isNotEmpty() && apelido.isNotEmpty()){
                display.text = " ${getString(R.string.boas_vindas)} ${nomeCompleto}"

            }else{
                Toast.makeText(this, "Campo de preenchimento obrigatório", Toast.LENGTH_LONG).show()
            }
        }


    }
}