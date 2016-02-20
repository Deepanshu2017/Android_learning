package com.example.deepanshu.myspinner2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

public class UserAdapter extends ArrayAdapter<User> implements Serializable {
    public UserAdapter(Context context, Collection<User> arrayList) {
        super(context, 0, (ArrayList<User>)arrayList);
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        return CustomView(position, view, parent);
    }

    @Override
    public View getDropDownView(int position, View view, ViewGroup parent) {
        return CustomView(position, view, parent);
    }

    public View CustomView(int position, View view, ViewGroup parent) {
        User user = getItem(position);
        if(null == view) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.user_layout, parent, false);
        }
        TextView name = (TextView)view.findViewById(R.id.name);
        TextView college = (TextView)view.findViewById(R.id.college);
        name.setText(user.getName());
        college.setText(user.getCollege());
        return view;
    }
}