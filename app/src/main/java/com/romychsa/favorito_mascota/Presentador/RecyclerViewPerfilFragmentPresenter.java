package com.romychsa.favorito_mascota.Presentador;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.romychsa.favorito_mascota.Fragment.IPerfilFragment;
import com.romychsa.favorito_mascota.Fragment.PerfilFragment;
import com.romychsa.favorito_mascota.Pojo.Mascota;
import com.romychsa.favorito_mascota.RestApi.EndPointsAPI;
import com.romychsa.favorito_mascota.RestApi.adapter.RestApiAdapter;
import com.romychsa.favorito_mascota.RestApi.model.MascotaResponse;
import com.romychsa.favorito_mascota.db.ConstructorMascotas;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RecyclerViewPerfilFragmentPresenter implements IRecyclerViewFragmentPresenter {
    private IPerfilFragment iPerfilFragment;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascota> mascotas1;
    private ArrayList<Mascota> mascotas2;

    public RecyclerViewPerfilFragmentPresenter(IPerfilFragment iPerfilFragment, Context context) {
        this.iPerfilFragment = iPerfilFragment;
        this.context = context;
        //obtenerMascotasBaseDatos();
        ObtenerMediosRecientes();

    }

    @Override
    public void obtenerMascotasBaseDatos() {

    }

    @Override
    public void mostrarMascotas() {
        iPerfilFragment.inicializarAdaptadorRV(iPerfilFragment.crearAdaptador(mascotas2));
        iPerfilFragment.generarGridLayout();
    }

    @Override
    public void ObtenerMediosRecientes() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Gson gsonMediaRecent = restApiAdapter.construyeGsonDeserializadorMediaRecentPerfil();
        EndPointsAPI endPointsAPI = restApiAdapter.establecerConexionRestApiInstagram(gsonMediaRecent);
        Call<MascotaResponse> mascotaResponseCall = endPointsAPI.getRecentMedia();


        mascotaResponseCall.enqueue(new Callback<MascotaResponse>() {
            @Override
            public void onResponse(Call<MascotaResponse> call, Response<MascotaResponse> response) {
                MascotaResponse mascotaResponse = response.body();
                mascotas1 = mascotaResponse.getMascotas();
                mostrarMascotas();
            }

            @Override
            public void onFailure(Call<MascotaResponse> call, Throwable t) {
                Toast.makeText(context, "Algo paso durante el establecimiento de conexión", Toast.LENGTH_SHORT).show();
                Log.e("FALLO LA CONEXIÓN", t.toString());

            }
        });


        Call<MascotaResponse> mascotaResponseCall1 = endPointsAPI.getRecentMedia1();

        mascotaResponseCall1.enqueue(new Callback<MascotaResponse>() {
            @Override
            public void onResponse(Call<MascotaResponse> call, Response<MascotaResponse> response) {
                MascotaResponse mascotaResponse = response.body();
                mascotas2 = mascotaResponse.getMascotas();
                mostrarMascotas();
            }
            @Override
            public void onFailure(Call<MascotaResponse> call, Throwable t) {
                Toast.makeText(context, "Algo paso durante el establecimiento de conexión", Toast.LENGTH_SHORT).show();
                Log.e("FALLO LA CONEXIÓN", t.toString());
            }
        });

    }
}
