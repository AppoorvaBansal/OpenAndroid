package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.mariuszgromada.math.mxparser.Expression;

public class CalWithKeypadActivity extends AppCompatActivity {

    EditText txtwrite;
    TextView txtres;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnADD,btnSUb,btnMUL,btnDIV,btnEQL,btnCLR;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_with_keypad);

        txtwrite=findViewById(R.id.txtwrite);
        txtres=findViewById(R.id.txtres);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btn0=findViewById(R.id.btn0);
        btnSUb=findViewById(R.id.btnSUB);
        btnMUL=findViewById(R.id.btnMUL);
        btnDIV=findViewById(R.id.btnDIV);
        btnEQL=findViewById(R.id.btnEQL);
        btnCLR=findViewById(R.id.btnCLR);
        btnADD=findViewById(R.id.btnADD);

        txtwrite.setShowSoftInputOnFocus(false);

    }

    public void onebtn(View v)
    {
            txtwrite.setText(txtwrite.getText()+"1");
        result();
        //txtwrite.append("1");
    }
    public void twobtn(View v)
    {
        txtwrite.setText(txtwrite.getText()+"2");
        result();
    }
    public void threebtn(View v)
    {
        txtwrite.setText(txtwrite.getText()+"3");
        result();
    }
    public void fourbtn(View v)
    {
        txtwrite.setText(txtwrite.getText()+"4");
        result();
    }
    public void fivebtn(View v)
    {
        txtwrite.setText(txtwrite.getText()+"5");
        result();
    }
    public void sixbtn(View v)
    {
        txtwrite.setText(txtwrite.getText()+"6");
        result();
    }
    public void sevenbtn(View v)
    {
        txtwrite.setText(txtwrite.getText()+"7");
        result();
    }
    public void eightbtn(View v)
    {
        txtwrite.setText(txtwrite.getText()+"8");
        result();
    }
    public void ninebtn(View v)
    {
        txtwrite.setText(txtwrite.getText()+"9");
        result();
    }
    public void zerobtn(View v)
    {
        txtwrite.setText(txtwrite.getText()+"0");
        result();
    }
    public void addbtn(View v)
    {
        txtwrite.setText(txtwrite.getText()+"+");
    }
    public void subbtn(View v)
    {
        txtwrite.setText(txtwrite.getText()+"-");
    }
    public void mulbtn(View v)
    {
        txtwrite.setText(txtwrite.getText()+"*");
    }
    public void divbtn(View v)
    {
        txtwrite.setText(txtwrite.getText()+"/");
    }
    public void clrbtn(View v)
    {
        txtwrite.setText("");
        txtres.setText("");
    }
    public void eqlbtn(View v)
    {
           result();  // res evalute
           txtwrite.setText("");
    }

    public void dotbtn(View v)
    {
            txtwrite.setText(txtwrite.getText()+".");
    }

    public void backspacebtn(View v)
    {
            String str=txtwrite.getText().toString();
            int length=str.length();

            if(length>0)
            {
                txtwrite.setText(str.substring(0,length-1));

            }
            else
                txtwrite.setText("0");

    }

    public void result()
    {
        String str=txtwrite.getText().toString();
        Expression exp=new Expression(str);
        String res=String.valueOf(exp.calculate());
        txtres.setText(res);
    }

}
