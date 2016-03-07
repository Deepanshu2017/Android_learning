package com.example.deepanshu.callbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Receiver extends BroadcastReceiver {

    public Receiver() {}

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Receiving call", Toast.LENGTH_LONG).show();
        MainActivity.textView.setText("Receiving call");
    }
}