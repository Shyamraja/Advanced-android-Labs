package com.example.eggtimerlab34;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class counting extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    @Override
        protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);
        Intent intent = getIntent();
        String timeset = ((Intent) intent).getStringExtra("time");
        final TextView textView2 = findViewById(R.id.textView2);
        textView2.setText(timeset);

     new CountDownTimer(Integer.parseInt(timeset) *3000, 1000){

        @Override
        public void onTick(long millisUntilFinished){
        textView2.setText(""+ (millisUntilFinished / 1000));
          }
        @Override
        public void onFinish() {
        textView2.setText("Done!");
        alarm();
        }
        }.start();

     }
    private void alarm() {
        mediaPlayer = MediaPlayer.create(this, R.raw.lamb);
        mediaPlayer.start();
        }
      }





