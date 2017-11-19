package com.example.sontaya16.karya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    Button exit,newgame;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView totalScore = (TextView) findViewById(R.id.totalScore);

        int score = getIntent().getIntExtra("Score ", 0);

        totalScore.setText(score + " / 10");
        exit = (Button) findViewById(R.id.exit);
        newgame = (Button) findViewById(R.id.newgame);
        exit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        newgame.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), QuizActivity.class);
                startActivity(intent);
            }
        });
    }
}
