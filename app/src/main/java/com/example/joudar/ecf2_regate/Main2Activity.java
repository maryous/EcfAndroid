package com.example.joudar.ecf2_regate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class Main2Activity extends AppCompatActivity {
    private ListView regatView;
    private ScoreModel scoreModel;
    private DatabaseManager1 databaseManager1;
    //String passedVar = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        int idRegate = intent.getIntExtra("idRegate", 0);
       // final Intent intent = new Intent(this,Main2Activity.class);

        regatView = (ListView) findViewById(R.id.listscore);
        databaseManager1= new DatabaseManager1(this);

        final List<ScoreModel> scors = databaseManager1.readScore(idRegate);
        ArrayAdapter<ScoreModel> test = new ArrayAdapter<ScoreModel>(Main2Activity.this, android.R.layout.simple_list_item_1, scors);

      //  passedVar = getIntent().getStringExtra(MainActivity.ID_Extra);


        regatView.setAdapter(test);
    }
}
