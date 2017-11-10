package com.example.joudar.ecf2_regate;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by joudar on 08/11/17.
 */

public class DatabaseManager  extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "baseTest.db";
    private static final int DATABASE_VERSION = 1;

    public DatabaseManager(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public List<RegateAfich> readRegate(){

        List<RegateAfich> listRegs = new ArrayList<>();

        //sql

        //String strSql = "select * from regate order by  date_regate desc";
        String strSql ="SELECT * FROM regate WHERE regate.id_challenge = 1";
        Cursor cursor = this.getReadableDatabase().rawQuery(strSql,null);
        cursor.moveToNext();
        while(!cursor.isAfterLast()) {
            RegateAfich reg = new RegateAfich(cursor.getInt(0),cursor.getString(1),cursor.getInt(2), new Date( cursor.getLong(3)),
                    cursor.getInt(4),cursor.getInt(5));

            listRegs.add(reg);
            cursor.moveToNext();


        }
        cursor.close();






        return listRegs;
    }


}

