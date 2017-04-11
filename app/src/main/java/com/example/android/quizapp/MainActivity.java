package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private int countresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         radioButton1 = (RadioButton) findViewById(R.id.option_1);
         radioButton2 = (RadioButton) findViewById(R.id.option_2);
         radioButton3 = (RadioButton) findViewById(R.id.option_3);

        View.OnClickListener onClick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), getString(R.string.checked_radio_button), Toast.LENGTH_SHORT).show();
            }
        };
        radioButton1.setOnClickListener(onClick);
        radioButton2.setOnClickListener(onClick);
        radioButton3.setOnClickListener(onClick);
    }
    public void changescreen(View view) {

        if (radioButton1.isChecked() || radioButton2.isChecked() || radioButton3.isChecked()) {

            if (radioButton1.isChecked()) {
                countresult = countresult + 1;
                Toast.makeText(getApplicationContext(), getString(R.string.right_answer), Toast.LENGTH_SHORT).show();
                //   Intent intent = new Intent(getApplicationContext(), ActivityQuestion2.class);
                // startActivity(intent);
            }

        } else {
            Toast.makeText(getApplicationContext(), getString(R.string.no_option_choosen_question1), Toast.LENGTH_SHORT).show();
        }
        Intent myIntent = new Intent(MainActivity.this, ActivityQuestion2.class);
        myIntent.putExtra("countresult", countresult);
        startActivity(myIntent);

    }

}
