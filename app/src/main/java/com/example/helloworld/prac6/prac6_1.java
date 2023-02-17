package com.example.helloworld.prac6;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.helloworld.R;

public class prac6_1 extends AppCompatActivity {
TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prac6_1);
        t1=(TextView)findViewById(R.id.tx_prac6);
        t1.setText(t1.getText().toString()+"\n onCreate() ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        t1.setText(t1.getText().toString()+"\n onStart() ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        t1.setText(t1.getText().toString()+"\n onPause() ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        t1.setText(t1.getText().toString()+"\n onRestart() invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        t1.setText(t1.getText().toString()+"\n onResume() invoked ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        t1.setText(t1.getText().toString()+"\n onStop() invoked ");
    }
}
