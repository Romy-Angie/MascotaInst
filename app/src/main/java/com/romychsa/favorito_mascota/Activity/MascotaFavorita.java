package com.romychsa.favorito_mascota.Activity;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.romychsa.favorito_mascota.Adaptador.MascotaAdaptador;
import com.romychsa.favorito_mascota.Pojo.Mascota;
import com.romychsa.favorito_mascota.R;
import com.romychsa.favorito_mascota.db.BaseDatos;
import com.romychsa.favorito_mascota.db.ConstructorMascotas;

import java.util.ArrayList;

public class MascotaFavorita extends AppCompatActivity  {


    private RecyclerView listaMascotas ;
    private  ArrayList<Mascota> fmascotas ;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mascotas_favoritas);

        Toolbar miActionBar = (Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listaMascotas = (RecyclerView)findViewById(R.id.rvMascotas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);


        /*
        Bundle bundle = getIntent().getExtras();
        ArrayList<Mascota> mascotas;
        mascotas = bundle.getParcelableArrayList("lista");


        for (Mascota ma : mascotas){
            //int valorDado = r.nextInt(8);
            if( ma.getRanking() > 0 && fmascotas.size() <= 5){
                fmascotas.add(ma);
            }
        }

        */
        listaMascotas.setLayoutManager(llm);
        ConstructorMascotas constructorMascotas = new ConstructorMascotas(this);
        fmascotas = constructorMascotas.obtenerFavoritoMascota();
        inicializarAdaptador();


    }


    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_items, menu);
        return super.onCreateOptionsMenu(menu);

    }

    public MascotaAdaptador adaptador;
    public void inicializarAdaptador(){
        adaptador = new MascotaAdaptador(fmascotas, this);
        // MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }



}
