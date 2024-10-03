package com.example.ooxx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Date;

public class SecondActivity extends AppCompatActivity {
    Boolean term  = false;
    int step = 0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button restart_button;
    Button back_button;
    TextView term_textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        restart_button = (Button)findViewById(R.id.restart_button);
        back_button = (Button)findViewById(R.id.back_button);
        term_textView = (TextView)findViewById(R.id.term_textView);



        ButtonHandler handler = new ButtonHandler();
        button1.setOnClickListener(handler);
        button2.setOnClickListener(handler);
        button3.setOnClickListener(handler);
        button4.setOnClickListener(handler);
        button5.setOnClickListener(handler);
        button6.setOnClickListener(handler);
        button7.setOnClickListener(handler);
        button8.setOnClickListener(handler);
        button9.setOnClickListener(handler);
        restart_button.setOnClickListener(handler);
        back_button.setOnClickListener(handler);

    }

    private class ButtonHandler implements View.OnClickListener {
        public void onClick(View v) {
            if(v == button1){
                button1.setText(whosterm());
                button1.setEnabled(false);
            }
            else if(v == button2){
                button2.setText(whosterm());
                button2.setEnabled(false);
            }
            else if(v == button3){
                button3.setText(whosterm());
                button3.setEnabled(false);
            }
            else if(v == button4){
                button4.setText(whosterm());
                button4.setEnabled(false);
            }
            else if(v == button5){
                button5.setText(whosterm());
                button5.setEnabled(false);
            }
            else if(v == button6){
                button6.setText(whosterm());
                button6.setEnabled(false);
            }
            else if(v == button7){
                button7.setText(whosterm());
                button7.setEnabled(false);
            }
            else if(v == button8){
                button8.setText(whosterm());
                button8.setEnabled(false);
            }
            else if(v == button9){
                button9.setText(whosterm());
                button9.setEnabled(false);
            }
            else if(v == restart_button){
                end_start_game(false);
            }
            else if(v == back_button){
                finish_();
            }
            step++;
            whowin();
        }
    }
    public String whosterm(){
        term  = !term;

        if(term){
            term_textView.setText("X turn");
            return "O";
        }
        else {
            term_textView.setText("O turn");
            return  "X";
        }
    }
    public void whowin(){


        if(term){
            if((button1.getText().toString().equals("O") && button2.getText().toString().equals("O") && button3.getText().toString().equals("O"))||
               (button4.getText().toString().equals("O") && button5.getText().toString().equals("O") && button6.getText().toString().equals("O"))||
               (button7.getText().toString().equals("O") && button8.getText().toString().equals("O") && button9.getText().toString().equals("O"))||
               (button1.getText().toString().equals("O") && button4.getText().toString().equals("O") && button7.getText().toString().equals("O"))||
               (button2.getText().toString().equals("O") && button5.getText().toString().equals("O") && button8.getText().toString().equals("O"))||
               (button3.getText().toString().equals("O") && button6.getText().toString().equals("O") && button9.getText().toString().equals("O"))||
               (button1.getText().toString().equals("O") && button5.getText().toString().equals("O") && button9.getText().toString().equals("O"))||
               (button3.getText().toString().equals("O") && button5.getText().toString().equals("O") && button7.getText().toString().equals("O"))){
                term_textView.setText("O Win!!");
                end_start_game(true);
                return;
            }
        }
        else if(!term){
            if((button1.getText().toString().equals("X") && button2.getText().toString().equals("X") && button3.getText().toString().equals("X"))||
               (button4.getText().toString().equals("X") && button5.getText().toString().equals("X") && button6.getText().toString().equals("X"))||
               (button7.getText().toString().equals("X") && button8.getText().toString().equals("X") && button9.getText().toString().equals("X"))||
               (button1.getText().toString().equals("X") && button4.getText().toString().equals("X") && button7.getText().toString().equals("X"))||
               (button2.getText().toString().equals("X") && button5.getText().toString().equals("X") && button8.getText().toString().equals("X"))||
               (button3.getText().toString().equals("X") && button6.getText().toString().equals("X") && button9.getText().toString().equals("X"))||
               (button1.getText().toString().equals("X") && button5.getText().toString().equals("X") && button9.getText().toString().equals("X"))||
               (button3.getText().toString().equals("X") && button5.getText().toString().equals("X") && button7.getText().toString().equals("X"))){
                term_textView.setText("X Win!!");
                end_start_game(true);
                return;
            }
        }
        if(step == 9){
            term_textView.setText("平手");
        }
    }
    public void end_start_game(Boolean end_start){
        if(end_start){
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
        }
        else{
            button1.setEnabled(true);
            button2.setEnabled(true);
            button3.setEnabled(true);
            button4.setEnabled(true);
            button5.setEnabled(true);
            button6.setEnabled(true);
            button7.setEnabled(true);
            button8.setEnabled(true);
            button9.setEnabled(true);
            button1.setText("");
            button2.setText("");
            button3.setText("");
            button4.setText("");
            button5.setText("");
            button6.setText("");
            button7.setText("");
            button8.setText("");
            button9.setText("");
            term_textView.setText("O turn");
            term = false;
            step = -1;
        }
    }

    public void finish_() {
        Intent retIntent = new Intent();
        setResult(RESULT_OK, retIntent);
        super.finish();
    }
}