package com.example.raheembakare_mapd711_task2;

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
        //initiate intent class
        Intent intent = new Intent(MainActivity.this, SubActivity.class);

        // sending

        String fullname=getResources() . getString(R.string.textView1);
        //sending fullname
        intent.putExtra("message",fullname);


      String qualification=getResources() . getString(R.string.textView2);
      //sending qualification
        intent.putExtra("message2",qualification);

         String profession=getResources() . getString(R.string.textView3);
         // sending profession
        intent.putExtra("message3",profession);

         String hobby=getResources() . getString(R.string.textView4);
         //sending hobby
        intent.putExtra("message4",hobby);

         String dreamjob=getResources() . getString(R.string.textView5);
         //sending dreamjob
        intent.putExtra("message5",dreamjob);



// sending to sub Activity
        startActivity(intent);







    }





}
