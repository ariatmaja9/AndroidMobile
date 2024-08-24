package com.example.laatihan;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class latihan10a extends AppCompatActivity {
    String daftar[];
    Menu menu;
    ListView lstvData;
    protected Cursor cursor;
    DataBaseHelper dbCenter;
    public static latihan10a da;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan10a);

        da= this;
        dbCenter= new DataBaseHelper(this);
        RefreshList();
    }

    private void RefreshList() {
        SQLiteDatabase db = dbCenter.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM DataMahasiswa", null);

        daftar = new String[cursor.getCount()];
        cursor.moveToFirst();
        for (int cc=0;cc<cursor.getCount();cc++){
            cursor.moveToPosition(cc);
            daftar[cc]=cursor.getString(1).toString();
        }
        lstvData = findViewById(R.id.ListViewData);
        lstvData.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,daftar));

        lstvData.setSelected(true);

        lstvData.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                final String Selection=daftar[i];
                final CharSequence[] dialogitem={"Lihat Data", "Update Data", "Delete Data"};
                AlertDialog.Builder builder = new AlertDialog.Builder(latihan10a.this);
                builder.setTitle("Pilihan");
                builder.setItems(dialogitem, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int item) {
                        switch (item) {
                            case 0:
                                Intent i = new Intent(getApplicationContext(),
                                        latihan13a.class);
                                i.putExtra("nama", Selection);
                                startActivity(i);
                                break;

                            case 1:
                                Intent j = new Intent(getApplicationContext(),
                                        latihan14a.class);
                                j.putExtra("nama", Selection);
                                startActivity(j);
                                break;
                            case 2:
                                new AlertDialog.Builder(latihan10a.this)
                                        .setTitle("Hapus Data")
                                        .setMessage("Apakah kamu yakin hapus data ini?")
                                        .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                SQLiteDatabase db = dbCenter.getWritableDatabase();
                                                String sql = "DELETE FROM DataMahasiswa WHERE nama ='" + Selection + "'";
                                                db.execSQL(sql);
                                                RefreshList();
                                            }
                                        })
                                        .setNegativeButton("Tidak", null)
                                        .show();
                                break;
                        }
                    }
                });
                builder.create().show();
            }
        });
    }
}