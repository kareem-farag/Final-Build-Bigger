    package com.udacity.gradle.builditbigger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Bundle extras = getIntent().getExtras();

            TextView textView = findViewById(R.id.textView);
            if (extras!=null) {
                textView.setText(extras.getString("joke"));
            }
        }
}