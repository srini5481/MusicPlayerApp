package com.example.android.musicplayerapp;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.CheckBox;

/**
 * Created by qze713 on 12/25/17.
 */

public class Category implements Parcelable {

    private String mlanguage = "";

    public Category (String language){
        mlanguage= language;
    }

    public String getMlanguage() {
        return mlanguage;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(mlanguage);

    }
    protected Category( Parcel in){
        mlanguage =in.readString();

    }
    public static final Creator<Category> CREATOR = new Creator<Category>() {
        @Override
        public Category createFromParcel(Parcel in) {
            return new Category(in);
        }

        @Override
        public Category[] newArray(int size) {
            return new Category[size];
        }
    };

}
