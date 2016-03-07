package com.example.deepanshu.callbroadcastreceiver;

import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static TextView textView;
    public static Receiver mReceiver = new Receiver();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text);
        registerReceiver(mReceiver, new IntentFilter("android.intent.action.PHONE_STATE"));
    }
}
