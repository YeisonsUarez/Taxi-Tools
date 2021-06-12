package com.taxi.taxitools.pantallas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.taxi.taxitools.R;

public class MenuActivity extends AppCompatActivity {
    EditText editcorreo, editPass;
    Button ingresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        editcorreo= findViewById(R.id.editCorreo);
        editPass = findViewById(R.id.editPass);
        ingresar= findViewById(R.id.btn_login);
        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editcorreo.getText().toString().equals("taxitools@gmail.com") && editPass.getText().toString().equals("qwerty")){
                    startActivity(new Intent(MenuActivity.this, HomeActivity.class));
                    finish();
                }else{
                    Toast.makeText(MenuActivity.this, "Datos incorrectos por favor intenta de nuevo.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}