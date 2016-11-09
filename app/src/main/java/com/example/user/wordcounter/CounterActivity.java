package com.example.user.wordcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by user on 08/11/2016.
 */

public class CounterActivity extends AppCompatActivity {

    TextView mAnswerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("WordCounter", "AnswerActivity onCreate called!");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAnswerText = (TextView) findViewById(R.id.answer);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String answer = extras.getString("answer");
        mAnswerText.setText(answer);
    }
}
