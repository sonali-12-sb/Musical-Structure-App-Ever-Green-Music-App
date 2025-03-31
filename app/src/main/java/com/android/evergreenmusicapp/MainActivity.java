package com.android.evergreenmusicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // declaring button view
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initializing button view
        button = findViewById(R.id.start_button);

        // setting on click listener on button view
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // passing an explicit intent to open music activity
                Intent intent = new Intent(MainActivity.this, MusicActivity.class);
                startActivity(intent);
            }
        });
    }
}