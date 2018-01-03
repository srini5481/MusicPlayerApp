package com.example.android.musicplayerapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.duration;
import static android.media.CamcorderProfile.get;
import static android.widget.Toast.LENGTH_SHORT;
import static com.example.android.musicplayerapp.R.id.song;
import static com.example.android.musicplayerapp.R.id.songDetails;
import android.widget.Toast;

public class SongPlayer extends AppCompatActivity {

    private HindSongDetails hindSongDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hindSongDetails = getIntent().getParcelableExtra("Song");
        if (hindSongDetails.getMlang().equalsIgnoreCase("Hindi")){
            setTheme(R.style.Hindi);
        }else if (hindSongDetails.getMlang().equalsIgnoreCase("Telugu")) {
            setTheme(R.style.Telugu);
        }else if (hindSongDetails.getMlang().equalsIgnoreCase("Kannada")) {
            setTheme(R.style.Kannada);
        }else if (hindSongDetails.getMlang().equalsIgnoreCase("Other")) {
            setTheme(R.style.Other);
        }

        setContentView(R.layout.activity_song_player);
        TextView songplaying = (TextView) findViewById(R.id.songTextView);
        TextView singerofPlayingSong = (TextView) findViewById(R.id.singerTextView);
        //LinearLayout songDetails = (LinearLayout) findViewById(R.id.songDetails);
        RelativeLayout songDetails = (RelativeLayout) findViewById(R.id.songDetails);
        LinearLayout playerOptions = (LinearLayout) findViewById(R.id.playerOptions);
        songplaying.setText(hindSongDetails.getmHindiSong());
        singerofPlayingSong.setText(hindSongDetails.getmHindiSongSinger());

        if (hindSongDetails.getMlang().equalsIgnoreCase("Hindi")){
            songDetails.setBackgroundColor(ContextCompat.getColor(this,R.color.hindi));
            playerOptions.setBackgroundColor(ContextCompat.getColor(this,R.color.hindi));
        } else if (hindSongDetails.getMlang().equalsIgnoreCase("Telugu")){
            songDetails.setBackgroundColor(ContextCompat.getColor(this,R.color.telugu));
            playerOptions.setBackgroundColor(ContextCompat.getColor(this,R.color.telugu));
        } if (hindSongDetails.getMlang().equalsIgnoreCase("Kannada")){
            songDetails.setBackgroundColor(ContextCompat.getColor(this,R.color.kannada));
            playerOptions.setBackgroundColor(ContextCompat.getColor(this,R.color.kannada));
        } if (hindSongDetails.getMlang().equalsIgnoreCase("Other")){
            songDetails.setBackgroundColor(ContextCompat.getColor(this,R.color.other));
            playerOptions.setBackgroundColor(ContextCompat.getColor(this,R.color.other));
        }



        FloatingActionButton myFab = (FloatingActionButton) findViewById(R.id.fab);
        myFab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Toast.makeText(this,"text",Toast.LENGTH_SHORT).show();

                 Toast.makeText(v.getContext(), "text", LENGTH_SHORT).show();

                Intent songListIntent = new Intent(SongPlayer.this, MainActivity.class);
                //songListIntent.putExtra("Category", lang.get(position));
                startActivity(songListIntent);



            }
        });

    }
}
