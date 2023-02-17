package com.example.helloworld.prac16;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.helloworld.R;

import java.util.ArrayList;
import java.util.List;

public class prac16_1 extends AppCompatActivity {
    String snum;
    ListView l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prac16_1);
        l = findViewById(R.id.prac16_list);
        Intent i = getIntent();
        snum = i.getStringExtra("num");
        String[] a = new String[Integer.parseInt(snum)];
        for (int j = 0; j < Integer.parseInt(snum); j++) {
            a[j] = String.valueOf(j + 1);
        }
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, R.layout.prac16_2, R.id.prac16_txt, a);
        l.setAdapter(aa);
    }
}
