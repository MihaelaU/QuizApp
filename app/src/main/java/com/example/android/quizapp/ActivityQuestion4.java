package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class ActivityQuestion4 extends AppCompatActivity {

    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private int countresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);

        radioButton1 = (RadioButton) findViewById(R.id.country_1);
        radioButton2 = (RadioButton) findViewById(R.id.country_2);
        radioButton3 = (RadioButton) findViewById(R.id.country_3);
        Intent mIntent = getIntent();
        countresult = mIntent.getIntExtra("countresult", 0);
    }
    public void gotofinalscreen(View view) {

        if (radioButton1.isChecked() || radioButton2.isChecked() || radioButton3.isChecked()) {

            if (radioButton1.isChecked()) {
                countresult = countresult + 1;
                Toast.makeText(getApplicationContext(), getString(R.string.right_answer), Toast.LENGTH_SHORT).show();
                //   Intent intent = new Intent(getApplicationContext(), ActivityQuestion2.class);
                // startActivity(intent);
            }

        }
        Toast.makeText(getApplicationContext(), getString(R.string.no_option_choosen_question1), Toast.LENGTH_SHORT).show();
        Intent myIntent = new Intent(ActivityQuestion4.this, final_screen.class);
        myIntent.putExtra("countresult", countresult);
        startActivity(myIntent);

    }
}
