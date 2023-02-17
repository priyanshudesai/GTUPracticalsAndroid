package com.example.helloworld.prac12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.helloworld.R;

public class prac12_1 extends AppCompatActivity {
    EditText e1, e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prac12_1);
        e1 = (EditText) findViewById(R.id.prac12_n1);
        e2 = (EditText) findViewById(R.id.prac12_n2);

        findViewById(R.id.prac12_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.length() == 0 || e2.length() == 0) {
                    Toast.makeText(prac12_1.this, "Please Enter Numbers", Toast.LENGTH_SHORT).show();
                } else {
                    Intent i = new Intent(prac12_1.this, prac12_2.class);
                    i.putExtra("num1", e1.getText().toString());
                    i.putExtra("num2", e2.getText().toString());
                    startActivity(i);
                }
            }
        });
    }
}
