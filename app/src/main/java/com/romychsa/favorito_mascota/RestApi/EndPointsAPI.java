package com.romychsa.favorito_mascota.RestApi;

import com.romychsa.favorito_mascota.RestApi.model.MascotaResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;

public interface EndPointsAPI {

 @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER)
    Call<MascotaResponse> getRecentMedia();

 @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER_2)
    Call<MascotaResponse> getRecentMedia1();

}

