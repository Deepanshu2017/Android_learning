package com.example.deepanshu.listfragment;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.Button;

public class InputFragment extends Fragment {

    private static EditText text_input;

    ProvideInput activityCommander;
    interface ProvideInput {
        void setInputToList(String text);
    }

    @TargetApi(23)
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            activityCommander = (ProvideInput) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(e.toString());
        }
    }

    @SuppressWarnings("deprication")
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            activityCommander = (ProvideInput) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(e.toString());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.input_fragment, container, false);
        text_input = (EditText) view.findViewById(R.id.text_input);
        Button button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityCommander.setInputToList(text_input.getText().toString());
            }
        });
        return view;
    }
}