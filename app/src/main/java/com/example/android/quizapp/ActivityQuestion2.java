package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class ActivityQuestion2 extends AppCompatActivity {

    private CheckBox CheckBox1;
    private CheckBox CheckBox2;
    private CheckBox CheckBox3;
    private CheckBox CheckBox4;
    private int intValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        Intent mIntent = getIntent();
        intValue = mIntent.getIntExtra("countresult", 0);

        CheckBox1 = (CheckBox) findViewById(R.id.checkBox1);
        CheckBox2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox3 = (CheckBox) findViewById(R.id.checkBox3);
        CheckBox4 = (CheckBox) findViewById(R.id.checkBox4);
    }
    public void nextscreen(View view) {

        if (CheckBox1.isChecked() || CheckBox2.isChecked() || CheckBox3.isChecked() || CheckBox4.isChecked()) {
            if (CheckBox1.isChecked() && CheckBox2.isChecked() ) {
                intValue++;
                Toast.makeText(getApplicationContext(), getString(R.string.right_answer), Toast.LENGTH_SHORT).show();
            }
        }
        Toast.makeText(getApplicationContext(), getString(R.string.checked_radio_button), Toast.LENGTH_SHORT).show();
        Intent myIntent = new Intent(ActivityQuestion2.this, ActivityQuestion3.class);
        myIntent.putExtra("countresult", intValue);
        startActivity(myIntent);
    }
}
