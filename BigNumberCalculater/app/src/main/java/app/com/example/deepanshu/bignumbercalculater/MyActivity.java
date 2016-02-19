package app.com.example.deepanshu.bignumbercalculater;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.math.BigInteger;


public class MyActivity extends Activity {

    EditText input1, input2;
    TextView result;
    Button add, sub, mul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        input1 = (EditText)findViewById(R.id.editText);
        input2 = (EditText)findViewById(R.id.editText2);
        add = (Button)findViewById(R.id.button);
        sub = (Button)findViewById(R.id.button2);
        mul = (Button)findViewById(R.id.button3);
        result = (TextView)findViewById(R.id.textView3);
    }

    public void foo(View v) {
        try {
            BigInteger number1 = new BigInteger(input1.getText().toString());
            BigInteger number2 = new BigInteger(input2.getText().toString());
            int id = v.getId();
            if (id == R.id.button) {
                result.setText(number1.add(number2).toString());
            } else if (id == R.id.button2) {
                result.setText(number1.subtract(number2).toString());
            } else {
                result.setText(number1.multiply(number2).toString());
            }
        } catch (NumberFormatException e) {
            result.setText(new String("Please enter number only"));
        } catch (Exception e) {
            result.setText(new String("Unknown exception found"));
        }
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
}
