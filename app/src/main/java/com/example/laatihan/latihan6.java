package com.example.laatihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class latihan6 extends AppCompatActivity {
    Button btnLatihanMain, btnLatihan4, btnLatihan5, btnLatihan7, btnLatihan9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan6);

        btnLatihanMain = findViewById(R.id.LatihanMain);

        btnLatihanMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ketikaTombolMainDiKlik();
            }
        });
        btnLatihan4 = findViewById(R.id.Latihan4);

        btnLatihan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KetikaTombol4DiKlik();
            }
        });
        btnLatihan5 = findViewById(R.id.Latihan5);

        btnLatihan5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KetikaTombol5DiKlik();
            }
        });
        btnLatihan7 = findViewById(R.id.latihan7);

        btnLatihan7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KetikaTombol7DiKlik();
            }
        });
        btnLatihan9 = findViewById(R.id.latihan9);

        btnLatihan9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tombol9DiKlik();
            }
        });
    }

    private void Tombol9DiKlik() {
        Intent intent9 = new Intent(this, latihan9a.class);
        startActivity(intent9);
    }

    private void KetikaTombol7DiKlik() {
        Intent intent7 = new Intent(this, latihan7.class);
        startActivity(intent7);
    }

    private void KetikaTombol5DiKlik() {
        Intent intent5 = new Intent( this,latihan5.class);
        startActivity(intent5);
    }

    private void KetikaTombol4DiKlik() {
        Intent intent4 = new Intent( this,latihan4.class);
        startActivity(intent4);
    }

    private void ketikaTombolMainDiKlik() {
        Intent intentMain = new Intent( this,MainActivity.class);
        startActivity(intentMain);
    }
}