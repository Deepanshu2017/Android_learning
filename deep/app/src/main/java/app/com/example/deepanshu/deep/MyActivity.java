package app.com.example.deepanshu.deep;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MyActivity extends Activity implements View.OnClickListener {

    Button button;
    Button button_2;
    TextView textView;
    Intent i;
    Intent i_2;

    @Override
    protected void onCreate(Bundle b1) {
        super.onCreate(b1);
        setContentView(R.layout.activity_my);
        textView = (TextView)findViewById(R.id.text);
        i = new Intent(MyActivity.this, MyActivity2.class);
        i_2 = new Intent(MyActivity.this, MyActivity3.class);
        button.setOnClickListener(new MyActivity());
        button_2.setOnClickListener(new MyActivity());
        Toast.makeText(this,"vsdf",Toast.LENGTH_LONG).show();
    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if(v.findViewById(R.id.button) == button)
            startActivity(i);
        else
            startActivity(i_2);
    }
}
