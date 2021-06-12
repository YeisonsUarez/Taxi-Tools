package com.taxi.taxitools.pantallas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.taxi.taxitools.R;
import com.taxi.taxitools.adapters.AdapterMenu;
import com.taxi.taxitools.modelos.ItemMenu;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    RecyclerView rv_menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        rv_menu= findViewById(R.id.rv_menu);
        rv_menu.setLayoutManager(new LinearLayoutManager(this));
        rv_menu.setAdapter( new AdapterMenu(getItemsMenu(), getBaseContext(), new AdapterMenu.onItemClickListener() {
            @Override
            public void onItemClick(ItemMenu item, int posicion) {
                switch (item.titulo){
                    case "Viajes":
                        startActivity(new Intent(HomeActivity.this,Viajes.class));
                        break;
                    case "Crear ruta de transporte colaborativo":
                        break;
                    case "Iniciar como domiciliario":
                        break;
                    case "Ver sugerencia de rutas":
                        startActivity(new Intent(HomeActivity.this,SugerenciaRutas.class));
                        break;

                }
            }
        }));

    }
    public ArrayList<ItemMenu> getItemsMenu(){
        ArrayList<ItemMenu> itemMenus= new ArrayList<>();
        itemMenus.add(new ItemMenu("Viajes","Te mostraremos desde donde recoger al pasajero y a donde llevarlo, y el precio\n" +
                "será establecido\n" +
                "por el taxímetro.",R.drawable.viaje));
        itemMenus.add(new ItemMenu("Crear ruta de transporte colaborativo","Podrás establecer tu punto de partida y de llegada, al igual que la tarifa \n" +
                "mínima por pasajero.",R.drawable.colaborativo));
        itemMenus.add(new ItemMenu("Iniciar como domiciliario","Te mostraremos desde donde recoger el pedido y a donde llevarlo.",R.drawable.itemdomicilio));
        itemMenus.add(new ItemMenu("Ver sugerencia de rutas","Te mostraremos las rutas con mayor flujo de pasajeros.", R.drawable.taxi));
        return itemMenus;
    }
}