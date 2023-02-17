package com.example.helloworld.prac9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.helloworld.R;

public class prac9_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prac9_2);
        String s1, s2, s3, s4, s5, s6, s7;
        Intent i = getIntent();
        s1 = i.getStringExtra("fname");
        s2 = i.getStringExtra("lname");
        s3 = i.getStringExtra("mob");
        s4 = i.getStringExtra("email");
        s5 = i.getStringExtra("pass");
        s6 = i.getStringExtra("gender");
        s7 = i.getStringExtra("hob");
        Toast.makeText(this, "First Name: " + s1 + "\nLast Name: " + s2 + "\nMobile No: " + s3 + "\nEmail:" + s4 + "\nPassword: " + s5 + "\nGender: " + s6 + "\nHobbies: " + s7, Toast.LENGTH_SHORT).show();
    }
}
