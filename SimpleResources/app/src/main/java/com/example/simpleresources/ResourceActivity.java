package com.example.simpleresources;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class ResourceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource);

        RadioGroup radioGroup=findViewById(R.id.rg);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb1=findViewById(R.id.radioButton1);
                RadioButton rb2=findViewById(R.id.radioButton2);

                if (rb1.isChecked()) {
                    Toast.makeText(getApplicationContext(),"Option 1 selected",
                            Toast.LENGTH_LONG).show();
                } else if (rb2.isChecked()){
                    Toast.makeText(getApplicationContext(),"Option 2 selected",
                            Toast.LENGTH_LONG).show();
                }

            }
        });
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.flavours, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        String[] flavours=getResources(). getStringArray
                (R.array.flavours);

        ArrayAdapter<String> Adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,flavours);

        AutoCompleteTextView text=findViewById(R.id.autoText);
        text.setThreshold(3);
        text.setAdapter(Adapter);


    }
}