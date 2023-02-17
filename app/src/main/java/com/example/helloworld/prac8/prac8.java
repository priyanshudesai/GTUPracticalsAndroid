package com.example.helloworld.prac8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.helloworld.R;

public class prac8 extends AppCompatActivity {
    EditText e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prac8);
        e1 = (EditText) findViewById(R.id.prac8_email);
        e2 = (EditText) findViewById(R.id.prac8_pass);
        findViewById(R.id.prac8_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = e1.getText().toString();
                String s1 = e2.getText().toString();
                if (s.equals("pd@gmail.com") && s1.equals("pd")) {
                    startActivity(new Intent(prac8.this, prac8_2.class));
                } else {
                    Toast.makeText(prac8.this, "Please Enter Credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
