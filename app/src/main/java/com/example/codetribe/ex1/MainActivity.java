package com.example.codetribe.ex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    EditText h;
    RadioGroup rdg;
    RadioButton selected;

    double BMI = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        h = (EditText) findViewById(R.id.h);
        rdg = (RadioGroup) findViewById(R.id.rdg);

    }

    public void onClick(View v)
    {
        int weight;
        double height;

      height = Double.parseDouble(h.getText().toString());

        switch(v.getId())
        {
            case R.id.rdb1:
                weight = 50;
                BMI = Math.round(weight / Math.pow(height,2));
                Toast.makeText(MainActivity.this, "BMI : " + BMI + " \nCategory : Underweight" , Toast.LENGTH_LONG).show();
                break;

            case R.id.rdb2:
                weight = 65;
                BMI = Math.round(weight / Math.pow(height,2));
                Toast.makeText(MainActivity.this, "BMI : " + BMI + " \nCategory : Normal" , Toast.LENGTH_LONG).show();
                break;

            case R.id.rdb3:
                weight = 80;
                BMI = Math.round(weight / Math.pow(height,2));
                Toast.makeText(MainActivity.this, "BMI : " + BMI + " \nCategory : Overweight" , Toast.LENGTH_LONG).show();
                break;

            case R.id.rdb4:
                weight = 100;
                BMI = Math.round(weight / Math.pow(height,2));
                Toast.makeText(MainActivity.this, "BMI : " + BMI + " \nCategory : Obesse" , Toast.LENGTH_LONG).show();
                break;



        }




    }

}
