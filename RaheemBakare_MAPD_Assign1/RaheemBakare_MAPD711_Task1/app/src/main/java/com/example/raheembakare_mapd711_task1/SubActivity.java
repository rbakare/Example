package com.example.raheembakare_mapd711_task1;

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
        String message2=i.getStringExtra("message2");
        String message3=i.getStringExtra("message3");
        String message4=i.getStringExtra("message4");
        String message5=i.getStringExtra("message5");

        TextView textView7=findViewById(R.id.textView7);
        textView7.setText(message);

        TextView textView9=findViewById(R.id.textView9);
        textView9.setText(message2);

        TextView textView11=findViewById(R.id.textView11);
        textView11.setText(message3);

        TextView textView13=findViewById(R.id.textView13);
        textView13.setText(message4);

        TextView textView15=findViewById(R.id.textView15);
        textView15.setText(message5);


    }

}
