package com.example.deepanshu.customadapter3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class AddUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
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
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = ((EditText) findViewById(R.id.name)).getText().toString();
                String address = ((EditText) findViewById(R.id.address)).getText().toString();
                String contact = ((EditText) findViewById(R.id.contact)).getText().toString();
                String college = ((EditText) findViewById(R.id.college)).getText().toString();
                User user = new User(name, address);
                user.setCollege(college);
                user.setContact(contact);
//                MainActivity.adapter.add(user);
                Intent intent = new Intent(v.getContext(), MainActivity.class);
//                UserAdapter adapter = (UserAdapter)getIntent().getSerializableExtra("Adapter");
//                adapter.add(user);
                intent.putExtra("key", user);
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });
    }
}
