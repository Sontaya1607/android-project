package com.example.sontaya16.karya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//  QUIZ BUTTON
        Button btnQuiz = (Button)findViewById(R.id.btn_quiz);
        btnQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), QuizActivity.class);
                startActivity(i);
            }
        });




//  GREEN BIN BUTTON
        Button btnGreen = (Button)findViewById(R.id.btn_green);
        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), GreenActivity.class);
                startActivity(i);
            }
        });

//  BLUE BIN BUTTON
        Button btnBlue = (Button)findViewById(R.id.btn_blue);
        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), BlueActivity.class);
                startActivity(i);
            }
        });

//  YELLOW BIN BUTTON
        Button btnYellow = (Button)findViewById(R.id.btn_yellow);
        btnYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), YellowActivity.class);
                startActivity(i);
            }
        });

//  RED BIN BUTTON
        Button btnRed = (Button)findViewById(R.id.btn_red);
        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), RedActivity.class);
                startActivity(i);
            }
        });
    }
}
