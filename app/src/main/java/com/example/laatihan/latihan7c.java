package com.example.laatihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class latihan7c extends AppCompatActivity {

    Button BtnBackc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan7c);

        BtnBackc = findViewById(R.id.backf);
        BtnBackc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BackcDiKlik();
            }
        });
    }

    private void BackcDiKlik() {
        Intent intentbackc = new Intent(this, latihan7a.class);
        startActivity(intentbackc);
    }
}