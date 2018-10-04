package com.example.raheembakare_mapd711_task2;

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
        // defining java reference for fullname
        TextView textViewn=findViewById(R.id.textView6);
        textViewn.setText(message);


        String message2=i.getStringExtra("message2");
        // defining java reference for qualification
        TextView textViewq=findViewById(R.id.textView7);
        textViewq.setText(message2);

        String message3=i.getStringExtra("message3");
        // defining java reference for profession
        TextView textViewp=findViewById(R.id.textView8);
        textViewp.setText(message3);

        String message4=i.getStringExtra("message4");
        // defining java reference for hobby
        TextView textViewh=findViewById(R.id.textView9);
        textViewh.setText(message4);

        String message5=i.getStringExtra("message5");
        // defining java reference for dreamjob
        TextView textViewd=findViewById(R.id.textView10);
        textViewd.setText(message5);



    }
}
