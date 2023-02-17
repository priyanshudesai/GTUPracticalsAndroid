package com.example.helloworld.prac18;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.helloworld.R;
import com.example.helloworld.prac16.prac16;
import com.example.helloworld.prac16.prac16_1;

public class prac18 extends AppCompatActivity {

    ListView l;
    String[] a = {
            "BMW Next100",
            "Amaze",
            "Lamborghini Huracan Facelift",
            "Tarzan",
            "Rolls Royce"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prac18);
        l = findViewById(R.id.prac18_list);

        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, R.layout.prac16_2, R.id.prac16_txt, a);
        l.setAdapter(aa);

        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(prac18.this, prac18_1.class)
                        .putExtra("num", a[i]));
            }
        });
    }
}
