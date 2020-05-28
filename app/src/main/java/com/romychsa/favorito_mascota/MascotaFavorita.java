package com.romychsa.favorito_mascota;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Random;

public class MascotaFavorita extends AppCompatActivity  {


    private RecyclerView listaMascotas ;
    ArrayList<Mascota> fmascotas= new ArrayList<Mascota>();

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
        listaMascotas.setLayoutManager(llm);

        Bundle bundle = getIntent().getExtras();
        ArrayList<Mascota> mascotas;
        mascotas = bundle.getParcelableArrayList("lista");


        for (Mascota ma : mascotas){
            //int valorDado = r.nextInt(8);
            if( ma.getRanking() > 0 && fmascotas.size() <= 5){
                fmascotas.add(ma);
            }
        }


        inicializarAdaptador();

    }


    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_items, menu);
        return super.onCreateOptionsMenu(menu);

    }

    public  MascotaAdaptador adaptador;
    public void inicializarAdaptador(){
        adaptador = new MascotaAdaptador(fmascotas, this);
        // MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }




}
