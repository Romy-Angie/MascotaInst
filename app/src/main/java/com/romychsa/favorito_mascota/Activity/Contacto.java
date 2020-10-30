package com.romychsa.favorito_mascota.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import javax.mail.Session;
import javax.mail.PasswordAuthentication;
import java.util.Properties;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.romychsa.favorito_mascota.JavaEmail.SendMail;
import com.romychsa.favorito_mascota.R;

public class Contacto extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextNombre;
    private EditText editTextCorreo;
    private EditText editTextComentario;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        Toolbar miActionBar = (Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        editTextNombre =(EditText)findViewById(R.id.etNombre);
        editTextCorreo =(EditText)findViewById(R.id.etCorreo);
        editTextComentario=(EditText)findViewById(R.id.etComentario);
        btnEnviar =(Button)findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(this);

    }

    private  void sendEmail(){
        String nombre = editTextNombre.getText().toString().trim();
        String email = editTextCorreo.getText().toString().trim();
        String comentario = editTextComentario.getText().toString().trim();
        SendMail sm = new SendMail(this, nombre, email, comentario);
        sm.execute();
    }

    @Override
    public void onClick(View view) {
        sendEmail();
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

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
}
