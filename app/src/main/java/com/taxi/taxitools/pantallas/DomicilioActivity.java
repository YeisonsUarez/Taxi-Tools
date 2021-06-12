package com.taxi.taxitools.pantallas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.taxi.taxitools.R;

public class DomicilioActivity extends AppCompatActivity {
    ConstraintLayout inicio, layoutLista;
    ImageButton atras, imagenMapa, atrasdomi2;
    Button iniciarViaje;
    private ListView mListView;
    int [] images = {R.drawable.pizzacn , R.drawable.usuario , R.drawable.paquete};
    String [] names = {"Pizza Cartoon" , "Cliente- Yeison Cala \n" , "Producto" };
    String [] descs = {"Dirección: av 44#43-12"+"\n"+"\n"+"Tel:3104234" , "Dirección de envio:"+"\n" +"Cl. 6#32-59"+"\n"+"\n"+"Tel:312659234" , "Ref: 425353"+"\n"+"\n"+"Cantidad: 1"+"\n"+"\n"+"Descripción:"+"\n"+ "Pizza extra grande, 8 prociones" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_domicilio);
        atras= findViewById(R.id.atrasdomi);
        atrasdomi2= findViewById(R.id.atrasdomi2);
        imagenMapa= findViewById(R.id.btn_mapa);
        inicio= findViewById(R.id.inicio);
        layoutLista= findViewById(R.id.layoutLista);
        mListView= findViewById(R.id.listaParra);
        iniciarViaje= findViewById(R.id.buttonIniciarentrega);
        MyAdapter adapter = new MyAdapter();
        mListView.setAdapter(adapter);
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        atrasdomi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layoutLista.setVisibility(View.GONE);
                inicio.setVisibility(View.VISIBLE);

            }
        });
        imagenMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inicio.setVisibility(View.GONE);
                layoutLista.setVisibility(View.VISIBLE);
            }
        });

    }
    class MyAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.itemdomicilio ,parent , false);
            TextView textView = convertView.findViewById(R.id.tv_titulo);
            TextView tvdesc = convertView.findViewById(R.id.tv_desc);
            ImageView imageView = convertView.findViewById(R.id.iv_banner);
            textView.setText(names[position]);
            tvdesc.setText(descs[position]);
            imageView.setImageResource(images[position]);
            return  convertView;
        }
    }


}
