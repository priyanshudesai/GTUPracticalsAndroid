package com.example.helloworld.prac12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.helloworld.R;

public class prac12_2 extends AppCompatActivity {
    TextView t;
    String s1, s2;
    int s3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prac12_2);
        t = (TextView) findViewById(R.id.prac12_txt);
        Intent i = getIntent();
        s1 = i.getStringExtra("num1");
        s2 = i.getStringExtra("num2");
        s3 = Integer.parseInt(s1) + Integer.parseInt(s2);
        t.setText(s1 + " + " + s2 + " = " + s3);
    }
}
