package com.android.evergreenmusicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        // Create an ArrayList of Songs objects
        ArrayList<Songs> songs = new ArrayList<Songs>();
        songs.add(new Songs("Sun Raha Hai Na Tu", "Ankit Tiwari", R.drawable.sun_raha_hai));
        songs.add(new Songs("Barso re", "Shreya Ghoshal", R.drawable.barso_re));
        songs.add(new Songs("Bai g", "Aarya Ambekar", R.drawable.bai_g));
        songs.add(new Songs("All around the World", "Justin Biber", R.drawable.all_around_the_world));
        songs.add(new Songs("Who says", "Selena Gomez", R.drawable.who_says));
        songs.add(new Songs("Blank Space", "Taylor Swift", R.drawable.blank_space));
        songs.add(new Songs("Friends", "Anne-Marie", R.drawable.friends));
        songs.add(new Songs("Suit Suit Kar da", "Guru Randhawa", R.drawable.suit_suit_karda));
        songs.add(new Songs("Naah", "Hardy Sandhu", R.drawable.naah));
        songs.add(new Songs("Chandra", "Ajay-Atul", R.drawable.chandra));

        // create a datasource adapter
        SongsAdapter adapter = new SongsAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = findViewById(R.id.list_songs);
        listView.setAdapter(adapter);
    }
}