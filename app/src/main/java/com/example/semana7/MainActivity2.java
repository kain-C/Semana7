package com.example.semana7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView textNombre, textApellidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textNombre = (TextView) findViewById(R.id.textNombre);
        textApellidos = (TextView) findViewById(R.id.testApellido);

        String nombre = getIntent().getStringExtra("nombre");
        String apellidos = getIntent().getStringExtra("apellido");

        textNombre.setText(nombre);
        textApellidos.setText(apellidos);

    }
}