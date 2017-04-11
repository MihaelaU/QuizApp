package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class FinalScreen extends AppCompatActivity {
    private int countresult;
    private String finalMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_screen);
        Intent mIntent = getIntent();
        countresult = mIntent.getIntExtra("countresult", 0);


    }

   // Button score = (Button) findViewById(R.id.score);
    TextView text=(TextView) findViewById(R.id.Textview2);
    private void createSummary()
    {
        finalMessage += "Final results is " + countresult ;
        finalMessage += "\n" + getString(R.string.thank_you);
        text.setText(finalMessage);
    }
}

