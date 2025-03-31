package com.android.evergreenmusicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class SongsAdapter extends ArrayAdapter<Songs> {

    /**
     * @param context The current context Used to inflate the layout file.
     * @param songs   A list of Songs objects to display in a list
     */

    public SongsAdapter(@NonNull Context context, ArrayList<Songs> songs) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, songs);
    }

    /**
     * Provides a view for an AdapterView (ListView or GridView)
     *
     * @param position    The position in the list of data that should be displayed in the list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is set for inflation.
     * @return The View for the position in the AdapterView.
     */

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.simple_list_item, parent, false);
        }

        // get the songs object located at this position in the list
        Songs currentSongs = getItem(position);

        // find the textview in the simple_list_item.xml layout with id song_name
        TextView songNameTextview = listItemView.findViewById(R.id.song_name);
        // get the song name from the current Songs object and
        // set this text on the songName TextView
        songNameTextview.setText(currentSongs.getSongName());

        // find the textview in the simple_list_item.xml layout with id artist_name
        TextView artistNameTextview = listItemView.findViewById(R.id.artist_name);
        // get the artist name from the current Songs object and
        // set this text on the artistName TextView
        artistNameTextview.setText(currentSongs.getArtistName());

        // find the imageview in the simple_list_item.xml layout with id song_img
        ImageView songView = listItemView.findViewById(R.id.song_img_id);
        // Get the image resource ID from the current Songs object and
        // set the image to songView
        songView.setImageResource(currentSongs.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
