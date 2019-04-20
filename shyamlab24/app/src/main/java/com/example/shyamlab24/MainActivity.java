package com.example.shyamlab24;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    TextView textView = null;
    TextView edittext = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        edittext = findViewById(R.id.edittxt1);


              findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edittext.getText().toString();
                textView.setText("Hi" + name);
                }
            });

            findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edittext.getText().toString();
                textView.setText("Hello" + name);

                     }
                });

           findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edittext.getText().toString();
                    textView.setText("Terve" + name);
                    }
                 });

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edittext.getText().toString();
                 textView.setText("Hejjsan" + name);
                  }

               });
            }
      }
