package br.com.paulogabriel.pdm.Atividades;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import br.com.paulogabriel.pdm.R;

public class Cadastrar extends AppCompatActivity {

    private EditText txtUser;
    private EditText txtPassword;
    private EditText txtPassword2;

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);

        txtUser = (EditText) findViewById(R.id.cadastrar_login);
        txtPassword = (EditText) findViewById(R.id.cadastrar_senha);
        txtPassword2 = (EditText) findViewById(R.id.cadastrar_senha_2);

        mAuth = FirebaseAuth.getInstance();

    }

    public void criarConta (View view){

        txtUser = (EditText) findViewById(R.id.cadastrar_login);
        txtPassword = (EditText) findViewById(R.id.cadastrar_senha);
        txtPassword2 = (EditText) findViewById(R.id.cadastrar_senha_2);

        mAuth = FirebaseAuth.getInstance();

        if(txtPassword.getText().toString().equals(txtPassword2.getText().toString())){
            mAuth.createUserWithEmailAndPassword(txtUser.getText().toString(), txtPassword2.getText().toString())
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                FirebaseUser user = mAuth.getCurrentUser();
                                Toast.makeText(Cadastrar.this, "Cadastro realizado com sucesso", Toast.LENGTH_LONG).show();
                                finish();
                            } else {
                                Toast.makeText(Cadastrar.this, "Cadastro inválido", Toast.LENGTH_LONG).show();
                            }

                        }
                    });
        }else{
            Toast.makeText(Cadastrar.this, "Senha Inválida", Toast.LENGTH_LONG).show();
        }


    }

}
