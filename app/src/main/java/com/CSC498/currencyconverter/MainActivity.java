package com.CSC498.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText input;
    TextView output;
    Button lbp;
    Button dollar;
    double rate = 22000; //rate 1$=22000

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = (EditText) findViewById(R.id.input);
        output=(TextView) findViewById(R.id.output);
        lbp = (Button) findViewById(R.id.lbp);
        dollar= (Button) findViewById(R.id.dollar);
    }

    public void convertLBP(View v){
        double x =  Integer.parseInt(input.getText().toString());
        output.setText("The converted amount in LBP is: "+ x*rate);
    }
    public void convert$(View v){
        double x =  Integer.parseInt(input.getText().toString());
        output.setText("The converted amount in $ is: "+ x%rate);
    }
}