package com.example.passdatatotheactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageProfileActivity extends AppCompatActivity {

    ImageView img;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_profile);

        img=findViewById(R.id.imgdp);
        txt=findViewById(R.id.txt1);
        Intent i=getIntent();

        Uri imguri=i.getParcelableExtra("imgdata");

        img.setImageURI(imguri);
        txt.setText("Harry Potter");

    }
}
