package com.example.sontaya16.karya;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class QuizActivity extends AppCompatActivity {

    Button answer1,answer2,answer3,answer4;
    TextView score,quiz;
    private String mAnswer;
    private Questions mQuestions = new Questions();
    private int mScore = 0,count = 0;
    private int mQuestionLenght = mQuestions.MQuestions.length;
    int[] qCount = new int [mQuestionLenght];
    int x;
    Random r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);
        score  = (TextView) findViewById(R.id.score);
        quiz = (TextView) findViewById(R.id.quiz);


        r = new Random();
        score.setText("Score " + mScore);
        x = r.nextInt(mQuestionLenght)+1;
        qCount[count] = x;
        updateQuestion(x-1);
        count++;
        answer1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                int check = 1;
                while(check != 0) {
                    x = r.nextInt(mQuestionLenght)+1;
                    check = 0;
                    for(int i = 0 ;i<mQuestionLenght;i++){
                        if(qCount[i] == x) {
                            check++;
                        }
                    }
                    if(check==0) {
                        qCount[count]=x;
                        break;
                    }

                }
                if (answer1.getText() == mAnswer) {
                    mScore++;
                    Correct();
                    score.setText("Score " + mScore);
                    count++;
                    if(count < 11) {
                        updateQuestion(x-1);
                    }else{
                        EndGame(mScore);
                    }
                } else {
                    Wrong();
                    score.setText("Score " + mScore);
                    count++;
                    if(count < 11) {
                        updateQuestion(x-1);
                    }else{
                        EndGame(mScore);
                    }
                }
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                int check = 1;
                while(check != 0) {
                    x = r.nextInt(mQuestionLenght)+1;
                    check = 0;
                    for(int i = 0 ;i<mQuestionLenght;i++){
                        if(qCount[i] == x) {
                            check++;
                        }
                    }
                    if(check==0) {
                        qCount[count]=x;
                        break;
                    }

                }
                if (answer2.getText() == mAnswer) {
                    mScore++;
                    Correct();
                    score.setText("Score " + mScore);
                    count++;
                    if(count < 11) {
                        updateQuestion(x-1);
                    }else{
                        EndGame(mScore);
                    }
                } else {
                    Wrong();
                    score.setText("Score " + mScore);
                    count++;
                    if(count < 11) {
                        updateQuestion(x-1);
                    }else{
                        EndGame(mScore);
                    }
                }
            }
        });

        answer3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                int check = 1;
                while(check != 0) {
                    x = r.nextInt(mQuestionLenght)+1;
                    check = 0;
                    for(int i = 0 ;i<mQuestionLenght;i++){
                        if(qCount[i] == x) {
                            check++;
                        }
                    }
                    if(check==0) {
                        qCount[count]= x;
                        break;
                    }

                }
                if (answer3.getText() == mAnswer) {
                    mScore++;
                    Correct();
                    score.setText("Score " + mScore);
                    count++;
                    if(count < 11) {
                        updateQuestion(x-1);
                    }else{
                        EndGame(mScore);
                    }
                } else {
                    Wrong();
                    score.setText("Score " + mScore);
                    count++;
                    if(count < 11) {
                        updateQuestion(x-1);
                    }else{
                        EndGame(mScore);
                    }
                }
            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                int check = 1;
                while(check != 0) {
                    x = r.nextInt(mQuestionLenght)+1;
                    check = 0;
                    for(int i = 0 ;i<mQuestionLenght;i++){
                        if(qCount[i] == x) {
                            check++;
                        }
                    }
                    if(check==0) {
                        qCount[count]=x;
                        break;
                    }

                }
                if (answer4.getText() == mAnswer) {
                    mScore++;
                    Correct();
                    score.setText("Score " + mScore);
                    count++;
                    if(count < 11) {
                        updateQuestion(x-1);
                    }else{
                        EndGame(mScore);
                    }
                } else {
                    Wrong();
                    score.setText("Score " + mScore);
                    count++;
                    if(count < 11) {
                        updateQuestion(x-1);
                    }else{
                        EndGame(mScore);
                    }
                }
            }
        });

    }

    private void updateQuestion(int num){
        quiz.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));
        answer4.setText(mQuestions.getChoice4(num));
        mAnswer = mQuestions.getCorrectAnswer(num);
    }
//    private void gameOver(){
//        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(QuizActivity.this);
//        alertDialogBuilder
//                .setMessage("End! Your score is " + mScore +" points")
//                .setCancelable(false)
//                .setPositiveButton("NEW GAME", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        startActivity(new Intent(getApplicationContext(),QuizActivity.class));
//                    }
//                })
//                .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        finish();
//                    }
//                });
//        AlertDialog alertDialog = alertDialogBuilder.create();
//        alertDialog.show();
//    }
    private void Correct(){
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView= inflater.inflate(R.layout.dialog_checked, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(QuizActivity.this);
        alertDialogBuilder
                .setView(dialogView)
//                .setMessage("Correct!")
                .setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }
    private void Wrong(){
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView= inflater.inflate(R.layout.dialog_wrong, null);
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(QuizActivity.this);
        alertDialogBuilder
                .setView(dialogView)
//                .setMessage("Wrong!")
                .setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
    private void EndGame(int rscore){
        Intent intent = new Intent(getApplicationContext(), Result.class);
        intent.putExtra("Score ",rscore);
        startActivity(intent);
    }

}