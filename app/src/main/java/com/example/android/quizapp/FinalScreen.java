package com.example.android.quizapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class FinalScreen extends AppCompatActivity {
    private int counterresult;
    private String finalMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_screen);
        Intent mIntent = getIntent();
        counterresult = mIntent.getIntExtra("final", 0);
    }

    public void showresult(View view)
    {
        EditText name = (EditText) findViewById(R.id.name);
        String sendto = name.getText().toString();
        String Message = createPointsSummary(counterresult);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Dear User " + sendto);
        intent.putExtra(Intent.EXTRA_TEXT, Message );
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    private String createPointsSummary(int counterresult){
        String Message = getString(R.string.right_answer);
        Message += "\nFinal points " + counterresult;
        Message += "\n" + getString(R.string.thank_you);
        return Message;

    }
}

