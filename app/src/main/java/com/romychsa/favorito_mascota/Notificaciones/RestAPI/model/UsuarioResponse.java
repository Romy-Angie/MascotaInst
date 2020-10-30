package com.romychsa.favorito_mascota.Notificaciones.RestAPI.model;

public class UsuarioResponse {
    private String id;
    private String token;
    private String nombre;


    public UsuarioResponse(String id, String token, String nombre) {
        this.id = id;
        this.token = token;
        this.nombre = nombre;
    }

    public UsuarioResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
