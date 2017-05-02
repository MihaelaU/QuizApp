package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.TextKeyListener;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.icu.lang.UCharacter.toUpperCase;

public class ActivityQuestion3 extends AppCompatActivity {
    private EditText user_input;
    private int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        Intent mIntent = getIntent();
        result = mIntent.getIntExtra("countresult", 0);

    }
    public void gotonext(View view) {
        EditText nameEditView = (EditText) findViewById(R.id.editText2);
        String user_input = nameEditView.getText().toString();

        if (user_input == null) {
            Toast.makeText(getApplicationContext(), getString(R.string.no_input), Toast.LENGTH_SHORT).show();

            } else {
                user_input = toUpperCase(user_input);
                if (user_input.equalsIgnoreCase("MOZAMBIQUE"))
            {
                    result++;
                    Toast.makeText(getApplicationContext(), getString(R.string.right_answer), Toast.LENGTH_SHORT).show();

            }
        }
        Intent myIntent = new Intent(ActivityQuestion3.this, ActivityQuestion4.class);
        myIntent.putExtra("results", result);
        startActivity(myIntent);
    }


}
