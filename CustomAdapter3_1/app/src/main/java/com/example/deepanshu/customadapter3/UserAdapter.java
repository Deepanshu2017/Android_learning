package com.example.deepanshu.customadapter3;

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
        //call ArrayAdapter's constructor
        //context, layout, collection
        super(context, 0, (ArrayList<User>)arrayList);
    }

    @Override
    public View getView(int position, View obj, ViewGroup parent) {
        User user = getItem(position);
        if(obj == null) {
            obj = LayoutInflater.from(getContext()).inflate(R.layout.user_layout, parent, false);
        }
        TextView name = (TextView) obj.findViewById(R.id.user_name);
        TextView adress = (TextView) obj.findViewById(R.id.user_address);
        name.setText(user.getUserName());
        adress.setText(user.getUserAddress());
        return obj;
    }
}