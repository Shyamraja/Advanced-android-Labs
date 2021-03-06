package com.example.animalsbirdssound;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView animal;
    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    MediaPlayer mediaPlayer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animal = findViewById(R.id.title);
        imageView = findViewById(R.id.imageView);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);

        mediaPlayer = new MediaPlayer();

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bearSound();
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                elephantSound();
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lambSound();
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wolfSound();
            }
        });
    }

        private void bearSound () {
            mediaPlayer.stop();
            mediaPlayer = MediaPlayer.create(this, R.raw.bear);
            mediaPlayer.start();
        }
        private void elephantSound () {
            mediaPlayer.stop();
            mediaPlayer = MediaPlayer.create(this, R.raw.elephant);
            mediaPlayer.start();
        }

        private void lambSound () {
            mediaPlayer.stop();
            mediaPlayer = MediaPlayer.create(this, R.raw.lamb);
            mediaPlayer.start();
        }
    private void wolfSound () {
        mediaPlayer.stop();
        mediaPlayer = MediaPlayer.create(this, R.raw.wolf);
        mediaPlayer.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_sounds, menu);
        return true;
                  }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.animal:
                Intent screen1 = new Intent(this, MainActivity.class);
                startActivity(screen1);
                return false;
            case R.id.bird:
                Intent screen2 = new Intent(this, birdssoundActivity.class);
                startActivity(screen2);
                return false;
        }
        return super.onOptionsItemSelected(item);
                  }
            }



