package com.taxi.taxitools.pantallas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.taxi.taxitools.MainActivity;
import com.taxi.taxitools.R;

public class SugerenciaRutas extends AppCompatActivity {
    ImageButton atras;
    ConstraintLayout layout;
    private final int SPLASH_DISPLAY_LENGTH = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugerencia_rutas);
        atras= findViewById(R.id.atrassugerencias);
        layout= findViewById(R.id.constraintLayout2);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                layout.setVisibility(View.VISIBLE);
            }
        }, SPLASH_DISPLAY_LENGTH);
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}