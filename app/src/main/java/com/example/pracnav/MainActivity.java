package com.example.pracnav;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private View btnJardinero;
    private View btnUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJardinero = (Button) findViewById(R.id.btnjardinero);

        btnJardinero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencion = new Intent(MainActivity.this, Jardinero.class);
                startActivity(intencion);
            }
        });
        
        btnUsuario = (Button) findViewById(R.id.btnusuario);

        btnUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencion = new Intent(MainActivity.this, Usuario.class);
                startActivity(intencion);
            }
        });
    }
}