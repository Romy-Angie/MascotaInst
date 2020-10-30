package com.romychsa.favorito_mascota.Notificaciones;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;

public class NotificationIDToken extends FirebaseMessagingService {

    private static final String TAG = "FIREBASE TOKEN";

    @Override
    public void onNewToken(@NonNull String token){
        Log.d(TAG, "Refresh token:" +  token);
        sendRegistrationToServer(token);
    }

    private void sendRegistrationToServer(String token){
        Log.d(TAG, token);
    }

}
