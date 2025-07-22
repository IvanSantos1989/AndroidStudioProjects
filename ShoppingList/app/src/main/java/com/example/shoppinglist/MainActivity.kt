package com.example.shoppinglist

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.shoppinglist.databinding.ActivityMainBinding

/**
 * MainActivity é a atividade principal do aplicativo de lista de compras.
 * Permite que o usuário faça login com um nome de usuário e senha predefinidos.
 * Após o login bem-sucedido, o usuário é redirecionado para a ListaComprasActivity.
 */
class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater) }

    // usuarios predefinidos para login com senha e ano de nascimento
    private val users = arrayListOf(
        User("user1", "pass1", "Ivan", 1995),
        User("user2", "pass2", "Bia", 1998),
        User("user3", "pass3", "Bel", 2001),
        User("user4", "pass4", "Noah", 1999),
        User("user5", "pass5", "Dudu", 2002)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnEntrar.setOnClickListener {
            val username = binding.editUsername.text.toString()
            val password = binding.editPassword.text.toString()

            var nomeUser = ""
            var anoNascimentoUser = 0
            var userValido = false

            // Verifica se o usuário e senha correspondem a algum usuário predefinido
            for (user in users) {
                if (user.username == username && user.password == password) {
                    nomeUser = user.nome
                    anoNascimentoUser = user.anoNascimento
                    userValido = true
                    break
                }
            }

            // Se o usuário for válido, inicia a ListaComprasActivity e passa os dados do usuário
            if (userValido) {
                val intent = Intent(this, ListaComprasActivity::class.java)
                intent.putExtra("nome", nomeUser)
                intent.putExtra("anoNascimento", anoNascimentoUser)
                startActivity(intent)
                Toast.makeText(this, "Login bem-sucedido!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login inválido!", Toast.LENGTH_SHORT).show()
                binding.editUsername.text.clear()
                binding.editPassword.text.clear()
            }
        }
    }
}