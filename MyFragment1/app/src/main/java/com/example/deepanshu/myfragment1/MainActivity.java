package com.example.deepanshu.myfragment1;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_left = (Button) findViewById(R.id.left_fragment);
        Button button_right = (Button) findViewById(R.id.right_fragment);

        button_left.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment left = new Left_Fragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, left);
                fragmentTransaction.commit();
            }
        });

        button_right.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment right = new Right_Fragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, right);
                fragmentTransaction.commit();
            }
        });

    }
}
