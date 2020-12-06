package com.romychsa.favorito_mascota.Pojo;

import android.os.Parcel;
import android.os.Parcelable;

public class Mascota  {
    private String id;
    private String nombre;
    private String foto;
    private int ranking;



    public Mascota(String id, String nombre, String foto, int ranking) {
        this.id = id;
        this.nombre = nombre;
        this.foto = foto;
        this.ranking = ranking;
    }


    public Mascota( String nombre, String foto, int ranking) {

        this.nombre = nombre;
        this.foto = foto;
        this.ranking = ranking;
    }

    public Mascota(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

}
