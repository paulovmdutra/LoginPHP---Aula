package com.tutorialandroidphp.loginphp;

import android.content.Context;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

public class UsuarioController extends VolleyController {

    private static final String TAG = UsuarioController.class.getName();

    public UsuarioController(Context context) {
        super(context);
    }

    public void logar(Usuario usuario){

        JSONObject parametros = new JSONObject();

        try{

            parametros.put("login", usuario.login);
            parametros.put("senha", usuario.senha);

        }catch(JSONException e){
            Log.e(TAG, e.getMessage());
        }

        post("public/usuario/logar", parametros);

    }

    public void inserir(Usuario usuario){

        JSONObject parametros = new JSONObject();

        try{

            parametros.put("nome", usuario.nome);
            parametros.put("email", usuario.email);
            parametros.put("login", usuario.login);
            parametros.put("senha", usuario.senha);

        }catch(JSONException e){
            Log.e(TAG, e.getMessage());
        }

        post("public/usuario/logar", parametros);

    }


}
