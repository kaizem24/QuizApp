package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class FirstPage extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstpage_activity);



        Button btn = this.findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchActivity();
            }
        });


    }
    //This method open  or link to the second activity once the user click on the next page on the first page screen.
    public void launchActivity(){

        //Declation for the view and view group widget
        RadioButton option1;
        RadioButton option2;
        RadioButton option3;
        RadioButton option4;
        TextView text;

        Boolean correctChoice1;
        Boolean correctChoice2;
        Boolean correctChoice3;
        Boolean correctChoice4;


        option1 = this.findViewById(R.id.ans_option11);
        option2 = this.findViewById(R.id.ans_option222);
        option3 = this.findViewById(R.id.ans_option333);
        option4 = this.findViewById(R.id.ans_option44);

        text =  this.findViewById(R.id.name_text_view);
        String fullName = text.getText().toString();


        correctChoice1=option1.isChecked();
        correctChoice2=option2.isChecked();
        correctChoice3=option3.isChecked();
        correctChoice4=option4.isChecked();


        /*

        We store the radio button control and other variables in the intent in order to be able to access the variable from other activity
         */
        Intent intent = new Intent(this, SecondPage.class);

        intent.putExtra("option1",correctChoice1);
        intent.putExtra("option2",correctChoice2);
        intent.putExtra("option3",correctChoice3);
        intent.putExtra("option4",correctChoice4);
        intent.putExtra("text", fullName);
        startActivity(intent);
    }
}