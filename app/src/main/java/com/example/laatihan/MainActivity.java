package com.example.laatihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnKeluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKeluar = findViewById(R.id.kembali);

        btnKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KembaliSaatDiKlik();
            }
        });
    }

    private void KembaliSaatDiKlik() {
        Intent intentK = new Intent( this,latihan6.class);
        startActivity(intentK);
    }
}