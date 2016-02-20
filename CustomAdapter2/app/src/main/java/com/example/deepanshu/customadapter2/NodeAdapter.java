package com.example.deepanshu.customadapter2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NodeAdapter extends ArrayAdapter<Node> {
    public NodeAdapter(Context context, ArrayList<Node> arrayList) {
        super(context, 0, arrayList);
    }

    @Override
    public View getView(int position, View obj, ViewGroup parent) {

        Node node = getItem(position);
        if(obj == null) {
            obj = LayoutInflater.from(getContext()).inflate(R.layout.node_layout, parent, false);
        }
        TextView name = (TextView) obj.findViewById(R.id.name);
        TextView value = (TextView) obj.findViewById(R.id.value);
        name.setText(node.name);
        value.setText(String.valueOf(node.value));
        return obj;
    }
}