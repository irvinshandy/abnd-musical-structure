package com.example.android.musicstructures;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView playlists = (TextView) findViewById(R.id.playlists);

        playlists.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistsIntent = new Intent(MainActivity.this, PlaylistsActivity.class);

                startActivity(playlistsIntent);
            }
        });

        TextView songs = (TextView) findViewById(R.id.songs);

        songs.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);

                startActivity(songsIntent);
            }
        });

        TextView albums = (TextView) findViewById(R.id.albums);

        albums.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);

                startActivity(albumsIntent);
            }
        });

        TextView artists = (TextView) findViewById(R.id.artists);

        artists.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);

                startActivity(artistsIntent);
            }
        });
    }
}
