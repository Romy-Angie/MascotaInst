package com.romychsa.favorito_mascota.Fragment;

import com.romychsa.favorito_mascota.Adaptador.MascotaAdaptador;
import com.romychsa.favorito_mascota.Pojo.Mascota;

import java.util.ArrayList;

public interface IRecyclerViewFragment  {

    public void generarLinearLayoutVertical();
    public void generarGridLayout();

    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas);
    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);


}
