package com.example.helloworld.prac11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.helloworld.R;

public class prac11_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prac11_2);

        Toast.makeText(this, "Welcome!!!", Toast.LENGTH_SHORT).show();
    }
}
