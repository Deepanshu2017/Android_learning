package com.example.deepanshu.myfragment2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class LeftFragment extends Fragment {
    public static EditText input_text;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.left_fragment, container, false);
        input_text = (EditText) view.findViewById(R.id.input_text);
        return view;
    }
}