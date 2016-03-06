package com.example.deepanshu.mytablelayout;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        TableLayout tableLayout = (TableLayout) findViewById(R.id.table);
//        tableLayout.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT));
        tableLayout.setStretchAllColumns(true);
        TableRow tableRow_1 = new TableRow(this);
        TableRow tableRow_2 = new TableRow(this);
        TextView textView_1 = new TextView(this);
        TextView textView_2 = new TextView(this);
        TextView textView_3 = new TextView(this);
        TextView textView_4 = new TextView(this);
        textView_1.setText("Hello 1"); textView_1.setGravity(Gravity.LEFT); textView_1.setTextColor(Color.DKGRAY);
        textView_2.setText("Hello 2"); textView_2.setGravity(Gravity.RIGHT); textView_2.setTextColor(Color.DKGRAY);
        textView_3.setText("Hello 3"); textView_3.setGravity(Gravity.LEFT); textView_3.setTextColor(Color.DKGRAY);
        textView_4.setText("Hello 4"); textView_4.setGravity(Gravity.RIGHT); textView_4.setTextColor(Color.DKGRAY);
        tableRow_1.addView(textView_1); tableRow_1.addView(textView_2);
        tableRow_2.addView(textView_3); tableRow_2.addView(textView_4);
        tableLayout.addView(tableRow_1); tableLayout.addView(tableRow_2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
