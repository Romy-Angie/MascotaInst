package com.romychsa.favorito_mascota.Fragment;

import com.romychsa.favorito_mascota.Adaptador.MascotaAdaptador;
import com.romychsa.favorito_mascota.Adaptador.PerfilMascotaAdaptador;
import com.romychsa.favorito_mascota.Pojo.Mascota;

import java.util.ArrayList;

public interface IPerfilFragment {

    public void generarLinearLayoutVertical();
    public void generarGridLayout();

    public PerfilMascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas);

    public void inicializarAdaptadorRV(PerfilMascotaAdaptador adaptador);

}
