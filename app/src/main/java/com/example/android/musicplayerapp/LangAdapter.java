package com.example.android.musicplayerapp;

import android.app.Activity;
import android.graphics.Color;
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
            View listItemView = convertView;

            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.category_list, parent, false);
            }

            // Get the {@link Word} object located at this position in the list
            Category currentLang = getItem(position);

            // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
            TextView categoryTextView = (TextView) listItemView.findViewById(R.id.Category);
            // Get the Miwok translation from the currentWord object and set this text on
            // the Miwok TextView.


            categoryTextView.setText(currentLang.getMlanguage());



            if (currentLang.getMlanguage()=="Hindi") {
                listItemView.setBackgroundColor(Color.parseColor("#2196F3"));

            }else if (currentLang.getMlanguage() == "Telugu") {
                listItemView.setBackgroundColor(Color.parseColor("#311B92"));
            }
            else if (currentLang.getMlanguage() == "Kannada") {
                listItemView.setBackgroundColor(Color.parseColor("#3E2723"));
            }else if (currentLang.getMlanguage() == "Other") {
                listItemView.setBackgroundColor(Color.parseColor("#D84315"));
            }


            return listItemView;
        }


}
