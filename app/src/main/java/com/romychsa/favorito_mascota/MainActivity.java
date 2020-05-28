package com.romychsa.favorito_mascota;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public  class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar miActionBar = (Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        listaMascotas = (RecyclerView)findViewById(R.id.rvMascotas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);

        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Lucho",R.drawable.pet1, 0));
        mascotas.add(new Mascota("Rocky", R.drawable.pet2, 0));
        mascotas.add(new Mascota("Silvestre",R.drawable.pet3, 0));
        mascotas.add(new Mascota("Sisi",R.drawable.pet5, 0));
        mascotas.add(new Mascota("Estrella", R.drawable.pet6, 0));
        mascotas.add(new Mascota("Doggy",R.drawable.pet7, 0));
        mascotas.add(new Mascota("Sami", R.drawable.pet8, 0));
        mascotas.add(new Mascota("Ricky",R.drawable.pet9, 0));

        inicializarAdaptador();


    }


    public  MascotaAdaptador adaptador;
    public void inicializarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas, this);
       // MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_items, menu);
        return super.onCreateOptionsMenu(menu);

    }

     @Override
     public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id==R.id.action_favorito){
            Intent intent = new Intent(MainActivity.this, MascotaFavorita.class);
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("lista", mascotas);
            intent.putExtras(bundle);
            startActivity(intent);
            return true;
        }
         return super.onOptionsItemSelected(item);
    }


}
