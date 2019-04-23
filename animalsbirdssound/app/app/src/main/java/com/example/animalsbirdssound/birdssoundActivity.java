package com.example.animalsbirdssound;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class birdssoundActivity extends MainActivity {
    TextView bird;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird);
        bird = findViewById(R.id.title);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7= findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);

        mediaPlayer = new MediaPlayer();

        imageView5.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        huuhkaja_norther_eagle_owlSound();
    }
    });
        imageView6.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        peippo_chaffinchSound();
    }
    });
        imageView7.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        peukaloinen_wrenSound();
    }
    });
        imageView8.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){
        punatulkku_northern_bullfinchSound();
    }
      });
}
     private void huuhkaja_norther_eagle_owlSound () {
        mediaPlayer.stop();
        mediaPlayer = MediaPlayer.create(this, R.raw.huuhkaja_norther_eagle_owl);
        mediaPlayer.start();
       }
      private void peippo_chaffinchSound () {
        mediaPlayer.stop();
        mediaPlayer = MediaPlayer.create(this, R.raw.peippo_chaffinch);
        mediaPlayer.start();
    }
    private void peukaloinen_wrenSound () {
        mediaPlayer.stop();
        mediaPlayer = MediaPlayer.create(this, R.raw.peukaloinen_wren);
        mediaPlayer.start();
    }
    private void  punatulkku_northern_bullfinchSound() {
        mediaPlayer.stop();
        mediaPlayer = MediaPlayer.create(this, R.raw.punatulkku_northern_bullfinch);
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
                Intent screen2 = new Intent(birdssoundActivity.this, birdssoundActivity.class);
                startActivity(screen2);
                return false;
           }

        return super.onOptionsItemSelected(item);

                 }
    }



