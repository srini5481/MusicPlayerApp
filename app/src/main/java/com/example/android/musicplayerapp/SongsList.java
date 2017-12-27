package com.example.android.musicplayerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs_list);


        ArrayList<HindSongDetails> hindiSongDetails = new ArrayList<HindSongDetails>();

        hindiSongDetails.add(new HindSongDetails("HindiSong1","HindiSong1 Singer"));
        hindiSongDetails.add(new HindSongDetails("HindiSong2","HindiSong2 Singer"));
        hindiSongDetails.add(new HindSongDetails("HindiSong3","HindiSong3 Singer"));
        hindiSongDetails.add(new HindSongDetails("HindiSong4","HindiSong4 Singer"));
        hindiSongDetails.add(new HindSongDetails("HindiSong5","HindiSong5 Singer"));
        hindiSongDetails.add(new HindSongDetails("HindiSong6","HindiSong6 Singer"));
        hindiSongDetails.add(new HindSongDetails("HindiSong7","HindiSong6 Singer"));
        hindiSongDetails.add(new HindSongDetails("HindiSong8","HindiSong7 Singer"));
        hindiSongDetails.add(new HindSongDetails("HindiSong9","HindiSong8 Singer"));
        hindiSongDetails.add(new HindSongDetails("HindiSong10","HindiSong9 Singer"));
        hindiSongDetails.add(new HindSongDetails("HindiSong11","HindiSong10 Singer"));
        hindiSongDetails.add(new HindSongDetails("HindiSong12","HindiSong11 Singer"));
        hindiSongDetails.add(new HindSongDetails("HindiSong13","HindiSong12 Singer"));
        hindiSongDetails.add(new HindSongDetails("HindiSong14","HindiSong13 Singer"));
        hindiSongDetails.add(new HindSongDetails("HindiSong15","HindiSong15 Singer"));
        hindiSongDetails.add(new HindSongDetails("HindiSong16","HindiSong16 Singer"));


        SongListAdapter songListAdapter = new SongListAdapter(this,hindiSongDetails);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(songListAdapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                // DO something

                /*Toast.makeText(
                        getApplicationContext(),
                        ((TextView) v.findViewById(R.id.Category))
                                .getText(), Toast.LENGTH_SHORT).show();*/

                TextView langCatTextView = (TextView) findViewById(R.id.Song);

                langCatTextView.setOnClickListener(new View.OnClickListener() {
                    // The code in this method will be executed when the numbers View is clicked on.
                    @Override
                    public void onClick(View view) {
                        Intent numbersIntent = new Intent(SongsList.this, SongPlayer.class);
                        startActivity(numbersIntent);
                    }
                });

            }
        });




    }
}
