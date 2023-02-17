package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class onclicktest extends AppCompatActivity {
EditText t,t2;
boolean b1=true;
String s;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onclicktest);
        t=(EditText) findViewById(R.id.txt_bt);
        t.setTextSize(30);
        t2=(EditText) findViewById(R.id.txt_bt2);
        b=(Button) findViewById(R.id.bt_color);
t.setOnFocusChangeListener(new View.OnFocusChangeListener() {
    @Override
    public void onFocusChange(View view, boolean b) {
        Toast.makeText(onclicktest.this, "focuschange", Toast.LENGTH_SHORT).show();
    }
});
        t2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                Toast.makeText(onclicktest.this, "focuschange", Toast.LENGTH_SHORT).show();
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                t.setTextColor(Color.RED);
            }
        });
    }

    public void tost(View view) {
        s=t.getText().toString().trim();
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

    public void size(View view) {

        if (b1) {
            t.setTextSize(90);
            b1 = false;
        }
        else{
            t.setTextSize(30);
            b1 = true;
        }
        
    }
    
}
