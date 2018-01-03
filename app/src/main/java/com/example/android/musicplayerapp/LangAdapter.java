package com.example.android.musicplayerapp;

import android.app.Activity;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.musicplayerapp.R.drawable.hindi;

/**
 * Created by qze713 on 12/27/17.
 */

public class LangAdapter extends ArrayAdapter<Category> {

        public  LangAdapter(Activity context , ArrayList<Category> words){
            super(context,0, words);

        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Check if an existing view is being reused, otherwise inflate the view
            View gridItemView = convertView;

            if (gridItemView == null) {
                gridItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.category_list, parent, false);
            }

            Category currentLang = getItem(position);

            TextView categoryTextView = (TextView) gridItemView.findViewById(R.id.category);
            categoryTextView.setText(currentLang.getMlanguage());

            if (currentLang.getMlanguage().equalsIgnoreCase("Hindi")) {
                gridItemView.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.hindi));

            }else if (currentLang.getMlanguage().equalsIgnoreCase("Telugu")) {
                gridItemView.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.telugu));
            }
            else if (currentLang.getMlanguage().equalsIgnoreCase("Kannada")) {
                gridItemView.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.kannada));
            }else if (currentLang.getMlanguage().equalsIgnoreCase("Other")) {
                gridItemView.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.other));
            }

            gridItemView.setMinimumHeight(parent.getRootView().findViewById(android.R.id.content).getHeight()/2);

            return gridItemView;
        }


}
