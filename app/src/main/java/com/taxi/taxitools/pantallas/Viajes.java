package com.taxi.taxitools.pantallas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.taxi.taxitools.R;
import com.taxi.taxitools.adapters.AdaptadorViajes;
import com.taxi.taxitools.modelos.ViajesModel;

import java.util.ArrayList;

public class Viajes extends AppCompatActivity {
    RecyclerView viajes;
    ImageButton atras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viajes);
        viajes= findViewById(R.id.rv_viajes);
        atras= findViewById(R.id.atrasviajes);
        viajes.setLayoutManager(new LinearLayoutManager(this));
        viajes.setAdapter(new AdaptadorViajes(getDatos(), getBaseContext(), new AdaptadorViajes.onItemClickListener() {
            @Override
            public void onItemClick(ViajesModel item, int posicion) {

            }
        }));
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    public ArrayList<ViajesModel> getDatos(){

        ArrayList<ViajesModel> viajesModels= new ArrayList<>();
        viajesModels.add(new ViajesModel("Cristian Parra","Punto de Partida: Cl. 20 # 23","Punto de llegada: Av. 42 # 43","3175668902"));
        viajesModels.add(new ViajesModel("Karol Cala","Punto de llegada: Av. 2B  # 3 -10","Punto de Partida: Cl 5 # 32-59","31122323"));
        viajesModels.add(new ViajesModel("Sergio Lipez","Punto de llegada: Av. 42 # 43","Punto de Partida: Cra. 23 # 21-10 Int 8","31122323"));
        viajesModels.add(new ViajesModel("Alejandro Muñoz","Punto de Partida: Cra. 36a # 104 - 128","Punto de llegada: Cl. 102 # 13 - 21...","31122323"));
        return viajesModels;

    }
}