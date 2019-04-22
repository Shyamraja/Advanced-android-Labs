package com.example.animalsbirdssound;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
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
              
               }

