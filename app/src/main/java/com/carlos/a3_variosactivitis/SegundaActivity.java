package com.carlos.a3_variosactivitis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundaActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnVolver;
    Button btnIra3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        btnVolver = findViewById((R.id.btn2));
        btnVolver.setOnClickListener(this);
        btnIra3 = findViewById(R.id.btn3);

        // BTN 3
        // Otra forma de ir a otra activity
        btnIra3.setOnClickListener(view -> {
            Intent ira3 = new Intent(this,TerceraActivity.class);
            startActivity(ira3);
        });


    }

    // BTN 2
    @Override
    public void onClick(View view) {
        // Para cambiar de activity lo primero
        // que haremos sera crearnos el Intent
        // 1 - Le diremos en el primer campo desde donde le llamamos y en el segundo a donde queremos ir
        Intent irActivity2 = new Intent(SegundaActivity.this,MainActivity.class);

        // 2 - Lanzamos el activity con el metodo startActivity
        startActivity(irActivity2);
    }


}