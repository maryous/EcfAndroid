package com.example.joudar.ecf2_regate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView regateView;
    private RegateAfich regateAfich;
    private DatabaseManager databaseManager;
   // public final static String ID_Extra ="com.example.joudar.ecf2_regate._ID";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tuto extra
       // intent.putExtra("idregate",regateView.getItemAtPosition(id).toString());


        regateView = (ListView) findViewById(R.id.listRegate);
        databaseManager= new DatabaseManager(this);

        List<RegateAfich> regs = databaseManager.readRegate();
        ArrayAdapter<RegateAfich> test = new ArrayAdapter<RegateAfich>(MainActivity.this, android.R.layout.simple_list_item_1, regs);
        regateView.setAdapter(test);

        regateView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                RegateAfich regate = (RegateAfich) regateView.getItemAtPosition(position);
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                int idRegate = regate.getId_regate();
                System.out.println(idRegate);
                intent.putExtra("idRegate", idRegate);

              //  intent.putExtra(ID_Extra,String.valueOf(id));
               startActivity(intent);

            }
        });


            /*  for( ScoreData score : scores) {

            scoreView.append(score.toString() + "\n\n");*/

    }
}

