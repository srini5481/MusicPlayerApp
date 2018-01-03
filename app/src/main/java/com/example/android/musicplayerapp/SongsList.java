package com.example.android.musicplayerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;

public class SongsList extends AppCompatActivity {

    private Category lang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lang = getIntent().getParcelableExtra("Category");
        Log.v("MainActivity",lang.getMlanguage() );
        if (lang.getMlanguage().equalsIgnoreCase("Hindi")){
            setTheme(R.style.Hindi);
            setTitle("Hindi Song List");
        }else if (lang.getMlanguage().equalsIgnoreCase("Telugu")) {
            setTheme(R.style.Telugu);
            setTitle("Telugu Song List");
        }else if (lang.getMlanguage().equalsIgnoreCase("Kannada")) {
            setTheme(R.style.Kannada);
            setTitle("Kannada Song List");
        }else if (lang.getMlanguage().equalsIgnoreCase("Other")) {
            setTheme(R.style.Other);
            setTitle("Other Lang Song List");
        }
        setContentView(R.layout.activity_songs_list);

        final ArrayList<HindSongDetails> hindiSongDetails = new ArrayList<HindSongDetails>();

        String song, singer;

         HindSongDetails.mlang = lang.getMlanguage();

        for (int i =1; i<=20; i++){

            song = HindSongDetails.mlang + "Song" + i;
            singer = song +" Singer";
            hindiSongDetails.add(new HindSongDetails(song,singer));
        }

        SongListAdapter songListAdapter = new SongListAdapter(this, hindiSongDetails);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(songListAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    final int position, long id) {

                Intent numbersIntent = new Intent(SongsList.this, SongPlayer.class);
                numbersIntent.putExtra("Song", hindiSongDetails.get(position));
                startActivity(numbersIntent);
           }
        });

    }
}
