package com.example.helloworld.prac18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

import com.example.helloworld.R;

public class prac18_1 extends AppCompatActivity {
    String s;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prac18_1);
        t = findViewById(R.id.prac18_txt);
        Intent i = getIntent();
        s = i.getStringExtra("num");

        switch (s) {
            case "BMW Next100":
                t.setText("Name: BMW Next100\n" +
                        "Launched Date: Coming Soon\n" +
                        "Company Name: BMW");
                break;
            case "Amaze":
                t.setText("Name: Amaze\n" +
                        "Launched Date: April 2013\n" +
                        "Company Name: Honda");
                break;
            case "Lamborghini Huracan Facelift":
                t.setText("Name: Lamborghini Huracan Facelift\n" +
                        "Launched Date: Coming soon\n" +
                        "Company Name: Lamborghini");
                break;
            case "Tarzan":
                t.setText("Name: Tarzan\n" +
                        "Launched Date: 2003\n" +
                        "Company Name: DC");
                break;
            case "Rolls Royce":
                t.setText("Name: Rolls Royce\n" +
                        "Launched Date: Coming Soon\n" +
                        "Company Name: Rolls Royce");
                break;
        }
    }
}
