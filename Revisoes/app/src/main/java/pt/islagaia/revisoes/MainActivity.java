package pt.islagaia.revisoes;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "pt.islagaia.revisoes.mensagem";
    EditText telefone;
    Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        telefone = findViewById(R.id.editTextTelefone);
        enviar = findViewById(R.id.buttonEnviar);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarTelefone(v);
            }
        });


    }

    public void enviarTelefone(View view){
        Intent intent = new Intent(this, SegundaActivity.class);
        String mensagem = telefone.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, mensagem);
        startActivity(intent);

    }
}