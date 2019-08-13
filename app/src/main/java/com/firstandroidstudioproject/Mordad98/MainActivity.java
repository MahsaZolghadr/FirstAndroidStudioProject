package com.firstandroidstudioproject.Mordad98;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Log.d("MYTAG","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("MYTAG","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("MYTAG","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("MYTAG","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("MYTAG","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("MYTAG","onDestroy");
    }
}
