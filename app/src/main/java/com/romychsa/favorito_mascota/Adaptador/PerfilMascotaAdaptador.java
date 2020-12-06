package com.romychsa.favorito_mascota.Adaptador;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import com.mikhaellopez.circularimageview.CircularImageView;
import com.romychsa.favorito_mascota.Activity.ConfigCuenta;
import com.romychsa.favorito_mascota.Activity.MainActivity;
import com.romychsa.favorito_mascota.Fragment.PerfilFragment;
import com.romychsa.favorito_mascota.Notificaciones.EndPoints;
import com.romychsa.favorito_mascota.Notificaciones.RestAPI.adapter.RestApiAdapter;
import com.romychsa.favorito_mascota.Notificaciones.RestAPI.model.UsuarioResponse;
import com.romychsa.favorito_mascota.Pojo.Mascota;
import com.romychsa.favorito_mascota.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.provider.Settings.System.getString;

public class PerfilMascotaAdaptador extends RecyclerView.Adapter<PerfilMascotaAdaptador.PerfilMascotaViewHolder> {

    ArrayList<Mascota> mascotas;
    Activity activity;
    public static String CANAL_ID = "canal";
    private static final String TAG = "FIREBASE TOKEN";
    private String nomUsuario;


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
        //perfilmascotaViewHolder.imgMascota.setImageResource(mascota.getFoto());
         perfilmascotaViewHolder.tvRanking.setText(String.valueOf(mascota.getRanking()));

            Picasso.get ()
                    .load (mascota.getFoto())
                    .placeholder (R.drawable.ic_action_dog)
                    .error(R.drawable.ic_action_dog)
                    .into(perfilmascotaViewHolder.imgMascota);

    }


    @Override
    public int getItemCount() {
       return  mascotas.size();
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
