package com.example.contentproviderdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txt1;
    Button btnshow;
    Uri uri= ContactsContract.Contacts.CONTENT_URI;
    String[] myprojection=new String[]{ContactsContract.Contacts.DISPLAY_NAME,ContactsContract.Contacts.HAS_PHONE_NUMBER};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=findViewById(R.id.txt1);
        btnshow=findViewById(R.id.btnshow);

        btnshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContentResolver cr;
                cr=getContentResolver();
                Cursor c=cr.query(uri,myprojection,null,null,null); // retriveing the data from the conatct application
                StringBuilder str=new StringBuilder();
                if(c!=null && c.getCount()>0)
                {
                    while(c.moveToNext())
                    {
                        str.append(c.getString(0)+"  "+c.getString(1)+"\n");
                    }
                    txt1.setText(str);
                }
                else{
                    Toast.makeText(MainActivity.this,"NO CONTACTS IN THE DEVICE",Toast.LENGTH_LONG).show();
                            txt1.setText("No Conact are there in the device");
                }



            }
        });
    }
}
