package com.example.helloworld.prac21;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.helloworld.R;

public class prac21 extends AppCompatActivity {

    boolean b = true;
    ImageButton ig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prac21);
        ig = findViewById(R.id.prac21_ig);

        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (b) {
                    b = false;
                    ig.setImageResource(R.drawable.icon_car_gray);
                } else {
                    b = true;
                    ig.setImageResource(R.drawable.ic_shopping_cart);
                }
            }
        });

        ig.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(prac21.this, "Image onLongClick", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
