package com.example.laatihan;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper  extends SQLiteOpenHelper {
    public static final String db_name="DataKampus.db";
    public static final int version = 1;

    public DataBaseHelper(Context context){
        super(context, db_name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //membuat table
        String sql;
        sql="create table dataMahasiswa (nim text primary key, nama text not null, jurusan text not null, alamat text not null, email text not null, no_tlp text not null);";
        db.execSQL(sql);

        //input data table
        sql="insert into dataMahasiswa ('nim','nama','jurusan','alamat','email','no_tlp') VALUES ('2201010161','I Kadek Ari Atmaja','MTI','Ubud','kadekariatmaja9@gmail.com','082194359207');";
        db.execSQL(sql);
        sql="insert into dataMahasiswa ('nim','nama','jurusan','alamat','email','no_tlp') VALUES ('2201010162','I Kadek Ananta','MTI','Denpasar','ananta9@gmail.com','082194359307');";
        db.execSQL(sql);
        sql="insert into dataMahasiswa ('nim','nama','jurusan','alamat','email','no_tlp') VALUES ('2201010163','I Kadek Nanda','MTI','Denpasar','nantale9@gmail.com','082194359407');";
        db.execSQL(sql);
        sql="insert into dataMahasiswa ('nim','nama','jurusan','alamat','email','no_tlp') VALUES ('2201010164','I Kadek Andre','MTI','Nusa Dua','andre9@gmail.com','082194359507');";
        db.execSQL(sql);
        sql="insert into dataMahasiswa ('nim','nama','jurusan','alamat','email','no_tlp') VALUES ('2201010165','I Kadek Hermawan','MTI','Tabanan','hermawan9@gmail.com','082194359607');";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS dataMahasiswa");
    }
}
