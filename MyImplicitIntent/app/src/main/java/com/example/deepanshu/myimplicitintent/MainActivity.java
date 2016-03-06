package com.example.deepanshu.myimplicitintent;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        Button button_1 = new Button(this);
        Button button_2 = new Button(this);
        Button button_3 = new Button(this);
        button_1.setId(1);
        button_1.setText("Internet");
        button_2.setId(2);
        button_2.setText("Telephone");
        button_3.setId(3);
        button_3.setText("Text sharing");

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        RelativeLayout.LayoutParams layoutParams_2 = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        RelativeLayout.LayoutParams layoutParams_3 = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        layoutParams_3.addRule(RelativeLayout.ABOVE, button_2.getId());
        layoutParams_3.addRule(RelativeLayout.CENTER_HORIZONTAL);
        layoutParams_2.addRule(RelativeLayout.ABOVE, button_1.getId());
        layoutParams_2.addRule(RelativeLayout.CENTER_HORIZONTAL);
        layoutParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        layoutParams.addRule(RelativeLayout.CENTER_VERTICAL);
        button_1.setLayoutParams(layoutParams);
        button_2.setLayoutParams(layoutParams_2);
        button_3.setLayoutParams(layoutParams_3);

        button_1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"));
                Toast.makeText(v.getContext(), "starting activity", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        button_2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:9887631011"));
                Toast.makeText(v.getContext(), "Starting telephone", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        button_3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "I am standing on the moon right now");
                Intent choose = Intent.createChooser(intent, "Choose action");
                PackageManager packageManager = getPackageManager();
                List<ResolveInfo> info = packageManager.queryIntentActivities(choose, 0);
                if (info.size() > 0)
                    startActivity(choose);
                else
                    Toast.makeText(v.getContext(), "cannot find any suitable app", Toast.LENGTH_SHORT).show();
            }
        });

        relativeLayout.addView(button_1);
        relativeLayout.addView(button_2);
        relativeLayout.addView(button_3);
        setContentView(relativeLayout);
    }
}
