package com.example.passdatatotheactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationActivity extends AppCompatActivity {

    EditText edname,edcontact;
    Button btnsave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


        edname=findViewById(R.id.edname);
        edcontact=findViewById(R.id.edcontact);
        btnsave=findViewById(R.id.btnsave);

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(RegistrationActivity.this,ProfileActivity.class);
                i.putExtra("KeyName",edname.getText().toString());
                i.putExtra("KeyContact",edcontact.getText().toString());
                startActivity(i);

            }
        });


    }
}
