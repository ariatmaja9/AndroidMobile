package com.example.laatihan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class latihan10b extends AppCompatActivity {
    protected Cursor cursor;

    DataBaseHelper dbHelper;
    AppCompatButton btnSimpan;
    EditText edtNIM, edtNama, edtJurusan, edtAlamat, edtEmail, edtTelp;
    String sql;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan10b);

        dbHelper = new DataBaseHelper(this);

        btnSimpan = findViewById(R.id.btnkirim);
        edtNIM = findViewById(R.id.eTnim);
        edtNama = findViewById(R.id.eTnama);
        edtJurusan = findViewById(R.id.eTjurusan);
        edtAlamat = findViewById(R.id.eTalamat);
        edtEmail = findViewById(R.id.eTemail);
        edtTelp = findViewById(R.id.eTtelp);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                sql="insert into dataMahasiswa (nim, nama, jurusan, alamat, email, no_tlp) values ('"+
                        edtNIM.getText().toString()+"','"+
                        edtNama.getText().toString()+"','"+
                        edtJurusan.getText().toString()+"','"+
                        edtAlamat.getText().toString()+"','"+
                        edtEmail.getText().toString()+"','"+
                        edtTelp.getText().toString()+"')";

                db.execSQL(sql);

                Toast.makeText(getApplicationContext(), "Data Tersimpan....", Toast.LENGTH_LONG).show();
                finish();

                Intent i = new Intent(latihan10b.this, latihan9a.class);
                startActivity(i);
            }
        });
    }
}