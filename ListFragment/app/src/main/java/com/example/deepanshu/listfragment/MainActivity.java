package com.example.deepanshu.listfragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MenuFragment.TalkToFragment, InputFragment.ProvideInput {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.top, new MenuFragment());
        fragmentTransaction.add(R.id.bottom, new TextFragment());
        fragmentTransaction.add(R.id.middle, new InputFragment());
        fragmentTransaction.commit();
    }

    @Override
    public void changeTextOfTextView(String text) {
        TextFragment textFragment = (TextFragment) getFragmentManager().findFragmentById(R.id.bottom);
        textFragment.setText(text);
    }

    @Override
    public void setInputToList(String text) {
        MenuFragment menuFragment = (MenuFragment) getFragmentManager().findFragmentById(R.id.top);
        menuFragment.addIntoList(text);
    }
}