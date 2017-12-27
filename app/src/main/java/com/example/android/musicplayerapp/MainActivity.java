package com.example.android.musicplayerapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.attr.id;
import static android.R.id.text1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ArrayList<Category> lang = new ArrayList<Category>();

        lang.add(new Category("Hindi"));
        lang.add(new Category("Telugu"));
        lang.add(new Category("Kannada"));
        lang.add(new Category("Other"));


        LangAdapter adapter = new LangAdapter(this,lang);

        GridView listView = (GridView) findViewById(R.id.grid);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                // DO something

                /*Toast.makeText(
                        getApplicationContext(),
                        ((TextView) v.findViewById(R.id.Category))
                                .getText(), Toast.LENGTH_SHORT).show();*/

                TextView langCatTextView = (TextView) findViewById(R.id.Category);

                langCatTextView.setOnClickListener(new View.OnClickListener() {
                    // The code in this method will be executed when the numbers View is clicked on.
                    @Override
                    public void onClick(View view) {
                        Intent numbersIntent = new Intent(MainActivity.this, SongsList.class);
                        startActivity(numbersIntent);
                    }
                });

            }
        });


       /* ArrayList<String> lang = new ArrayList<String>();

        // adding elements to array list

        lang.add("Hindi");
        lang.add("Telugu");
        lang.add("Kannada");
        lang.add("Others");
*/

        //LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        //TextView langView =new TextView(this);

/*

        for(int i =0; i<lang.size();i++){
            TextView langView =new TextView(this);
            langView.setText(lang.get(i));
            rootView.addView(langView);
        }
*/




       /* ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lang);


        TextView smList = (TextView) findViewById(android.R.id.text1);
        TextView textView = (TextView) View.findViewById(android.R.id.text1);
        smList.setBackgroundColor(Color.parseColor("#2196F3"));


        GridView listView = (GridView) findViewById(R.id.list);
        //listView.setBackgroundColor(Color.parseColor("#FFFF00"));
        listView.getChildAt(1).setBackgroundColor(Color.parseColor("#FFFF00"));


        listView.setAdapter(itemsAdapter);
        //ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lang);
*/

    }
}
