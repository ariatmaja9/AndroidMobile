package com.example.laatihan;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class latihan14a extends AppCompatActivity {
    DataBaseHelper dbHelper;
    AppCompatButton btnSimpan;
    EditText edtNIM, edtNama, edtJurusan, edtAlamat, edtEmail, edtTelp;
    String sqlText;
    protected Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan14a);

        dbHelper = new DataBaseHelper(this);
        btnSimpan = findViewById(R.id.btnkirim3);
        edtNIM = findViewById(R.id.eTnim3);
        edtNama = findViewById(R.id.eTnama3);
        edtJurusan = findViewById(R.id.eTjurusan3);
        edtAlamat = findViewById(R.id.eTalamat3);
        edtEmail = findViewById(R.id.eTemail3);
        edtTelp = findViewById(R.id.eTtelp3);

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM dataMahasiswa WHERE nama = '" +
                getIntent().getStringExtra("nama") + "'", null);

        if (cursor.moveToFirst()) {
            edtNIM.setText(cursor.getString(0));
            edtNama.setText(cursor.getString(1));
            edtJurusan.setText(cursor.getString(2));
            edtAlamat.setText(cursor.getString(3));
            edtEmail.setText(cursor.getString(4));
            edtTelp.setText(cursor.getString(5));
        }

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                sqlText = "UPDATE dataMahasiswa SET nama = '" + edtNama.getText().toString() +
                        "', jurusan = '" + edtJurusan.getText().toString() +
                        "', alamat = '" + edtAlamat.getText().toString() +
                        "', email = '" + edtEmail.getText().toString() +
                        "', no_tlp = '" + edtTelp.getText().toString() +
                        "' WHERE nim = '" + edtNIM.getText().toString() + "'";
                db.execSQL(sqlText);

                Toast.makeText(getApplicationContext(),
                        "Perubahan Data Tersimpan....", Toast.LENGTH_LONG).show();
                finish();

                Intent j = new Intent(latihan14a.this, latihan9a.class);
                startActivity(j);
            }
        });
    }
}

