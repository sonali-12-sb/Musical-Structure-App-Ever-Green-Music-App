package com.android.evergreenmusicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        // Create an ArrayList of Songs objects(album name, artist name, image)
        ArrayList<Songs> songs = new ArrayList<Songs>();
        songs.add(new Songs("Ashiqui2", "Ankit Tiwari, Arijit Singh", R.drawable.album_icon));
        songs.add(new Songs("Jab we met", "Shreya Ghoshal, Mohit Chauhan", R.drawable.album_icon));
        songs.add(new Songs("Believe", "Justin Biber", R.drawable.album_icon));
        songs.add(new Songs("Rare", "Selena Gomez", R.drawable.album_icon));
        songs.add(new Songs("Lover", "Taylor Swift", R.drawable.album_icon));
        songs.add(new Songs("Speak Your Mind", "Anne-Marie", R.drawable.album_icon));

        // create a datasource adapter
        SongsAdapter adapter = new SongsAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = findViewById(R.id.list_album);
        listView.setAdapter(adapter);
    }
}