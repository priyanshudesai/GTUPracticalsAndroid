package com.example.helloworld.prac13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.helloworld.R;

public class prac13 extends AppCompatActivity {
    EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prac13);
        ed = (EditText) findViewById(R.id.prac13_ed);
        findViewById(R.id.prac13_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(prac13.this, ed.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
