package com.android.evergreenmusicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        // Create an ArrayList of Songs objects
        ArrayList<Songs> songs = new ArrayList<Songs>();
        songs.add(new Songs("Sun Raha Hai Na Tu", "Ankit Tiwari", R.drawable.artist1));
        songs.add(new Songs("Barso re", "Shreya Ghoshal", R.drawable.artist2));
        songs.add(new Songs("All around the World", "Justin Biber", R.drawable.artist3));
        songs.add(new Songs("Who says", "Selena Gomez", R.drawable.artist4));
        songs.add(new Songs("Blank Space", "Taylor Swift", R.drawable.taylor));
        songs.add(new Songs("Friends", "Anne-Marie", R.drawable.artist5));

        // create a datasource adapter
        ArtistAdapter adapter = new ArtistAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = findViewById(R.id.list_artist);
        listView.setAdapter(adapter);
    }
}