package com.android.evergreenmusicapp;

public class Songs {

    // name of the songs
    private String mSongName;

    // artist name
    private String artistName;

    // Drawable resource ID
    private int mImageResourceId;

    // create  a new Songs object
    // create a constructor
    public Songs(String sName, String aName, int imageResourceId) {
        mSongName = sName;
        artistName = aName;
        mImageResourceId = imageResourceId;
    }

    // Get the song name
    public String getSongName() {
        return mSongName;
    }

    // get artist name
    public String getArtistName() {
        return artistName;
    }

    // get the image resource ID
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
