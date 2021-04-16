package com.example.myjnidemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import my.NkdJniTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NkdJniTest test = new NkdJniTest();
        String s = test.myTest();
        Log.i("c++ demo","----" + s);
    }
}