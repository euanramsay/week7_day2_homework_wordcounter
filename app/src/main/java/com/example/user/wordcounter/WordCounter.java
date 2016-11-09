package com.example.user.wordcounter;

/**
 * Created by user on 08/11/2016.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

ublic class WordCounter extends AppCompatActivity {

    EditText mQuestionEditText;
    Button mCountButton;
    int mAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("WordCounter", "onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mQuestionEditText = (EditText)findViewById(R.id.question_text);
        mCountButton = (Button)findViewById(R.id.count_button);

        mCountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("WordCounter", "Count button clicked!");
                String question = mQuestionEditText.getText().toString();
                Log.d("WordCounter", "The length of the word is " + question );

                Answers answers = new Answers();
                String answer = answers.getAnswer();

                Intent intent = new Intent(WordCounter.this, CounterActivity.class);

                intent.putExtra("answer", answer);

                startActivity(intent);
            }
        });
    }

}
