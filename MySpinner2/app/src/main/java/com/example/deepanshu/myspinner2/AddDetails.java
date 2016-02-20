package com.example.deepanshu.myspinner2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_details);
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
        final EditText name = (EditText)findViewById(R.id.name);
        final EditText college = (EditText)findViewById(R.id.college);
        final EditText contact = (EditText)findViewById(R.id.contact);
        final EditText address = (EditText)findViewById(R.id.address);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user = new User(name.getText().toString(), college.getText().toString(), contact.getText().toString(), address.getText().toString());
                Intent intent = getIntent();
                intent.putExtra("details", user);
                setResult(AppCompatActivity.RESULT_OK, intent);
                finish();
            }
        });
    }

}
