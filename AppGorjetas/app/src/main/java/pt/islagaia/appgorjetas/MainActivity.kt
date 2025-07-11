package pt.islagaia.appgorjetas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
// inserir import para Binding
import pt.islagaia.appgorjetas.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /** versão antiga
        val meuBotao = findViewById<Button>(R.id.calcular).setOnClickListener {
            //código
        }
            ** versão nova mas com criação de variável desnecessária **
        val meuBotao = binding.calcular.setOnClickListener(){
            //código
        }*/
        binding.calcular.setOnClickListener {
            calcularGorjeta()
        }
    }

    fun calcularGorjeta() {

        val stringCusto = binding.custo.text.toString()
        val doubleCusto = stringCusto.toDouble()
        if (doubleCusto==null){

    }
        // seleciona o radio group
        val selectedId = binding.rgTipooptions.checkedRadioButtonId

        val tipPercentage = when (selectedId){
            R.id.Button20 -> 0.20
            R.id.Button18 -> 0.18
            else -> 0.15
        }

        var gorjeta = tipPercentage * doubleCusto
        if(binding.arredondar.isChecked){
            gorjeta = kotlin.math.ceil(gorjeta)
        }

        val gorjetaFormatada = NumberFormat.getCurrencyInstance().format(gorjeta)
        binding.textoGorjeta.text = getString(R.string.texto_gorjeta, gorjetaFormatada)

        }
}