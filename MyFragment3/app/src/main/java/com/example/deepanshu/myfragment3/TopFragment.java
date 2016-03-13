package com.example.deepanshu.myfragment3;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class TopFragment extends Fragment {

    private static EditText toptext;
    private static EditText bottomtext;

    TopSectionListener activityCommander;
    interface TopSectionListener {
        void setTextOnBottomFragment(String text1, String text2);
    }

    // stackoverflow <3 <3 <3
    // http://stackoverflow.com/questions/32077086/android-onattachcontext-not-called-for-api-23

    @TargetApi(23)
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            activityCommander = (TopSectionListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(e.toString());
        }
    }

    @SuppressWarnings("deprecation")
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.e("TAG", "I am here");
        try {
            activityCommander = (TopSectionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(e.toString());
        }
    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_fragment, container, false);
        toptext = (EditText) view.findViewById(R.id.top_text_input);
        bottomtext = (EditText) view.findViewById(R.id.bottom_text_input);
        final Button button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        buttonClicked();
                    }
                }
        );
        return view;
    }


    public void buttonClicked() {
        activityCommander.setTextOnBottomFragment(toptext.getText().toString(), bottomtext.getText().toString());
    }
}