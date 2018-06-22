package br.com.paulogabriel.pdm.Atividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import br.com.paulogabriel.pdm.Classes.User;
import br.com.paulogabriel.pdm.R;

public class Acessar extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private DatabaseReference mDatabase;
    private DatabaseReference mUserReference;
    private TextView textoUsuario;
    private String uid;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acessar);



        //mDatabase = FirebaseDatabase.getInstance().getReference();

        uid = null;
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {

            // The user's ID, unique to the Firebase project. Do NOT use this value to
            // authenticate with your backend server, if you have one. Use
            // FirebaseUser.getToken() instead.
            uid = user.getUid();
        }

        mUserReference = FirebaseDatabase.getInstance().getReference().child("user").child(uid);


        textoUsuario = (TextView)findViewById(R.id.text_user_nome);


        /*
        Button botaoMapas = (Button) findViewById(R.id.buttonMapas);
        botaoMapas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapas = new Intent(Acessar.this, MapasEscolas.class);
                startActivity(mapas);
            }
        });
        */

        Button listaEscolas = (Button)findViewById(R.id.buttonListaEscolas);
        listaEscolas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listaEscolaIntent = new Intent(Acessar.this, ListaEscolas.class);
                startActivity(listaEscolaIntent);
            }
        });

        Button botaoEditarPerfil = (Button)findViewById(R.id.buttonEditarPerfil);
        botaoEditarPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent editarPerfil = new Intent(Acessar.this, EditarPerfil.class);
                startActivity(editarPerfil);
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();

        ValueEventListener userListner = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                User user = dataSnapshot.getValue(User.class);
                 if(user != null){
                     textoUsuario.setText("Olá " + user.nome + " " + user.sobrenome + " !!");
                }

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        };
        mUserReference.addValueEventListener(userListner);
    }
}
