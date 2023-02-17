package com.example.helloworld.prac10;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.helloworld.R;

public class prac10 extends AppCompatActivity {
    RadioButton r1, r2, r3;
    LinearLayout l;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prac10);
        r1 = (RadioButton) findViewById(R.id.prac10_red);
        r2 = (RadioButton) findViewById(R.id.prac10_green);
        r3 = (RadioButton) findViewById(R.id.prac10_blue);
        rg = (RadioGroup) findViewById(R.id.prac10_rg);
        l = (LinearLayout) findViewById(R.id.prac10_ll);

        r1.setChecked(true);
        l.setBackgroundColor(Color.RED);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (r1.isChecked()) {
                    l.setBackgroundColor(Color.RED);
                } else if (r2.isChecked()) {
                    l.setBackgroundColor(Color.GREEN);
                } else if (r3.isChecked()) {
                    l.setBackgroundColor(Color.BLUE);
                }
            }
        });
    }
}
