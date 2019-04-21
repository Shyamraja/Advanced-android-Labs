package com.example.eggtimerlab34;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
public class counting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);
        Intent intent = getIntent();
        String time = ((Intent) intent).getStringExtra("time");
        final TextView textView = findViewById(R.id.textView);
        textView.setText(time);
    }
        new CountDownTimer(Integer.parseInt(time) * 1000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                textView.setText("" + (millisUntilFinished / 1000));
            }
        }




