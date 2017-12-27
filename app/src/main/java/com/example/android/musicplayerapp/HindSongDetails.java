package com.example.android.musicplayerapp;

/**
 * Created by qze713 on 12/27/17.
 */

public class HindSongDetails {

    private String mHindiSong;
    private String mHindiSongSinger;

    public HindSongDetails (String hindiSong, String hindiSongSinger)
    {
        mHindiSong= hindiSong;
        mHindiSongSinger= hindiSongSinger;

    }

    public String getmHindiSong() {
        return mHindiSong;
    }

    public String getmHindiSongSinger() {
        return mHindiSongSinger;
    }
}
