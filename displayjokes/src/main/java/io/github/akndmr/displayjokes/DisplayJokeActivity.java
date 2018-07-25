package io.github.akndmr.displayjokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    TextView mTextViewJoje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        mTextViewJoje = findViewById(R.id.tv_joke_display);

        Intent intent = getIntent();
        if(intent != null && intent.hasExtra(getResources().getString(R.string.joke_intent_extra))){
            String jokeText = intent.getStringExtra(getResources().getString(R.string.joke_intent_extra));
            mTextViewJoje.setText(jokeText);
        }
    }
}
