package com.example.helloworld.prac14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.helloworld.R;

public class prac14 extends AppCompatActivity {
    EditText e;
    float f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prac14);
        e = (EditText) findViewById(R.id.prac14_ed);
        findViewById(R.id.prac14_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                f = (Float.parseFloat(e.getText().toString()) * 9 / 5) + 32;
                Toast.makeText(prac14.this, f + "°F", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
