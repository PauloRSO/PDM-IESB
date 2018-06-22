package br.com.paulogabriel.pdm.Atividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import br.com.paulogabriel.pdm.R;

public class MostraEscola extends AppCompatActivity {

    private TextView nome_escola_textView;
    private TextView email_escola_textView;
    private Float latitude;
    private Float longitude;
    private String nome;
    private String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostra_escola);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        latitude = bundle.getFloat("latitude");
        longitude = bundle.getFloat("longitude");
        nome = bundle.getString("nome");
        email = bundle.getString("email");


        nome_escola_textView = (TextView)findViewById(R.id.mostra_escola_nome);
        nome_escola_textView.setText(nome);

        email_escola_textView = (TextView)findViewById(R.id.mostra_escola_email);
        email_escola_textView.setText(email);

        TextView latitude_textview = (TextView)findViewById(R.id.latitude_escola);
        latitude_textview.setText(latitude.toString());
        TextView longitude_textview = (TextView)findViewById(R.id.longitude_escola);
        longitude_textview.setText(longitude.toString());




        Button botao_localizacao = (Button)findViewById(R.id.botao_localizacao);
        botao_localizacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapas = new Intent(MostraEscola.this, MapasEscolas.class);

                Bundle escolaBundle = new Bundle();
                escolaBundle.putString("nome", nome);
                escolaBundle.putFloat("latitude", latitude);
                escolaBundle.putFloat("longitude", longitude);
                mapas.putExtras(escolaBundle);
                startActivity(mapas);
            }
        });

        Button botaoEnviarReclamacao = (Button)findViewById(R.id.botao_enviar_reclamacao);
        botaoEnviarReclamacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reclamacaoIntent = new Intent(MostraEscola.this, Reclamacao.class);

                Bundle reclamacaoBundle = new Bundle();
                reclamacaoBundle.putString("email", email);
                reclamacaoIntent.putExtras(reclamacaoBundle);
                startActivity(reclamacaoIntent);
            }
        });




    }
}
