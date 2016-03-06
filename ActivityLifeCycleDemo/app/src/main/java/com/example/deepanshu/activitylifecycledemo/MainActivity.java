package com.example.deepanshu.activitylifecycledemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public final static String TAG = "This is custom tag";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "in onCreate");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG, "in onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG, "in onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG, "in onPause");
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Log.e(TAG, "in onSaveInstanceState");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(TAG, "in onStop");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.e(TAG, "in onRestart");
    }

    @Override
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        Log.e(TAG, "in onRestoreInstanceState");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "in onDestroy");
    }
}