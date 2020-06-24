package com.romychsa.favorito_mascota.Pojo;

import android.os.Parcel;
import android.os.Parcelable;

public class Mascota  {
    private  int id;
    private String nombre;
    private int foto;
    private int ranking;


    public Mascota(int id, String nombre, int foto, int ranking) {
        this.id = id;
        this.nombre = nombre;
        this.foto = foto;
        this.ranking = ranking;
    }


    public Mascota( String nombre, int foto, int ranking) {

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

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

}
