package com.romychsa.favorito_mascota.db;

import android.content.ContentValues;
import android.content.Context;

import com.romychsa.favorito_mascota.Activity.Contacto;
import com.romychsa.favorito_mascota.Pojo.Mascota;
import com.romychsa.favorito_mascota.R;

import java.util.ArrayList;

public class ConstructorMascotas {
    private static final int LIKE =1;
    private Context context;


    public  ConstructorMascotas(Context context){ this.context =context;}

    public ArrayList<Mascota> obtenerDatos(){
        BaseDatos db = new BaseDatos(context);
        insertarMascotas(db);
        return db.obtenerTodasLasMascotas();

    }

    public void insertarMascotas(BaseDatos db){
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Lucho");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.pet1);

        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Rocky");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.pet2);

        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Silvestre");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.pet3);

        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Sisi");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.pet5);

        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Estrella");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.pet6);

        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Doggy");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.pet7);

        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Sami");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.pet8);

        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_NOMBRE, "Ricky");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTAS_FOTO, R.drawable.pet9);

        db.insertarMascota(contentValues);
    }

    public void darLike(Mascota mascota){
        BaseDatos db = new BaseDatos(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_LIKES_MASCOTA_ID_MASCOTA, mascota.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_LIKES_MASCOTA_NUMERO_LIKES, LIKE);
        db.insertarLikeMascota(contentValues);
    }

    public  int obtenerLikesMascota(Mascota mascota){
        BaseDatos db = new BaseDatos(context);
        return db.obtenerLikesMascotas(mascota);
    }

    public ArrayList<Mascota> obtenerFavoritoMascota(){
        BaseDatos db = new BaseDatos(context);
        ArrayList<Integer> Idmascota = db.obtenerIdCincoFavoritos();
        ArrayList<Mascota> fmascota = db.obtenerCincoFavoritos(Idmascota);
        return fmascota;
    }


}
