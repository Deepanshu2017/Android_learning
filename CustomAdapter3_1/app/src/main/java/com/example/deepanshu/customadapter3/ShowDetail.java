package com.example.deepanshu.customadapter3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class ShowDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);
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

        User user = (User)getIntent().getSerializableExtra("detail");
        TextView name = (TextView) findViewById(R.id.name);
        TextView college = (TextView) findViewById(R.id.college);
        TextView contact = (TextView) findViewById(R.id.contact);
        TextView address = (TextView) findViewById(R.id.address);
        name.setText(user.getUserName());
        college.setText(user.getUserCollege());
        contact.setText(user.getUserContact());
        address.setText(user.getUserAddress());
    }
}
