package com.example.eduardopalacios.bdejemplo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    Button btnInsertar, btnMostrar;

    EditText ETPlaca,ETMarca,ETModelo,ETAnio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInsertar=findViewById(R.id.insertar);
        btnInsertar.setOnClickListener(this);

        btnMostrar=findViewById(R.id.mostrar);
        btnMostrar.setOnClickListener(this);

        ETPlaca=findViewById(R.id.placa);
        ETMarca=findViewById(R.id.marca);
        ETModelo=findViewById(R.id.modelo);
        ETAnio=findViewById(R.id.anio);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.insertar:

                break;


            case R.id.mostrar:

                break;

                default:
                    break;
        }
    }
}
