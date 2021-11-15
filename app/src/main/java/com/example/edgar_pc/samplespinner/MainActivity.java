package com.example.edgar_pc.samplespinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
Spinner spinner1,spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        additemsonLister2();
        spinner1=(Spinner)findViewById(R.id.spinner1);



        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (spinner1.getSelectedItemPosition()==0){

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });





    }

   public void additemsonLister2() {
       spinner2 = (Spinner) findViewById(R.id.spinner2);
       List<String> list = new ArrayList<String>();
       list.add("Lebron James");
       list.add("Kawhi Leonard");
       list.add("Kevin Durant");
       ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
               android.R.layout.simple_spinner_item, list);
       dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       spinner2.setAdapter(dataAdapter);
       spinner2.setPrompt("Select Cager");




    }
}
