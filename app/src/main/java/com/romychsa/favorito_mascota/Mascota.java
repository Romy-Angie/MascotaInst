package com.romychsa.favorito_mascota;

import android.os.Parcel;
import android.os.Parcelable;

import static java.lang.System.in;

public class Mascota implements Parcelable {
    private String nombre;
    private int foto;
    private int ranking;

    public Mascota(String nombre, int foto, int ranking) {
        this.nombre = nombre;
        this.foto = foto;
        this.ranking = ranking;
    }

    protected Mascota(Parcel in) {
        nombre = in.readString();
        foto = in.readInt();
        ranking = in.readInt();
    }

    public static final Creator<Mascota> CREATOR = new Creator<Mascota>() {
        @Override
        public Mascota createFromParcel(Parcel in) {
            return new Mascota(in);
        }

        @Override
        public Mascota[] newArray(int size) {
            return new Mascota[size];
        }
    };

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


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nombre);
        parcel.writeInt(foto);
        parcel.writeInt(ranking);

    }

}
