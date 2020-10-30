package com.romychsa.favorito_mascota.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.romychsa.favorito_mascota.Adaptador.PerfilMascotaAdaptador;
import com.romychsa.favorito_mascota.Fragment.PerfilFragment;
import com.romychsa.favorito_mascota.R;

public class ConfigCuenta extends AppCompatActivity implements View.OnClickListener {
    private EditText editTextUsuario;
    private Button btnEnviar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.config_cuenta);

        Toolbar miActionBar = (Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        editTextUsuario=(EditText)findViewById(R.id.etAgregar);
        btnEnviar =(Button)findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(this);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_items, menu);
        return super.onCreateOptionsMenu(menu);

    }

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

            case R.id.mConfigCuenta:
                Intent h = new Intent(this, ConfigCuenta.class);
                startActivity(h);
                break;

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(ConfigCuenta.this, PerfilMascotaAdaptador.class);
        startActivity(intent);
    }
}
