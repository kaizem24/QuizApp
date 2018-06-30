package com.example.android.quizapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class SecondPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondpage_activity);

    }


    /*
    This is the hallmark of the application, This method implement the quiz app by collecting the user input and printing the
    result to the user.
    The submit method also interact with other activity within the app using the Bundle object.
     */

    public void submitView(View view){
        int score1;
        int score2;
        int score3;
        int score4;
        int score5;
        int score6;
        int score7;
        int score8;
        int score9;
        int score10;
        int totalScore;
        CharSequence displayScores = "";

        Intent intent = getIntent();

        Bundle bundle = getIntent().getExtras();




        //Question 1 Correct Answer is October 1st 1960

        Boolean correctAnswer1;

        correctAnswer1 = bundle.getBoolean("option1");

        if(correctAnswer1){
            score1 = 10;
        }else {
            score1 = 0;
        }


        //Question 2 Correct Answer is October 1st 1961
        Boolean correctAnswer2;

        correctAnswer2 = bundle.getBoolean("option2");

        if(correctAnswer2){
            score2 = 10;
        }else {
            score2 = 0;
        }

        //Question 3 Correct Answer is Alh. T. Balewa
        Boolean correctAnswer3;

        correctAnswer3 = bundle.getBoolean("option3");

        if(correctAnswer3){
            score3 = 10;
        }else {
            score3 = 0;
        }

        //Question 4 Correct Answer is Abuja
        Boolean correctAnswer4;

        correctAnswer4 = bundle.getBoolean("option4");

        if(correctAnswer4){
            score4 = 10;
        }else {
            score4 = 0;
        }

        //Question 5 Correct Answer is Hausa, Igbo and Yoruba


        Boolean correctAnswer5;
        Boolean correctAnswer55;
        Boolean correctAnswer555;

        CheckBox ans_option5 = this.findViewById(R.id.checkbox1);
        CheckBox ans_option55 = this.findViewById(R.id.checkbox111);
        CheckBox ans_option555 = this.findViewById(R.id.checkbox11);

        correctAnswer5=ans_option5.isChecked();
        correctAnswer55=ans_option55.isChecked();
        correctAnswer555=ans_option555.isChecked();

        if(correctAnswer5 && correctAnswer55 && !correctAnswer555){
            score5 = 10;
        }else {
            score5 = 0;
        }

        //Question 6 Correct Answer is River Niger and River Benue

        Boolean correctAnswer6;
        Boolean correctAnswer66;
        Boolean correctAnswer666;

        CheckBox ans_option66  = this.findViewById(R.id.checkbox22);
        CheckBox ans_option666 = this.findViewById(R.id.checkbox222);
        CheckBox ans_option6   = this.findViewById(R.id.checkbox2);

        correctAnswer6  = ans_option66.isChecked();
        correctAnswer66 = ans_option666.isChecked();
        correctAnswer666  = ans_option6.isChecked();

        if(correctAnswer6 && correctAnswer66 && !correctAnswer666){
            score6 = 10;
        }else {
            score6 = 0;
        }


        //Question 7 Correct Answer is 108
        Boolean correctAnswer7;

        RadioButton ans_option7 = this.findViewById(R.id.ans_option77);
        correctAnswer7 = ans_option7.isChecked();

        if(correctAnswer7){
            score7 = 10;
        }else {
            score7 = 0;
        }

        //Question 8 Correct Answer is 36
        Boolean correctAnswer8;

        RadioButton ans_option8 = this.findViewById(R.id.ans_option888);
        correctAnswer8 = ans_option8.isChecked();

        if(correctAnswer8){
            score8 = 10;
        }else {
            score8 = 0;
        }

        //Question 9 Correct Answer is Presidential

        EditText userText = this.findViewById(R.id.quest9_text);

        String input = userText.getText().toString();
        if(input.equals("Mohammadu Buhari")){
            score9 = 10;
        }
        else{score9 =0;}


        //Question 10 Correct Answer is June 12
        Boolean correctAnswer0;

        RadioButton ans_option0 = this.findViewById(R.id.ans_option000);
        correctAnswer0 = ans_option0.isChecked();

        if(correctAnswer0){
            score10 = 10;
        }else {
            score10 = 0;
        }

        //Sum the total score and store the value in the totalScore variable

        totalScore = score1 + score2 + score3 +score4 + score5 + score6 + score7 + score8 + score9 + score10;

        if(totalScore==100){

            String name = intent.getStringExtra("text");
            displayScores= name+","+ " Congratulations!, you know Nigeria too well, You Score 100%.";
        }
        else if(totalScore<50){

            String name = intent.getStringExtra("text");
            displayScores =name+","+ " You are a visitor, your score is " + totalScore +" out of 100";
        }
        else if(totalScore>50 && totalScore<100){

            String name = intent.getStringExtra("text");
            displayScores = name +","+ " You can even get better, your score is " + totalScore +" out of 100";
        }

        //Display Name, Total  Score in a Toast

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, displayScores, duration);

        toast.setGravity(Gravity.CENTER_HORIZONTAL, 0,0);
        View view1=toast.getView();
        view1.setBackgroundResource(R.color.colourGreen);
        toast.show();

    }

}