package com.example.raheembakare_mapd711_task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void SendMessage (View v){
     // initiate intent class
        Intent intent = new Intent(MainActivity.this, SubActivity.class);

        // sending

        EditText editText = findViewById(R.id.editText);
        intent.putExtra("message", editText.getText().toString());


        EditText editText2 = findViewById(R.id.editText2);
        intent.putExtra("message2", editText2.getText().toString());

        EditText editText3 = findViewById(R.id.editText3);
        intent.putExtra("message3", editText3.getText().toString());

        EditText editText4 = findViewById(R.id.editText4);
        intent.putExtra("message4", editText4.getText().toString());

        EditText editText5 = findViewById(R.id.editText5);
        intent.putExtra("message5", editText5.getText().toString());



// go to sub activity
      startActivity(intent);


    }

}
