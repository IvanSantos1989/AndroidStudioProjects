package pt.islagaia.ctesp_primeiraaplicacao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "pt.islagaia.ctesp_primeiraaplicacao.MESSAGE";

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    int mContador = 0;

    TextView mostraContagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mostraContagem = findViewById(R.id.txt_displayContador);
    }

    public void onStart(){
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    public void onResume(){
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }

    public void onPause(){
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    public void onStop(){
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    public void onDestroy(){
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }

    public void onRestart(){
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }

    public void conta(View view){
        mContador ++;
        mostraContagem.setText(Integer.toString(mContador));
    }

    public void iniciar(View view){
        Intent intent = new Intent(this, SegundaActivity2.class);
        String mensagem = " Clicou no botão " + Integer.toString(mContador) + " vezes";
        intent.putExtra(EXTRA_MESSAGE, mensagem);
        startActivity(intent);

    }
}