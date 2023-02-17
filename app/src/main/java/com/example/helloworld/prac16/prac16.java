package com.example.helloworld.prac16;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.helloworld.R;

public class prac16 extends AppCompatActivity {
    EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prac16);
        ed = (EditText) findViewById(R.id.prac16_ed);

        findViewById(R.id.prac16_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ed.getText().toString().length() != 0) {
                    startActivity(new Intent(prac16.this, prac16_1.class)
                            .putExtra("num", ed.getText().toString()));
                }
            }
        });
    }
}
