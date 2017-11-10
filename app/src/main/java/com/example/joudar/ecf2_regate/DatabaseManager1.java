package com.example.joudar.ecf2_regate;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joudar on 08/11/17.
 */

public class DatabaseManager1 extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "baseTest.db";
    private static final int DATABASE_VERSION = 1;

   // private static Date convertDate(String str) {
        //DateFormat formatter = null;
       // Date convertedDate = null;
       // formatter = new SimpleDateFormat("yyyy-MM-dd");
       // try {
         //   convertedDate = (Date) formatter.parse(str);
        //} catch (ParseException ex) {
//            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        //}

        //return convertedDate;
   // }

    public DatabaseManager1(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public List<ScoreModel> readScore(int idUtilisateur){

        List<ScoreModel> listScores = new ArrayList<>();

        //sql

        //String strSql = "select * from regate order by  date_regate desc";
        String strSql ="select* from participer";
                // "SELECT place, nom_voilier FROM participer  INNER JOIN voilier  ON participer.id_voilier=voilier.id_voilier WHERE participer.id_regate=? \n" +
                          // " "+idUtilisateur+ " ORDER BY place ASC";
        String id = Integer.toString(idUtilisateur);

        Cursor cursor = this.getReadableDatabase().rawQuery(strSql,null);
        cursor.moveToNext();
        while(!cursor.isAfterLast()) {
            /*RegateAfich reg = new RegateAfich(cursor.getInt(0),cursor.getString(1),cursor.getInt(2), new Date(cursor.getLong(3)),
                    cursor.getInt(4),cursor.getInt(5),cursor.getInt(6));*/
            ScoreModel score = new ScoreModel(cursor.getInt(0), cursor.getInt(1),cursor.getInt(2),cursor.getString(3)
                    ,cursor.getString(4));


            listScores.add(score);
            cursor.moveToNext();


        }
        cursor.close();







        return listScores;
    }



}

