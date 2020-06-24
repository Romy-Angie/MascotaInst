package com.romychsa.favorito_mascota.Pojo;

public class Mascota_Like {
    private int id ;
    private int idmascota;
    private int like;

    public Mascota_Like() {

    }

    public Mascota_Like(int id, int idmascota, int like) {
        this.id = id;
        this.idmascota = idmascota;
        this.like = like;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdmascota() {
        return idmascota;
    }

    public void setIdmascota(int idmascota) {
        this.idmascota = idmascota;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }
}
