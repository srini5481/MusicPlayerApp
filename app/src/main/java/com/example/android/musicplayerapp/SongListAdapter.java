package com.example.android.musicplayerapp;

import android.app.Activity;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.util.Log;
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

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_list, parent, false);
        }

        HindSongDetails currentSong = getItem(position);
        ImageView imgView = (ImageView) listItemView.findViewById(R.id.imageid) ;

        if (currentSong.getMlang().equalsIgnoreCase("Hindi")){
            imgView.setImageResource(R.drawable.hindi);
            imgView.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.hindi));
            listItemView.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.hindi));
        } else if (currentSong.getMlang().equalsIgnoreCase("Telugu")){
            imgView.setImageResource(R.drawable.telugu);
            imgView.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.telugu));
            listItemView.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.telugu));
        } else if (currentSong.getMlang().equalsIgnoreCase("Kannada")){
            imgView.setImageResource(R.drawable.kannada);
            imgView.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.kannada));
            listItemView.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.kannada));
        } else {
            imgView.setImageResource(R.drawable.other);
            imgView.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.other));
            listItemView.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.other));
        }

        TextView songTextView = (TextView) listItemView.findViewById(R.id.song);
        songTextView.setText(currentSong.getmHindiSong());
        songTextView.setTextColor(ContextCompat.getColor(getContext(),R.color.whitecolor));
        TextView singerTextView = (TextView) listItemView.findViewById(R.id.singer);
        singerTextView.setText(currentSong.getmHindiSongSinger());
        singerTextView.setTextColor(ContextCompat.getColor(getContext(),R.color.whitecolor));

        return listItemView;
    }



}
