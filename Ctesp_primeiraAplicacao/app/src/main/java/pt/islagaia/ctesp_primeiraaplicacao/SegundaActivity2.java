package pt.islagaia.ctesp_primeiraaplicacao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda2);

        Intent intent = getIntent();
        String mensagem  = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView mCampoTexto = findViewById(R.id.txt_displayMsg);

        mCampoTexto.setText(mensagem);
    }
}