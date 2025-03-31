package com.android.evergreenmusicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class PlayListActivity extends AppCompatActivity {
    // declaring image view
    ImageView time_view, add_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list);

        // initializing image view
        time_view = findViewById(R.id.time_img);
        add_img = findViewById(R.id.add_img);

        // setting on click listener on image view
        add_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // setting toast message
                Toast.makeText(PlayListActivity.this, "Creating new Playlist..", Toast.LENGTH_SHORT).show();
            }
        });

        // setting on click listener on image view
        time_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // setting toast message
                Toast.makeText(PlayListActivity.this, "Now Playing!.....Look What You Made Me Do", Toast.LENGTH_SHORT).show();
            }
        });
    }
}