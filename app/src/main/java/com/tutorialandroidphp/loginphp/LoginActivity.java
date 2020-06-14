package com.tutorialandroidphp.loginphp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    private Button btnRegistrarUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnRegistrarUsuario = (Button)findViewById(R.id.btnRegistrar);

        TesteConexaoController testeConexaoController = new TesteConexaoController(this);
        testeConexaoController.testarConexao();

    }

    public void showRegistrarUsuario(View view){

        Intent it = new Intent(this, RegistrarUsuarioActivity.class);
        startActivity(it);

    }

}
