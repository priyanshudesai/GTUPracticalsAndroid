package com.example.helloworld.prac6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.helloworld.R;

public class prac6_2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prac6_2);
        Log.d("call methods","Invoked onCreate()");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("call methods","Invoked onStart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("call methods","Invoked onPause()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("call methods","Invoked onDestroy()");
        //Toast.makeText(this, "onDestoy()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("call methods","Invoked onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("call methods","Invoked onResume()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("call methods","Invoked onStop()");
    }
}
