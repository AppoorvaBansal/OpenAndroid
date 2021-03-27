package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView iplList;
    ArrayAdapter ad;
    ArrayList<String> ipldata;
    ArrayList<Integer> imgdata;
    CustomerAdapter ca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iplList=findViewById(R.id.ipllist);
        imgdata=new ArrayList<Integer>();
        ipldata=new ArrayList<String>();

        ipldata.add("KXIP");
        ipldata.add("CSK");
        ipldata.add("MI");
        ipldata.add("KKR");

        ipldata.add("KXIP");
        ipldata.add("CSK");
        ipldata.add("MI");
        ipldata.add("KKR");
        ipldata.add("KXIP");
        ipldata.add("CSK");
        ipldata.add("MI");
        ipldata.add("KKR");

        imgdata.add(R.drawable.a1);
        imgdata.add(R.drawable.a2);
        imgdata.add(R.drawable.a5);
        imgdata.add(R.drawable.a4);
        imgdata.add(R.drawable.a1);
        imgdata.add(R.drawable.a2);
        imgdata.add(R.drawable.a5);
        imgdata.add(R.drawable.a4);
        imgdata.add(R.drawable.a1);
        imgdata.add(R.drawable.a2);
        imgdata.add(R.drawable.a5);
        imgdata.add(R.drawable.a4);


            ca=new CustomerAdapter(getApplicationContext(),ipldata,imgdata);
      //  ad=new ArrayAdapter(this,R.layout.listview_layout,R.id.txt1,ipldata);

        iplList.setAdapter(ca);


    }
}
