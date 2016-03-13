package com.example.deepanshu.myfragment3;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomFragment extends Fragment {

    private static TextView toptext;
    private static TextView bottomtext;

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_fragment, container, false);
        toptext = (TextView) view.findViewById(R.id.output_text_top);
        bottomtext = (TextView) view.findViewById(R.id.output_text_bottom);
        return view;
    }

    public void setText(String toptext, String bottomtext) {
        this.toptext.setText(toptext);
        this.bottomtext.setText(bottomtext);
    }
}