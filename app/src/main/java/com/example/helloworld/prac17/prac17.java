package com.example.helloworld.prac17;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.helloworld.R;

public class prac17 extends AppCompatActivity {
    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prac17);
        e = (EditText) findViewById(R.id.prac17_ed);
    }

    public void submit(View view) {
        String s = e.getText().toString().trim();
        Intent i = new Intent();
        i.setData(Uri.parse(s));
        startActivity(i);
    }
}
