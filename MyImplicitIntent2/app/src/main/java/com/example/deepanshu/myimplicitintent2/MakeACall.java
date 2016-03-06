package com.example.deepanshu.myimplicitintent2;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MakeACall extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        GridView gridView = new GridView(this);
        gridView.setId(1);
        gridView.setNumColumns(3);
        textView = new TextView(this);
        textView.setId(2);
        textView.setWidth(700);
        textView.setHint("Enter number");
        textView.setTextSize(26);

        RelativeLayout.LayoutParams textViewContainer = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        RelativeLayout.LayoutParams dialer = new RelativeLayout.LayoutParams(
                700, 600
        );

        textViewContainer.addRule(RelativeLayout.ABOVE, gridView.getId());
        textViewContainer.addRule(RelativeLayout.CENTER_HORIZONTAL);
        textView.setLayoutParams(textViewContainer);

        dialer.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        dialer.addRule(RelativeLayout.CENTER_HORIZONTAL);
        gridView.setLayoutParams(dialer);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1"); arrayList.add("2"); arrayList.add("3");
        arrayList.add("4"); arrayList.add("5"); arrayList.add("6");
        arrayList.add("7"); arrayList.add("8"); arrayList.add("9");
        arrayList.add("*"); arrayList.add("0 +"); arrayList.add("#");
        arrayList.add(""); arrayList.add("call"); arrayList.add("clr");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayList);
        gridView.setAdapter(arrayAdapter);

        gridView.setOnItemClickListener(this);
        gridView.setLongClickable(true);
        gridView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                String value = (parent.getAdapter().getItem(position)).toString();
                if (value.equalsIgnoreCase("0 +")) {
                    textView.setText((textView.getText()).toString() + "+");
                }
                return true;
            }
        });

        relativeLayout.addView(textView);
        relativeLayout.addView(gridView);
        setContentView(relativeLayout);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String value = (parent.getAdapter().getItem(position)).toString();
        if (value.equalsIgnoreCase("call")) {
            Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + (textView.getText()).toString()));
            if (ContextCompat.checkSelfPermission(view.getContext(), Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(view.getContext(), "Calling", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            } else {
                Toast.makeText(view.getContext(), "Please grant permission to make call", Toast.LENGTH_LONG).show();
            }
        } else if (value.equalsIgnoreCase("clr")) {
            textView.setText("");
        } else if (value.equalsIgnoreCase("0 +")) {
            textView.setText((textView.getText()).toString() + "0");
        }
        else {
            textView.setText((textView.getText()).toString() + value);
        }
    }
}