package com.example.deepanshu.myfragment2;

import android.app.Fragment;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;

public class RightFragment extends Fragment {
    public static TextView show_text;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.right_fragment, container, false);
        show_text = (TextView) view.findViewById(R.id.show_text);
        return view;
    }
}