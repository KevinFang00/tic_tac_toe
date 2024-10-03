package com.example.ooxx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int myRequest_Code = 1;
    Button start_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start_button = (Button) findViewById(R.id.start_button);

        ButtonHandler handler = new ButtonHandler();
        start_button.setOnClickListener(handler);
    }

    protected void onActivityResult(int request_code, int result_code, Intent data){
        super.onActivityResult(request_code, result_code, data);
    }

    private class ButtonHandler implements View.OnClickListener{
        public void onClick(View v){
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);

            startActivityForResult(intent, myRequest_Code);
        }
    }
}