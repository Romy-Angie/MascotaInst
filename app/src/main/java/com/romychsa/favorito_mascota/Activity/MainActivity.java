package com.romychsa.favorito_mascota.Activity;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.tabs.TabLayout;
import com.romychsa.favorito_mascota.Adaptador.MascotaAdaptador;
import com.romychsa.favorito_mascota.Adaptador.PageAdapter;
import com.romychsa.favorito_mascota.Fragment.PerfilFragment;
import com.romychsa.favorito_mascota.Fragment.RecyclerViewFragment;
import com.romychsa.favorito_mascota.Pojo.Mascota;
import com.romychsa.favorito_mascota.R;

import java.util.ArrayList;

public  class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar miActionBar = (Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);


        toolbar =(Toolbar)findViewById(R.id.toolbar);
        tabLayout =(TabLayout)findViewById(R.id.tabLayout);
        viewPager =(ViewPager)findViewById(R.id.viewPager);
        setUpViewPager();

        if(toolbar != null){
            setSupportActionBar(toolbar);
        }


    }


    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_items, menu);
        return true;

    }

     @Override
     public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        switch (item.getItemId()){
            case R.id.mContacto:
                Intent i = new Intent(this, Contacto.class);
                startActivity(i);
                break;
            case R.id.mAcerca:
                Intent j = new Intent(this, AcercaDe.class);
                startActivity(j);
                break;

            case R.id.action_favorito:
                Intent intent = new Intent(MainActivity.this, MascotaFavorita.class);

                /*
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("lista", mascotas);
                intent.putExtras(bundle);

                */
                startActivity(intent);
                break;

        }

         return super.onOptionsItemSelected(item);
    }

    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add(new RecyclerViewFragment());
        fragments.add(new PerfilFragment());

        return fragments;
    }

    private void setUpViewPager(){
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_house);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_dog);

    }


}
