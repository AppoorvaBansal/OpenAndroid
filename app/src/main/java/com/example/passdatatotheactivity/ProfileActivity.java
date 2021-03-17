package com.example.passdatatotheactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    TextView txtname,txtcon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        txtname=findViewById(R.id.txtproname);
        txtcon=findViewById(R.id.txtprocontact);

        Intent i=getIntent();

        //retrive the data from the i ... set it into LAYOUT

          String strname=  i.getStringExtra("KeyName"); // get the string value
        String strcontact=i.getStringExtra("KeyContact");

        Log.i("RES",strname+"  "+strcontact);
        txtname.setText(strname);
        txtcon.setText(strcontact);

    }
}
