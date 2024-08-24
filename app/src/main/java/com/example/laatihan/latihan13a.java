package com.example.laatihan;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

public class latihan13a extends AppCompatActivity {
    protected Cursor cursor;
    DataBaseHelper dbHelper;
    TextView edtNIM, edtNama, edtJurusan, edtAlamat, edtEmail, edtTelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan13a);

        dbHelper = new DataBaseHelper(this);
        edtNIM = findViewById(R.id.eTnim2);
        edtNama = findViewById(R.id.eTnama2);
        edtJurusan = findViewById(R.id.eTjurusan2);
        edtAlamat = findViewById(R.id.eTalamat2);
        edtEmail = findViewById(R.id.eTemail2);
        edtTelp = findViewById(R.id.eTtelp2);

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM dataMahasiswa WHERE nama = '" +
                getIntent().getStringExtra("nama") + "'", null);
        cursor.moveToFirst();

        {
            cursor.moveToPosition(0);
            edtNIM.setText(cursor.getString(0).toString());
            edtNama.setText(cursor.getString(1).toString());
            edtJurusan.setText(cursor.getString(2).toString());
            edtAlamat.setText(cursor.getString(3).toString());
            edtEmail.setText(cursor.getString(4).toString());
            edtTelp.setText(cursor.getString(5).toString());
        }

    }
}