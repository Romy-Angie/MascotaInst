package com.romychsa.favorito_mascota.Adaptador;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.romychsa.favorito_mascota.Pojo.Mascota;
import com.romychsa.favorito_mascota.R;

import java.util.ArrayList;

public class PerfilMascotaAdaptador extends RecyclerView.Adapter<PerfilMascotaAdaptador.PerfilMascotaViewHolder> {

    ArrayList<Mascota> mascotas;
    Activity activity;


    public PerfilMascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity) {
        this.mascotas = mascotas;
        this.activity = activity;

    }

    @NonNull
    @Override
    public PerfilMascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_miperfil, parent,false);
        return new PerfilMascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PerfilMascotaViewHolder perfilmascotaViewHolder, int position) {
        final Mascota mascota = mascotas.get(position);
        perfilmascotaViewHolder.imgMascota.setImageResource(mascota.getFoto());
        perfilmascotaViewHolder.tvRanking.setText(String.valueOf(mascota.getRanking()));
    }


    @Override
    public int getItemCount() {
        return mascotas.size();
    }


    public static class PerfilMascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgMascota;
        private TextView tvRanking;

        public PerfilMascotaViewHolder(@NonNull View itemView) {
            super(itemView);
            imgMascota =(ImageView) itemView.findViewById(R.id.imgMascota);
            tvRanking =(TextView)itemView.findViewById(R.id.tvRanking);

        }
    }
}
