package com.example.laatihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class latihan7b extends AppCompatActivity {
    Button BtnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan7b);

        BtnBack = findViewById(R.id.backf);
        BtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ketikaTombolBackDiKlik();
            }
        });
    }

    private void ketikaTombolBackDiKlik() {
        Intent intentback = new Intent(this, latihan7a.class);
        startActivity(intentback);
    }
}