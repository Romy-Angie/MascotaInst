package com.romychsa.favorito_mascota.Fragment;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mikhaellopez.circularimageview.CircularImageView;
import com.romychsa.favorito_mascota.Adaptador.MascotaAdaptador;
import com.romychsa.favorito_mascota.Adaptador.PerfilMascotaAdaptador;
import com.romychsa.favorito_mascota.Pojo.Mascota;
import com.romychsa.favorito_mascota.R;

import java.util.ArrayList;


public class PerfilFragment extends Fragment {

    private ArrayList<Mascota> mascotas;
    private RecyclerView listafotosMiMascotas;


    public PerfilFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_perfil, container, false);
        CircularImageView circularImageView = (CircularImageView) v.findViewById(R.id.circularImageView);

// Set Color
        circularImageView.setCircleColor(Color.BLACK);
// or with gradient
        circularImageView.setBorderColorStart(Color.rgb(161, 24, 109));
        circularImageView.setBorderColorEnd(Color.rgb(244, 76, 181));
        circularImageView.setBorderColorDirection(CircularImageView.GradientDirection.TOP_TO_BOTTOM);
// Add Shadow with default param
        circularImageView.setShadowRadius(30f);
        circularImageView.setShadowColor(Color.BLACK);
        circularImageView.setShadowGravity(CircularImageView.ShadowGravity.BOTTOM);


        listafotosMiMascotas = (RecyclerView)v.findViewById(R.id.rvMiMascota);
        GridLayoutManager glm = new GridLayoutManager(getActivity(),3);
        glm.setOrientation(LinearLayoutManager.VERTICAL);

        listafotosMiMascotas.setLayoutManager(glm);
        inicializarListaContactos();
        inicializarAdaptador();


        return v;
    }

    public PerfilMascotaAdaptador adaptador;
    public void inicializarAdaptador(){
        adaptador = new PerfilMascotaAdaptador(mascotas, getActivity());
        // MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listafotosMiMascotas.setAdapter(adaptador);
    }

    public void inicializarListaContactos(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(1,"Lucho",R.drawable.pet1, 9));
        mascotas.add(new Mascota(1,"Lucho",R.mipmap.l1, 2));
        mascotas.add(new Mascota(1,"Lucho",R.mipmap.l2, 2));
        mascotas.add(new Mascota(1,"Lucho",R.mipmap.l3, 5));
        mascotas.add(new Mascota(1, "Lucho",R.mipmap.l4,5 ));
        mascotas.add(new Mascota(1, "Lucho",R.mipmap.l5, 2));
        mascotas.add(new Mascota(1,"Lucho",R.mipmap.l6, 4));
        mascotas.add(new Mascota(1, "Lucho",R.mipmap.l7, 5));
        mascotas.add(new Mascota(1, "Lucho",R.mipmap.l8, 5));
    }

}
