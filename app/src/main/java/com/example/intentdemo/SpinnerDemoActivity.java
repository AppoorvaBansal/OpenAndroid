package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

public class SpinnerDemoActivity extends AppCompatActivity {

    EditText edname,eduid,edmobile;
    TextView txtresult;
    Button btnreg;
    Spinner spin;
    ArrayAdapter<String> adapter;
    ArrayList<String> data;
    HashMap<String,Student> datahash ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_demo);

        edname=findViewById(R.id.txtSname);
        edmobile=findViewById(R.id.txtMobile);
        eduid=findViewById(R.id.txtUid);
        btnreg=findViewById(R.id.btnAdd);
        spin=findViewById(R.id.spinner);
        txtresult=findViewById(R.id.txtResult);

        data=new ArrayList<String>();
        datahash=new HashMap<String,Student>();
        data.add("SELECT UIDS..");
        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,data);
        spin.setAdapter(adapter);
        eduid.requestFocus();
        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=edname.getText().toString();
               String mobile=edmobile.getText().toString();
               String uid=eduid.getText().toString();
                Toast.makeText(SpinnerDemoActivity.this,name+mobile+uid,Toast.LENGTH_SHORT).show();

                datahash.put(uid,new Student(name,mobile));
               data.add(uid);
                Toast.makeText(SpinnerDemoActivity.this,"Registered..",Toast.LENGTH_SHORT).show();

            }
        });

      spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
          @Override
          public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              if (position > 0) {
                  String uid = data.get(position);
                  Student s = datahash.get(uid);
                  String name = s.getName();
                  String mobile = s.getMobile();

                  txtresult.setText("UID: " + uid +

                          "\nName: " + name +

                         "\nMobile: " + mobile);
              }
          }
          @Override
          public void onNothingSelected(AdapterView<?> parent) {

          }
      });


    }
}
