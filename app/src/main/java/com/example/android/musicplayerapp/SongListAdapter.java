package com.example.android.musicplayerapp;

import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by qze713 on 12/27/17.
 */

public class SongListAdapter extends ArrayAdapter<HindSongDetails> {




    public  SongListAdapter(Activity context , ArrayList<HindSongDetails> hindiSongDetails){
        super(context,0, hindiSongDetails);

    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_list, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        HindSongDetails currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView songTextView = (TextView) listItemView.findViewById(R.id.Song);

        //TextView categoryTextView = (TextView) listItemView.findViewById(R.id.Category);

        songTextView.setText(currentSong.getmHindiSong());

        TextView singerTextView = (TextView) listItemView.findViewById(R.id.Singer);

        singerTextView.setText(currentSong.getmHindiSongSinger());


        //ImageView catImage =(ImageView) listItemView.findViewById(R.id.imageid);

        return listItemView;
    }



}
