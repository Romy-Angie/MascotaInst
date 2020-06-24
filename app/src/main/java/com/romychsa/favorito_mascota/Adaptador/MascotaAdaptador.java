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
import com.romychsa.favorito_mascota.db.ConstructorMascotas;

import java.util.ArrayList;

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {
    ArrayList<Mascota> mascotas;
    Activity activity;


    public MascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas =mascotas;
        this.activity = activity;

    }

    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v =LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas,parent, false);
        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final MascotaViewHolder mascotaViewHolder, int position) {
        final Mascota mascota = mascotas.get(position);
        mascotaViewHolder.tvNombre.setText(mascota.getNombre());
        mascotaViewHolder.imgMascota.setImageResource(mascota.getFoto());
        mascotaViewHolder.tvRanking.setText(String.valueOf(mascota.getRanking()));

       //Darle like a la mascota
       mascotaViewHolder.btnHuesoblanco.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(activity, "Me gusta " + mascota.getNombre(), Toast.LENGTH_SHORT).show();

               ConstructorMascotas constructorMascotas = new ConstructorMascotas(activity);
               constructorMascotas.darLike(mascota);
               mascotaViewHolder.tvRanking.setText(String.valueOf(constructorMascotas.obtenerLikesMascota(mascota)));

           }
       });


    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }


    public static class MascotaViewHolder extends RecyclerView.ViewHolder{
        private TextView tvNombre;
        private ImageView imgMascota;
        private TextView tvRanking;
        private ImageButton btnHuesoblanco;

        public MascotaViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNombre =(TextView)itemView.findViewById(R.id.tvNombre);
            imgMascota =(ImageView) itemView.findViewById(R.id.imgMascota);
            tvRanking =(TextView)itemView.findViewById(R.id.tvRanking);
            btnHuesoblanco =(ImageButton)itemView.findViewById(R.id.btnHuesoblanco);

        }


    }


}

