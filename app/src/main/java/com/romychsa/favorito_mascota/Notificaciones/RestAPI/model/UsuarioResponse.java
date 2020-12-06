package com.romychsa.favorito_mascota.Notificaciones.RestAPI.model;

public class UsuarioResponse {
    private String id;
    private String token;
    private String nombre;
    private int ranking;
    private String urlfoto;


    public UsuarioResponse(String id, String token, String nombre, int ranking, String urlfoto) {
        this.id = id;
        this.token = token;
        this.nombre = nombre;
        this.ranking = ranking;
    }

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

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getUrlfoto() {
        return urlfoto;
    }

    public void setUrlfoto(String urlfoto) {
        this.urlfoto = urlfoto;
    }
}
