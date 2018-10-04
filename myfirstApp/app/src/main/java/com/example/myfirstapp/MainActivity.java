package com.example.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void SendMessage (View v) {
        //intantiate intent class
        Intent intent = new Intent(MainActivity.this, SubActivity.class);

        //sending a message
        EditText editText = findViewById(R.id.editText);
        intent.putExtra("message", editText.getText().toString());
       /*intent.putExtra(  "message1","this is from main");
        intent.putExtra(  "message2","this is also from main");*/


        //go to sub activity
        startActivity(intent);
    }
}

