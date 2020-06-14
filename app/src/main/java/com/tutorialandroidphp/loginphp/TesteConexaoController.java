package com.tutorialandroidphp.loginphp;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

public class TesteConexaoController extends VolleyController {

    private static final String TAG = TesteConexaoController.class.getName();

    protected TesteConexaoController(Context context) {
        super(context);
    }

    public void testarConexao(){


        baseUrl += "public/teste/bancodedados/conexao";

        StringRequest stringRequest = new StringRequest(Request.Method.GET, baseUrl,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String message) {
                            Log.d(TAG, message);
                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Log.e(TAG, error.getMessage());
                        }
            });

        VolleyRequestQueue.getInstance(context).addToRequestQueue(stringRequest);

    }


}
