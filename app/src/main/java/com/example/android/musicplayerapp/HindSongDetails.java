package com.example.android.musicplayerapp;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by qze713 on 12/27/17.
 */

public class HindSongDetails implements Parcelable {


    public static String mlang = "";
    private String mHindiSong = "";
    private String mHindiSongSinger = "";
    public HindSongDetails (String hindiSong, String hindiSongSinger)
    {
        mHindiSong= hindiSong;
        mHindiSongSinger= hindiSongSinger;
    }

    public String getMlang() {
        return mlang;
    }

    public String getmHindiSong() {
        return mHindiSong;
    }

    public String getmHindiSongSinger() {
        return mHindiSongSinger;
    }

    protected HindSongDetails( Parcel in){
        mlang = in.readString();
        mHindiSong =in.readString();
        mHindiSongSinger = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(mlang);
        dest.writeString(mHindiSong);
        dest.writeString(mHindiSongSinger);

    }

    public static final Creator<HindSongDetails> CREATOR = new Creator<HindSongDetails>() {
        @Override
        public HindSongDetails createFromParcel(Parcel in) {
            return new HindSongDetails(in);
        }

        @Override
        public HindSongDetails[] newArray(int size) {
            return new HindSongDetails[size];
        }
    };


}
