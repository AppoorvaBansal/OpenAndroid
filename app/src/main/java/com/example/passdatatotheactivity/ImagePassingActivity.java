package com.example.passdatatotheactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImagePassingActivity extends AppCompatActivity {

    ImageView imguplaod;
    Button btnsend;

    Uri imguri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_passing);
        imguplaod=findViewById(R.id.imgupload);
        btnsend=findViewById(R.id.btnsend);

        btnsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(ImagePassingActivity.this,ImageProfileActivity.class);
                i.putExtra("imgdata",imguri);
                startActivity(i);

            }
        });


        imguplaod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(Intent.ACTION_GET_CONTENT);
                i.setType("image/");
                startActivityForResult(Intent.createChooser(i,"Select"),1);


            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode== RESULT_OK) // succefully returned
        {
            if(requestCode==1)
            {
                imguri=data.getData(); // get the image from the local storage
                imguplaod.setImageURI(imguri);

                // get the image
                //set the image on the imageview
            }
        }


    }
}
