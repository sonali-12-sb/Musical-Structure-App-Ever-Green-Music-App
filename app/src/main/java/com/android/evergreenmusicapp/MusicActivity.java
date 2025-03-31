package com.android.evergreenmusicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MusicActivity extends AppCompatActivity {
    // declaring image view
    ImageView go_next, go_next_playlist, go_next_artist, go_next_album;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        // initializing image view
        go_next = findViewById(R.id.go_next);
        go_next_playlist = findViewById(R.id.go_next_list);
        go_next_artist = findViewById(R.id.go_next_artist);
        go_next_album = findViewById(R.id.go_next_album);

        // setting on click listener on image view
        go_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // passing an explicit intent to open Songs activity
                Intent intent = new Intent(MusicActivity.this, SongsActivity.class);
                startActivity(intent);
            }
        });

        // setting on click listener on image view
        go_next_playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // passing an explicit intent to open Playlist activity
                Intent intent = new Intent(MusicActivity.this, PlayListActivity.class);
                startActivity(intent);
            }
        });

        // setting on click listener on image view
        go_next_artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // passing an explicit intent to open Artist activity
                Intent intent = new Intent(MusicActivity.this, ArtistActivity.class);
                startActivity(intent);
            }
        });

        // setting on click listener on image view
        go_next_album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // passing an explicit intent to open Album activity
                Intent intent = new Intent(MusicActivity.this, AlbumActivity.class);
                startActivity(intent);
            }
        });
    }
}