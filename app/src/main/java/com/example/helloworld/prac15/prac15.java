package com.example.helloworld.prac15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.helloworld.R;

public class prac15 extends AppCompatActivity {
    EditText ed1, ed2;
    String s;
    float f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prac15);
        ed1 = (EditText) findViewById(R.id.prac15_n1);
        ed2 = (EditText) findViewById(R.id.prac15_n2);
        findViewById(R.id.prac15_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed1.length() == 0 || ed2.length() == 0) {
                    Toast.makeText(prac15.this, "Please Enter Numbers", Toast.LENGTH_SHORT).show();
                } else {
                    f = Float.parseFloat(ed1.getText().toString()) / Float.parseFloat(ed2.getText().toString());
                    s = Float.toString(f);
                    if (ed1.getText().toString().compareTo(ed2.getText().toString()) == 0) {
                        s = s + "\nBoth are Equal";
                    }
                    if (ed1.getText().toString().compareTo(ed2.getText().toString()) > 0) {
                        s = s + "\nFirst number is Maximum";
                    } else {
                        s = s + "\nSecond number is Maximum";
                    }
                    Toast.makeText(prac15.this, ed1.getText() + " / " + ed2.getText() + " = " + s, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
