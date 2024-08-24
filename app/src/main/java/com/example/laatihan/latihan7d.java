package com.example.laatihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class latihan7d extends AppCompatActivity {
    Button BtnBackd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan7d);

        BtnBackd = findViewById(R.id.backf);
        BtnBackd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BackdDiKlik();
            }
        });
    }

    private void BackdDiKlik() {
        Intent intentbackd = new Intent(this, latihan7a.class);
        startActivity(intentbackd);
    }
}