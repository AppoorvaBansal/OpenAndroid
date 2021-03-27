package com.example.spinnerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    Spinner spinlist;
    EditText edname,edcity,eduid;
    ArrayAdapter ad;
    ArrayList<String> uiddata;
    Button btnsave;

    HashMap<String,Student> studata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinlist=findViewById(R.id.spinlist);
        btnsave=findViewById(R.id.btnsave);
        eduid=findViewById(R.id.eduid);
        edcity=findViewById(R.id.edCITY);
        edname=findViewById(R.id.edname);
        uiddata=new ArrayList<String>();
        studata=new HashMap<String, Student>();


uiddata.add("SELECT UID");
        ad=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,uiddata);
        spinlist.setAdapter(ad);

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uid=eduid.getText().toString();
                String name=edname.getText().toString();
                String city=edcity.getText().toString();

                Student s=new Student(name,city);
                uiddata.add(uid);

                studata.put(uid,s);

            }
        });

        spinlist.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position>0)
                {
                    String uid=uiddata.get(position);
                    Student s=studata.get(uid);

                    String name=s.getName();
                            String city=s.getCity();

                    Toast.makeText(MainActivity.this,"UID: " + uid + " \n city : "+ city +" \n Name : " + name,Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}
