package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class ActivityQuestion4 extends AppCompatActivity {

    private RadioButton radioButton4;
    private RadioButton radioButton5;
    private RadioButton radioButton6;
    private int points;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);

        radioButton4 = (RadioButton) findViewById(R.id.country_1);
        radioButton5 = (RadioButton) findViewById(R.id.country_2);
        radioButton6 = (RadioButton) findViewById(R.id.country_3);
        Intent mIntent = getIntent();
        points = mIntent.getIntExtra("results", 0);
    }
    public void gotofinalscreen(View view) {

        if (radioButton4.isChecked() || radioButton5.isChecked() || radioButton5.isChecked()) {

            if (radioButton4.isChecked()) {
                points = points + 1;
                Toast.makeText(getApplicationContext(), getString(R.string.right_answer), Toast.LENGTH_SHORT).show();
                //   Intent intent = new Intent(getApplicationContext(), ActivityQuestion2.class);
                // startActivity(intent);
            }
        }
        Toast.makeText(getApplicationContext(), getString(R.string.thank_you), Toast.LENGTH_SHORT).show();
        Intent myIntent = new Intent(ActivityQuestion4.this, FinalScreen.class);
        myIntent.putExtra("final", points);
        startActivity(myIntent);

    }
}
