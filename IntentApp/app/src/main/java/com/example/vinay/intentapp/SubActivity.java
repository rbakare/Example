package com.example.vinay.intentapp;

//Author: Vinay
//

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

       // String message="";
        Intent intent=getIntent();

        String message = intent.getStringExtra("MyMessage");


        TextView textView=(TextView) findViewById(R.id.textView1);

        textView.setText(message);
        //textView.setText(R.string.Message);
        //Log.d("test","log messages");
    }
}
