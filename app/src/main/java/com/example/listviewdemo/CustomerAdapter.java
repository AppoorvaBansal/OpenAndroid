package com.example.listviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomerAdapter extends ArrayAdapter<String> {

    ArrayList<String> ipldata;
    ArrayList<Integer> imgdata;
    Context c;
    LayoutInflater li;
public CustomerAdapter(Context c,ArrayList<String> ipl,ArrayList<Integer> img)
{
    super(c,R.layout.listview_layout,R.id.txt1,ipl);
    this.c=c;
    ipldata=ipl;
    imgdata=img;
    li=LayoutInflater.from(c);

}

    @NonNull
    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {

        convertView=li.inflate(R.layout.listview_layout,null);
        ImageView imgview=convertView.findViewById(R.id.img1);
        TextView txt1=convertView.findViewById(R.id.txt1);

        imgview.setImageResource(imgdata.get(position));
        txt1.setText(ipldata.get(position));

        return convertView;
    }
}
