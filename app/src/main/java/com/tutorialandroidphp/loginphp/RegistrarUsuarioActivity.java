package com.tutorialandroidphp.loginphp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.blankj.utilcode.util.NetworkUtils;
import com.google.android.material.snackbar.Snackbar;

public class RegistrarUsuarioActivity extends AppCompatActivity {

    private EditText mEdtNome;
    private EditText mEdtUsuario;
    private EditText mEdtEmail;
    private EditText mEdtSenha;
    private EditText mEdtConfirmarSenha;

    private Button mBtnConfirmar;
    private View mFormView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_usuario);

        mEdtNome = (EditText)findViewById(R.id.edtNome);
        mEdtSenha = (EditText)findViewById(R.id.edtSenha);
        mEdtEmail = (EditText)findViewById(R.id.edtEmail);
        mEdtUsuario = (EditText)findViewById(R.id.edtUsuario);

        mBtnConfirmar = (Button)findViewById(R.id.btnConfirmar);

        mFormView = findViewById(R.id.formView);

    }

    public void confirmar(View view){

        if (NetworkUtils.isConnected()){

            Snackbar.
                    make(mFormView, "Conexão ativa!", Snackbar.LENGTH_LONG ).
                    show();

        }
        else{

            Snackbar.
                    make(mFormView, "Não há conexão ativa!", Snackbar.LENGTH_LONG ).
                    show();

        }

    }



}

