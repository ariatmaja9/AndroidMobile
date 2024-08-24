package com.example.laatihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class latihan7e extends AppCompatActivity {
    Button Backe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan7e);

        Backe = findViewById(R.id.backf);
        Backe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BackeDiKlik();
            }
        });
    }

    private void BackeDiKlik() {
        Intent intentbacke = new Intent(this, latihan7a.class);
        startActivity(intentbacke);
    }
}