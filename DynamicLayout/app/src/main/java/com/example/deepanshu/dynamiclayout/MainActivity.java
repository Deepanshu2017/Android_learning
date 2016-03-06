package com.example.deepanshu.dynamiclayout;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        //Widgets
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setBackgroundColor(Color.RED);
        TableLayout tableLayout = new TableLayout(this);
        tableLayout.setBackgroundColor(Color.GREEN);
        TableRow tableRow = new TableRow(this);
        tableRow.setBackgroundColor(Color.DKGRAY);
        TextView textView = new TextView(this);
        textView.setText("Hello World");
        textView.setTextSize(30.0f);

        //Containers
        RelativeLayout.LayoutParams relative_container = new RelativeLayout.LayoutParams(
//                RelativeLayout.LayoutParams.WRAP_CONTENT,
//                RelativeLayout.LayoutParams.WRAP_CONTENT
                500, 500
        );
        TableLayout.LayoutParams table_container = new TableLayout.LayoutParams(
//                TableLayout.LayoutParams.WRAP_CONTENT,
//                TableLayout.LayoutParams.WRAP_CONTENT
                400, 400
        );
        TableRow.LayoutParams row_container = new TableRow.LayoutParams(
//                TableRow.LayoutParams.WRAP_CONTENT,
//                TableRow.LayoutParams.WRAP_CONTENT
                340, 340
        );

        //linking
        tableRow.setLayoutParams(row_container);
        tableRow.addView(textView);
        tableLayout.setLayoutParams(table_container);
        tableLayout.addView(tableRow);
        relativeLayout.setLayoutParams(relative_container);
        relativeLayout.addView(tableLayout);
        setContentView(relativeLayout);
    }
}
