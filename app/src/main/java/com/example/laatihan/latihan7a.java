package com.example.laatihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class latihan7a extends AppCompatActivity {
    ImageView imgAri, imgAnanta, ImgNanda, imgAndre, imgAwan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan7a);

        imgAri = findViewById(R.id.imgAri);
        imgAri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgariklick();
            }
        });
        imgAnanta = findViewById(R.id.imgAnanta);
        imgAnanta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imganantaDiKlik();
            }
        });
        ImgNanda = findViewById(R.id.imgnanda);
        ImgNanda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgnandaDiKlik();
            }
        });
        imgAndre = findViewById(R.id.imgandre);
        imgAndre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAndreDiKlik();
            }
        });

        imgAwan = findViewById(R.id.imgawan);
        imgAwan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgAwanDiKlik();
            }
        });


    }

    private void imgAwanDiKlik() {
        Intent intAwan = new Intent(this, latihan7f.class);
        startActivity(intAwan);
    }


    private void imgAndreDiKlik() {
        Intent intAndre = new Intent(this, latihan7e.class);
        startActivity(intAndre);
    }

    private void imgnandaDiKlik() {
        Intent intnanda = new Intent(this, latihan7d.class);
        startActivity(intnanda);
    }

    private void imganantaDiKlik() {
        Intent intananta = new Intent(this, latihan7c.class);
        startActivity(intananta);
    }

    private void imgariklick() {
        Intent intAri = new Intent(this, latihan7b.class);
        startActivity(intAri);
    }
}