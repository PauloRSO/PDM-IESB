package br.com.paulogabriel.pdm.Atividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import br.com.paulogabriel.pdm.Classes.User;
import br.com.paulogabriel.pdm.R;

public class EditarPerfil extends AppCompatActivity {

    private DatabaseReference mDatabase;
    private EditText textNome;
    private EditText textSobrenome;
    private String uid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_perfil);

        textNome = (EditText)findViewById(R.id.editarPerfil_nome);
        textSobrenome = (EditText)findViewById(R.id.editarPerfil_sobrenome);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        uid = null;
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {

            // The user's ID, unique to the Firebase project. Do NOT use this value to
            // authenticate with your backend server, if you have one. Use
            // FirebaseUser.getToken() instead.
            uid = user.getUid();
        }

        Button okWriteUser = (Button) findViewById(R.id.buttonEditar);
        okWriteUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                writeNewUser(uid, textNome.getText().toString(), textSobrenome.getText().toString());
                finish();
            }
        });




    }

    private void writeNewUser(String userId, String nome, String sobrenome){
        User usuario = new User(nome, sobrenome);

        mDatabase.child("user").child(userId).setValue(usuario);
    }
}
