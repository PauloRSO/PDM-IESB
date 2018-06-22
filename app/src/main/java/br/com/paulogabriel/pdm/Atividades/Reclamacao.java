package br.com.paulogabriel.pdm.Atividades;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.paulogabriel.pdm.R;

public class Reclamacao extends AppCompatActivity {

    private  String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reclamacao);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        email = bundle.getString("email");


        Button enviarReclamacao = (Button)findViewById(R.id.reclamacao_enviar);
        enviarReclamacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                EditText tituloReclamacao = (EditText)findViewById(R.id.reclamacao_titulo);
                EditText mensagemReclamacao = (EditText)findViewById(R.id.reclamacao_mensagem);







                Intent intentEnviarEmail = new Intent(Intent.ACTION_SENDTO);
                intentEnviarEmail.setData(Uri.parse("mailto:" + email));
                intentEnviarEmail.putExtra(Intent.EXTRA_SUBJECT, tituloReclamacao.getText().toString());
                intentEnviarEmail.putExtra(Intent.EXTRA_TEXT, mensagemReclamacao.getText().toString());
                //intentEnviarEmail.putExtra(Intent.EXTRA_EMAIL, email.toString());
                //intentEnviarEmail.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(Intent.createChooser(intentEnviarEmail, "Send Email"));
            }
        });




    }
}
