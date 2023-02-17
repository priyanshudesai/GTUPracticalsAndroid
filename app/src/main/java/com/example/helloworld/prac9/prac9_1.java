package com.example.helloworld.prac9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.helloworld.R;

public class prac9_1 extends AppCompatActivity {
    EditText e1, e2, e3, e4, e5, e6;
    RadioButton r1, r2;
    CheckBox c1, c2, c3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prac9_1);
        e1 = (EditText) findViewById(R.id.prac9_fname);
        e2 = (EditText) findViewById(R.id.prac9_lname);
        e3 = (EditText) findViewById(R.id.prac9_mob);
        e4 = (EditText) findViewById(R.id.prac9_email);
        e5 = (EditText) findViewById(R.id.prac9_pass);
        e6 = (EditText) findViewById(R.id.prac9_cpass);
        r1 = (RadioButton) findViewById(R.id.prac9_male);
        r2 = (RadioButton) findViewById(R.id.prac9_female);
        c1 = (CheckBox) findViewById(R.id.prac9_sp);
        c2 = (CheckBox) findViewById(R.id.prac9_ch);
        c3 = (CheckBox) findViewById(R.id.prac9_mu);
        findViewById(R.id.prac9_reg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (e1.length() == 0 || e2.length() == 0 || e3.length() == 0 || e4.length() == 0 || e5.length() == 0 || !(r1.isChecked() || r2.isChecked()) || !(c1.isChecked() || c2.isChecked() || c3.isChecked())) {
                    Toast.makeText(prac9_1.this, "Please Enter Credentails", Toast.LENGTH_SHORT).show();
                } else {
                    if (!(e5.getText().toString().equals(e6.getText().toString()))) {
                        Toast.makeText(prac9_1.this, "Password do not match", Toast.LENGTH_SHORT).show();
                    } else {
                        String s = "";
                        if (c1.isChecked()) {
                            s = c1.getText().toString();
                        }
                        if (c2.isChecked()) {
                            s = s + " " + c2.getText().toString();
                        }
                        if (c3.isChecked()) {
                            s = s + " " + c3.getText().toString();
                        }

                        Intent i = new Intent(prac9_1.this, prac9_2.class);
                        i.putExtra("fname", e1.getText().toString());
                        i.putExtra("lname", e2.getText().toString());
                        i.putExtra("mob", e3.getText().toString());
                        i.putExtra("email", e4.getText().toString());
                        i.putExtra("pass", e5.getText().toString());
                        i.putExtra("gender", r1.isChecked() ? "Male" : "Female");
                        i.putExtra("hob", s);
                        startActivity(i);
                    }
                }
            }
        });
    }
}
