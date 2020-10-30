package com.romychsa.favorito_mascota.Notificaciones.RestAPI.adapter;

import com.romychsa.favorito_mascota.Notificaciones.ConstantesRestAPI;
import com.romychsa.favorito_mascota.Notificaciones.EndPoints;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestApiAdapter {
    public EndPoints establecerConexionRestAPI(){
        Retrofit retrofit  = new Retrofit.Builder()
                .baseUrl(ConstantesRestAPI.ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                ;

        return retrofit.create(EndPoints.class);
    }
}
