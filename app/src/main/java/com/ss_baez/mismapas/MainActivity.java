package com.ss_baez.mismapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irMapa(View v){

        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);

    }

    public void irMapaCiencia(View v){

        Intent intent = new Intent(this, MapsCienciasActivity.class);
        startActivity(intent);

    }

    public  void irMapaMedicina(View v){

        Intent intent = new Intent(this, MapsMedicinaActivity.class);
        startActivity(intent);

    }

    public  void irMapaPoliticas(View v){

        Intent intent = new Intent(this, MapsPoliticasActivity.class);
        startActivity(intent);

    }


}
