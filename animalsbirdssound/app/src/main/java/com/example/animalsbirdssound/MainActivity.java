package com.example.animalsbirdssound;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {
     TextView animal;
     ImageView imageView;
     MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         animal = findViewById(R.id.title);
        imageView = findViewById(R.id.imageView);
        mediaPlayer = new MediaPlayer();

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bearSound();
               }
           });
       }

    private void bearSound() {
        mediaPlayer.stop();
        mediaPlayer = MediaPlayer.create(this, R.raw.bear);
        mediaPlayer.start();
      }
  }
    
