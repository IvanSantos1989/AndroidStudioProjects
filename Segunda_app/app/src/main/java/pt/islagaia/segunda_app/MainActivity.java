// package pt.islagaia.intentosinplicitos;
package pt.islagaia.segunda_app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mEdySite;
    private EditText mEdtLocal;
    private EditText mEdtTextoPartilhado;
    private EditText mEdtEmailEndereco;
    private EditText mEdtEmailMsg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button website = findViewById(R.id.btn_site);
        //Metodo Tradicional
        website.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                //declarar o evento do botão
                openSite(view);
            }
        });

        mEdySite = findViewById(R.id.edt_site);

        //Metodo Lambda
        Button localizacao = findViewById(R.id.btn_local);
        localizacao.setOnClickListener(this::openLocalizacao);
        mEdtLocal = findViewById(R.id.edt_local);


        Button mensagem = findViewById(R.id.btn_msg);
        mensagem.setOnClickListener(this::openMensagem);
        mEdtTextoPartilhado = findViewById(R.id.edt_msg);


        Button email = findViewById(R.id.edt_emailEndereco);
        mensagem.setOnClickListener(this::openEmail);
        mEdtEmailEndereco = findViewById(R.id.edt_emailEndereco);
        mEdtEmailMsg = findViewById(R.id.edt_emailMensagem);

    }

    int yyyy = 0;
    public void openSite(View v){
        String url = mEdySite.getText().toString();
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void openLocalizacao(View v){
        String local = mEdtLocal.getText().toString();
        Uri localUri = Uri.parse("geo:0,0?q=" + local);
        Intent intent = new Intent(Intent.ACTION_VIEW, localUri);
        startActivity(intent);
    }

    public void openMensagem(View v){
        String msg = mEdtTextoPartilhado.getText().toString();
        String mime = "text/plain";
        new ShareCompat.IntentBuilder(MainActivity.this)
                .setType(mime)
                .setChooserTitle("Partichar com: ")
                .setText(msg)
                .startChooser();
    }

    public void openEmail(View v){
        String endereco = mEdtEmailEndereco.getText().toString();
        String corpoEmail = mEdtEmailMsg.getText().toString();
        String assunto = getString(R.string.assunto_email);

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setData(Uri.parse("mailto: "));
        intent.putExtra(intent.EXTRA_EMAIL, new String[]{endereco});
        intent.putExtra(Intent.EXTRA_SUBJECT, assunto);
        intent.putExtra(Intent.EXTRA_TEXT, corpoEmail);
        startActivity(intent);

    }

}