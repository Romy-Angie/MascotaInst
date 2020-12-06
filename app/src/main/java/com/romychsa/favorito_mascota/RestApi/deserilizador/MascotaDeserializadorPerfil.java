package com.romychsa.favorito_mascota.RestApi.deserilizador;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.romychsa.favorito_mascota.Pojo.Mascota;
import com.romychsa.favorito_mascota.RestApi.JsonKeys;
import com.romychsa.favorito_mascota.RestApi.model.MascotaResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Random;

public class MascotaDeserializadorPerfil implements JsonDeserializer<MascotaResponse> {

    @Override
    public MascotaResponse deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        Gson gson = new Gson();
        MascotaResponse mascotaResponse = gson.fromJson(json, MascotaResponse.class);
        JsonArray mascotaResponseData = json.getAsJsonObject().getAsJsonArray(JsonKeys.MEDIA_RESPONSE_ARRAY);

        mascotaResponse.setMascotas(deserializadorMascotaDeJson(mascotaResponseData));
        return mascotaResponse;

    }

    public ArrayList<Mascota> deserializadorMascotaDeJson (JsonArray mascotaResponseData){
        ArrayList<Mascota> mascotas = new ArrayList<>();
        for (int i=0 ; i<mascotaResponseData.size(); i++){

            JsonObject mascotaResponseDataObject = mascotaResponseData.get(i).getAsJsonObject();
            String id = mascotaResponseDataObject.get(JsonKeys.USER_ID).getAsString();
            String username = mascotaResponseDataObject.get(JsonKeys.USER_NAME).getAsString();
            String urlFoto = mascotaResponseDataObject.get(JsonKeys.MEDIA_URL).getAsString();

            Random r = new Random();
            int i1 = r.nextInt(10 - 1) + 1;

            Mascota mascotaActual = new Mascota();
            mascotaActual.setId(id);
            mascotaActual.setNombre(username);
            mascotaActual.setFoto(urlFoto);
            mascotaActual.setRanking(i1);

            mascotas.add(mascotaActual);
        }
        return mascotas;

    }
}
