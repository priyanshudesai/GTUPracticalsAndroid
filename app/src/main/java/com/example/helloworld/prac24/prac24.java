package com.example.helloworld.prac24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.helloworld.R;
import com.example.helloworld.prac18.prac18;
import com.example.helloworld.prac18.prac18_1;

public class prac24 extends AppCompatActivity {

    ListView l;
    String[] a = {
            "The Crew 2 ",
            "Watch Dogs Legion",
            "GTA 5",
            "Apex Legends",
            "Counter Strike"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prac24);
        l = findViewById(R.id.prac24_list);

        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, R.layout.prac16_2, R.id.prac16_txt, a);
        l.setAdapter(aa);

        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(prac24.this, a[i], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
