package pt.islagaia.revisoes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Intent intent = getIntent();
        String mensagem = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView mTelefone = findViewById(R.id.textViewRecebido);
        mTelefone.setText(mensagem);
    }
}