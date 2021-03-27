package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ImplicitActivity extends AppCompatActivity {

    Button b1, b2, b3,b4;
    EditText ed1, ed2, ed3;
    Uri uri;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit);
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        ed3 = findViewById(R.id.ed3);

        b1 = findViewById(R.id.btnurl);
        b2 = findViewById(R.id.btnmap);
        b3 = findViewById(R.id.btntext);
        b4 = findViewById(R.id.btncam);
        b1.setOnClickListener(cl);
        b2.setOnClickListener(cl);
        b3.setOnClickListener(cl);
        b4.setOnClickListener(cl);
    }

    View.OnClickListener cl = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int id = v.getId();

            if (id == R.id.btnurl) {
                String url = ed1.getText().toString(); //http://google.com
                uri = Uri.parse(url);//Encode and parse that string into a Uri object:
                i = new Intent(Intent.ACTION_VIEW, uri);

                if (i.resolveActivity(getPackageManager()) != null) {
                    startActivity(i);
                }
                else {
                    Toast.makeText(ImplicitActivity.this,"NOT HANDLE",Toast.LENGTH_LONG).show();
                }
            }
            if (id == R.id.btnmap) {
                String map = ed2.getText().toString();
                uri = Uri.parse("geo:0,0?q="+map);
                i = new Intent(Intent.ACTION_VIEW, uri);
                if (i.resolveActivity(getPackageManager()) != null) {
                    startActivity(i);
                }
                else {
                    Toast.makeText(ImplicitActivity.this,"NOT HANDLE",Toast.LENGTH_LONG).show();
                }
            }
            if (id == R.id.btntext) {
                Toast.makeText(ImplicitActivity.this,"TEXT",Toast.LENGTH_LONG).show();

                String text = ed3.getText().toString();
                ShareCompat.IntentBuilder i=ShareCompat.IntentBuilder.from(ImplicitActivity.this);
                        i.setType("text/plain");
                        i.setChooserTitle("ABC");
                        i.setText(text);
                        i.startChooser();

            }
            if(id==R.id.btncam)
            {
                i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if (i.resolveActivity(getPackageManager()) != null) {
                    startActivity(i);
                }
                else {
                    Toast.makeText(ImplicitActivity.this,"NOT HANDLE",Toast.LENGTH_LONG).show();
                }
            }


        }
    };
}
