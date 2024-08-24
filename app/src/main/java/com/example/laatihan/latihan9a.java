package com.example.laatihan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class latihan9a extends AppCompatActivity {
    AppCompatButton btnList, btnCreate, btnApk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan9a);

        btnList = findViewById(R.id.inputbtn3);
        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KetikaListDiKlik();
            }
        });
        btnCreate = findViewById(R.id.inputbtn1);
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KetikaCreateDiKlik();
            }
        });
        btnApk = findViewById(R.id.btnapk);
        btnApk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KetikaApkDiKlik();
            }
        });
    }

    private void KetikaApkDiKlik() {
        Intent intentApk = new Intent(this, latihan10c.class);
        startActivity(intentApk);
    }

    private void KetikaCreateDiKlik() {
        Intent intentCreate = new Intent(this, latihan10b.class);
        startActivity(intentCreate);
    }

    private void KetikaListDiKlik() {
        Intent intentList = new Intent(this, latihan10a.class);
        startActivity(intentList);
    }
}