package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);


        Intent i=getIntent();
        String message=i.getStringExtra("message");
       // String message2=i.getStringExtra("message2");
        //String message = message1 + "  " + message2;



        //defining a java reference object for a textview
        TextView textView1=findViewById(R.id.textView);
        textView1.setText(message);
    }
}
