package com.example.shoppinglist

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.shoppinglist.databinding.ActivityListaComprasBinding

/** ListaComprasActivity é a atividade que gerencia a lista de compras do usuário.
 * Permite adicionar e remover produtos da lista, além de exibir uma mensagem de boas-vindas.
 */
class ListaComprasActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityListaComprasBinding.inflate(layoutInflater) }

    private val listaCompras = ArrayList<String>()
    private lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // Recupera o nome e o ano de nascimento enviados pelo intent
        val nome = intent.getStringExtra("nome") ?: "Usuário"
        val ano = intent.getIntExtra("anoNascimento", 0)

        // Mostra um bem-vindo no topo da tela ao usuário
        binding.tvBemVindo.text = "Bem-vindo, $nome ($ano)"

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, ArrayList())
        binding.listViewCompras.adapter = adapter

        // Configura o botão para adicionar um produto à lista
        binding.btnAdicionar.setOnClickListener {
            val produto = binding.editNovoProduto.text.toString()
            if (produto.isNotEmpty()) {
                listaCompras.add(produto)
                atualizarLista()
                binding.editNovoProduto.text.clear()
            } else {
                Toast.makeText(this, "Digite um produto!", Toast.LENGTH_SHORT).show()
            }
        }

        // Configura o botão para remover um produto da lista
        binding.btnRemover.setOnClickListener {
            val numStr = binding.editRemoverProduto.text.toString()
            if (numStr.isNotEmpty()) {
                val num = numStr.toInt()
                if (num > 0 && num <= listaCompras.size) {
                    listaCompras.removeAt(num - 1)
                    atualizarLista()
                    binding.editRemoverProduto.text.clear()
                } else {
                    Toast.makeText(this, "Número inválido!", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Digite o número do produto!", Toast.LENGTH_SHORT).show()
            }
        }

        binding.btnVoltar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    // Atualiza a lista de compras exibida na ListView
    private fun atualizarLista() {
        val listaNumerada = ArrayList<String>()
        for (i in 0 until listaCompras.size) {
            listaNumerada.add("${i + 1}. ${listaCompras[i]}")
        }
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaNumerada)
        binding.listViewCompras.adapter = adapter
    }
}