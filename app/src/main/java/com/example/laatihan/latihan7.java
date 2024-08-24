package com.example.laatihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class latihan7 extends AppCompatActivity {

    Button BtnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan7);

        BtnGo = findViewById(R.id.btngo);
        BtnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tombolGoDiKlik();
            }
        });
    }

    private void tombolGoDiKlik() {
        Intent intentGo = new Intent(this, latihan7a.class);
        startActivity(intentGo);
    }
}