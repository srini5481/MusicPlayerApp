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

        final ArrayList<Category> lang = new ArrayList<Category>();
        lang.add(new Category("Hindi"));
        lang.add(new Category("Telugu"));
        lang.add(new Category("Kannada"));
        lang.add(new Category("Other"));

        // Populating Grid view
        LangAdapter adapter = new LangAdapter(this, lang);
        GridView gridView = (GridView) findViewById(R.id.grid);
        gridView.setAdapter(adapter);

        // lauching Song list activity with right category details
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                Intent songListIntent = new Intent(MainActivity.this, SongsList.class);
                songListIntent.putExtra("Category", lang.get(position));
                startActivity(songListIntent);

            }
        });
    }
}
