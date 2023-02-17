package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class Practicaltest extends AppCompatActivity {

    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practicaltest);

        t=(TextView) findViewById(R.id.textview_test);
        t.setText("onCreate()\n");
        Log.d("Invoked","onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        t.setText(t.getText()+"onStart()\n");
        Log.d("Invoked","onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        t.setText(t.getText()+"onResume()\n");
        Log.d("Invoked","onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        t.setText(t.getText()+"onPause()\n");
        Log.d("Invoked","onPause()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        t.setText(t.getText()+"onRestart()\n");
        Log.d("Invoked","onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestr", Toast.LENGTH_SHORT).show();
        Log.d("Invoked","onDestroy()");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        t.setText(t.getText()+"onBackPressed()\n");
        Log.d("Invoked","onBackPressed()");
    }
}
