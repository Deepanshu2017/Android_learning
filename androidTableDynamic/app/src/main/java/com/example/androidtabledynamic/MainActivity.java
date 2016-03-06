package com.example.androidtabledynamic;

import android.os.Bundle;
import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends Activity {
	TableLayout TabLayout;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TabLayout=(TableLayout) findViewById(R.id.MyTab);
		
		
		//TabLayout.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT));
        TabLayout.setStretchAllColumns(true);
 
      
        //Create the first row and add two text views
        TableRow row1 = new TableRow(this);
        
        TextView textv1 = new TextView(this);
        textv1.setTextColor(Color.DKGRAY);
        textv1.setTextSize(TypedValue.COMPLEX_UNIT_PT, 8);
        textv1.setTypeface(Typeface.SERIF, Typeface.BOLD);
        textv1.setGravity(Gravity.LEFT);
        textv1.setText("Test1");
        
        TextView textv2 = new TextView(this);
        textv2.setText("Test2");
        textv2.setGravity(android.view.Gravity.RIGHT);
        
        row1.addView(textv1);
        row1.addView(textv2);
        TabLayout.addView(row1);
 
        //Create the second row and add two text views
        TableRow row2 = new TableRow(this);
        TextView text3 = new TextView(this);
        text3.setText("Test3");
        TextView text4 = new TextView(this);
        text4.setText("Test4");
        text4.setGravity(android.view.Gravity.RIGHT);
        row2.addView(text3);
        row2.addView(text4);
        TabLayout.addView(row2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
