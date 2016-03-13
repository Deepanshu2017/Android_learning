package com.example.deepanshu.myfragment3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements TopFragment.TopSectionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void setTextOnBottomFragment(String text1, String text2) {
        BottomFragment mBottomFragment = (BottomFragment) getFragmentManager().findFragmentById(R.id.bottom_fragment);
        mBottomFragment.setText(text1, text2);
    }
}
