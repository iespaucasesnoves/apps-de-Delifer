package com.example.miguel.basedadesandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        Button btCancelar = findViewById(R.id.edit_vi_cancelar);
        btCancelar.setOnClickListener(
            // Cridam l'activity main
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent in=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(in);
                }
            }
        );
        Button btConfirmar = findViewById(R.id.edit_vi_confirmar);
        btConfirmar.setOnClickListener(
                // Cridam l'activity main
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent in=new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(in);
                    }
                }
        );
    }
}
