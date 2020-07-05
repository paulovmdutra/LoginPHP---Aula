package com.tutorialandroidphp.loginphp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    private Button mBtnRegistrarUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mBtnRegistrarUsuario = (Button)findViewById(R.id.btnRegistrar);

    }

    public void showRegistrarUsuario(View view){

        Intent it = new Intent(this, RegistrarUsuarioActivity.class);
        startActivity(it);

    }

}
