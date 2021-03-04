package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edn1,edn2;
    TextView txtres;
    Button btnadd,btnsub,btnmul,btndiv,btnclr,btnpercentage;
    double num1,num2,res;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edn1=(EditText)findViewById(R.id.ednum1);
        edn2=(EditText)findViewById(R.id.ednum2);
        txtres=(TextView)findViewById(R.id.txtres);
        btnadd=(Button)findViewById(R.id.btnadd);
        btnsub=(Button)findViewById(R.id.btnsub);
        btnmul=(Button)findViewById(R.id.btnmul);
        btndiv=(Button)findViewById(R.id.btndiv);
        btnpercentage=(Button)findViewById(R.id.btnpercent);
        btnclr=(Button)findViewById(R.id.btnclr);



    }


    public void add(View v)
    {
        num1=Double.parseDouble(edn1.getText().toString());  //5
        num2=Double.parseDouble(edn2.getText().toString());  //6
        res=num1+num2;   //11

        txtres.setText(Double.toString(res));  // display the text on TEXTVIEW or EDITTEXT
       // txtres.setText(""+res);

    }
    public void sub(View v)
    {
        num1=Double.parseDouble(edn1.getText().toString());  //5
        num2=Double.parseDouble(edn2.getText().toString());  //6
        res=num1-num2;   //11

        txtres.setText(Double.toString(res));
    }

    public void mul(View v)
    {
        num1=Double.parseDouble(edn1.getText().toString());  //5
        num2=Double.parseDouble(edn2.getText().toString());  //6
        res=num1*num2;   //11

        txtres.setText(Double.toString(res));

    }

    public void div(View v)
    {
        num1=Double.parseDouble(edn1.getText().toString());  //5
        num2=Double.parseDouble(edn2.getText().toString());  //6
        res=num1/num2;   //11

        txtres.setText(Double.toString(res));
    }

    public void percent(View v)
    {
        num1=Double.parseDouble(edn1.getText().toString());  //5
        num2=Double.parseDouble(edn2.getText().toString());  //6
        res=num1/num2*100;
        txtres.setText(""+res);
    }
    public void clear(View v)
    {
            edn1.setText("");
            edn2.setText("");
            txtres.setText("");
    }
}
