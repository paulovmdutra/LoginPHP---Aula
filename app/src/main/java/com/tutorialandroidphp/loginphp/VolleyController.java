package com.tutorialandroidphp.loginphp;

import android.content.Context;

public abstract class VolleyController {

    protected Context context;

    protected String baseUrl = "http://192.168.15.153:8080/phpandroidaula/";


    protected VolleyController(Context context){
        this.context = context;
    }


}
