package com.example.deepanshu.myfragment4;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button fragment_1 = (Button) findViewById(R.id.fragment_1);
        final Button fragment_2 = (Button) findViewById(R.id.fragment_2);
        final FragmentManager mFragmentManager = getFragmentManager();

        if (fragment_1 != null) {
            fragment_1.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View view) {
                    changeFragment(view, mFragmentManager);
                }
            });
        } else {
            throw new NullPointerException("Exception at fragment_1");
        }

        if (fragment_2 != null) {
            fragment_2.setOnClickListener(new Button.OnClickListener() {
                @Override
                public void onClick(View view) {
                    changeFragment(view, mFragmentManager);
                }
            });
        } else {
            throw new NullPointerException("Exception at fragment_2");Messi
        }
    }

    public boolean changeFragment(View view, FragmentManager mFragmentManager) {
        FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
        switch (view.getId()) {
            case R.id.fragment_1:
                mFragmentTransaction.replace(R.id.fragment_container, new FragmentTwo());
                mFragmentTransaction.addToBackStack(null);
                mFragmentTransaction.commit();
                return true;
            case R.id.fragment_2:
                mFragmentTransaction.replace(R.id.fragment_container, new FragmentOne());
                mFragmentTransaction.addToBackStack(null);
                mFragmentTransaction.commit();
                return true;
            default:
                return false;
        }
    }
}