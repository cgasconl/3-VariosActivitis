package com.carlos.a3_variosactivitis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnIr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIr = findViewById((R.id.btn1));

        btnIr.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        // Para cambiar de activity lo primero
        // que haremos sera crearnos el Intent
        // 1 - Le diremos en el primer campo desde donde le llamamos y en el segundo a donde queremos ir
        Intent irActivity2 = new Intent(MainActivity.this,SegundaActivity.class);

        // 2 - Lanzamos el activity con el metodo startActivity
        startActivity(irActivity2);

    }
}