package com.example.deepanshu.customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.deepanshu.customadaptor.R;

import java.util.ArrayList;

public class UserAdapter extends ArrayAdapter<User> {
    public UserAdapter(Context context, ArrayList<User> arrayList) {
        super(context, 0, arrayList);
    }

    @Override
    public View getView(int position, View obj, ViewGroup parent) {

        User user = getItem(position);
        if(obj == null) {
            obj = LayoutInflater.from(getContext()).inflate(R.layout.user_view, parent, false);
        }
        TextView first_name = (TextView) obj.findViewById(R.id.first_name);
        TextView last_name = (TextView) obj.findViewById(R.id.last_name);
        first_name.setText(user.first_name + " is ");
        last_name.setText(user.last_name);
        return obj;
    }
}