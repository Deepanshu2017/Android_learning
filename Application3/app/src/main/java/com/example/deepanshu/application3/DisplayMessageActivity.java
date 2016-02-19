package com.example.deepanshu.application3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();
        String msg1 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_1);
        String msg2 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_2);
        TextView textView1 = (TextView)findViewById(R.id.textView);
        TextView textView2 = (TextView)findViewById(R.id.textView3);
        textView1.setText(msg1);
        textView2.setText(msg2);
        Button b = (Button)findViewById(R.id.button);

        //1.
        //b.setOnClickListener(new MyButtonListener(this));

        //2.
        b.setOnClickListener(new MyButtonListener());

        //3.
        /*
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(DisplayMessageActivity.this, MainActivity.class);
                finish();
                startActivity(intent1);
            }
        });
        */

    }
}

//1.
//class MyButtonListener implements View.OnClickListener {
//    public DisplayMessageActivity ref;
//    public MyButtonListener(DisplayMessageActivity ref) {
//        this.ref = ref;
//    }
//
//    @Override
//    public void onClick(View v) {
//        Intent intent = new Intent(ref, MainActivity.class);
//        ref.finish();
//        ref.startActivity(intent);
//    }
//}

//2.
class MyButtonListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(v.getContext(), MainActivity.class);
        ((Activity)v.getContext()).finish();
        v.getContext().startActivity(intent);
    }
}
