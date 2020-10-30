package com.romychsa.favorito_mascota.RestApi.adapter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.romychsa.favorito_mascota.RestApi.ConstantesRestApi;
import com.romychsa.favorito_mascota.RestApi.EndPointsAPI;
import com.romychsa.favorito_mascota.RestApi.deserilizador.MascotaDeserializador;
import com.romychsa.favorito_mascota.RestApi.deserilizador.MascotaDeserializadorPerfil;
import com.romychsa.favorito_mascota.RestApi.model.MascotaResponse;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestApiAdapter {

    public EndPointsAPI establecerConexionRestApiInstagram(Gson gson) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ConstantesRestApi.URL_BASIC_GRAPH)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        return retrofit.create(EndPointsAPI.class);
    }


    public Gson construyeGsonDeserializadorMediaRecent(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(MascotaResponse.class, new MascotaDeserializador());
        return gsonBuilder.create();
    }

    public Gson construyeGsonDeserializadorMediaRecentPerfil(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(MascotaResponse.class, new MascotaDeserializadorPerfil());
        return gsonBuilder.create();
    }
}
