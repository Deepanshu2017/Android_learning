package com.example.deepanshu.listfragment;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ListFragment;
import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

public class MenuFragment extends ListFragment {
    final ArrayList<String> arrayList = new ArrayList<>();
    ArrayAdapter<String> adapter;
    TalkToFragment activityCommander;

    interface TalkToFragment {
        void changeTextOfTextView(String text);
    }

    @TargetApi(23)
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            activityCommander = (TalkToFragment) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(e.toString());
        }
    }

    @SuppressWarnings("deprication")
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            activityCommander = (TalkToFragment) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(e.toString());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.menu_fragment, container, false);
        arrayList.add("Foo"); arrayList.add("Bar"); arrayList.add("Baz");
        adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, arrayList);
        setListAdapter(adapter);
        return view;
    }

    @Override
    public void onListItemClick(ListView listView, View view, int position, long id) {
        Snackbar.make(view, listView.getItemAtPosition(position).toString(), Snackbar.LENGTH_SHORT).setAction("Action", null).show();
        activityCommander.changeTextOfTextView(listView.getItemAtPosition(position).toString());
    }


    public void addIntoList(String text) {
        adapter.add(text);
    }
}