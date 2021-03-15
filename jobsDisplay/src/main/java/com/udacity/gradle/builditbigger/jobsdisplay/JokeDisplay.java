package com.udacity.gradle.builditbigger.jobsdisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);
        Bundle intent = getIntent().getExtras();
        TextView textView = findViewById(R.id.textView);
        if (intent !=null) {
            textView.setText(intent.getString("joke"));
        }
    }
}