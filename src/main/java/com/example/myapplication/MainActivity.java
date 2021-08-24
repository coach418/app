package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
      TextView tv ;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        tv = findViewById(R.id.sumOfNumbers );
        add();
    }
    public void add()
    {
        int num1 = 3 ;
        int num2 = 5 ;
       int sum = num1 + num2;
       tv.setText(String.valueOf( sum ));

    }


}