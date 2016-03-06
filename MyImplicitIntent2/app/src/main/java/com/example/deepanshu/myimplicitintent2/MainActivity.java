package com.example.deepanshu.myimplicitintent2;

import android.Manifest;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "CUSTOM TAG";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        Button button = new Button(this); button.setText("Internet"); button.setId(1);
        Button button1 = new Button(this); button1.setText("Mail"); button1.setId(2);
        Button button2 = new Button(this); button2.setText("Telephone"); button2.setId(3);

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        RelativeLayout.LayoutParams layoutParams1 = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        layoutParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        layoutParams.addRule(RelativeLayout.CENTER_VERTICAL);

        layoutParams1.addRule(RelativeLayout.BELOW, button.getId());
        layoutParams.addRule(RelativeLayout.CENTER_HORIZONTAL);

        layoutParams2.addRule(RelativeLayout.ABOVE, button.getId());
        layoutParams.addRule(RelativeLayout.CENTER_HORIZONTAL);

        button.setLayoutParams(layoutParams);
        button1.setLayoutParams(layoutParams1);
        button2.setLayoutParams(layoutParams2);

        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"));
                try {
                    startActivity(intent);
                } catch (Exception e) {
                    Log.e(TAG, e.toString());
                }
            }
        });

        button1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "I am standing on the moon");
                Intent choose = Intent.createChooser(intent, "Choose desired app");
                PackageManager packageManager = getPackageManager();
                List<ResolveInfo> apps = packageManager.queryIntentActivities(choose, 0);
                if (apps.size() > 0)
                    startActivity(choose);
                else
                    Toast.makeText(v.getContext(), "No app is avaliable", Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:9887631011"));
//                if(ContextCompat.checkSelfPermission(v.getContext(), Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED)
//                    startActivity(intent);
//                else
//                    Toast.makeText(v.getContext(), "Permission is not granted", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(v.getContext(), MakeACall.class);
                startActivity(intent);
            }
        });

        relativeLayout.addView(button);
        relativeLayout.addView(button1);
        relativeLayout.addView(button2);

        setContentView(relativeLayout);
    }
}