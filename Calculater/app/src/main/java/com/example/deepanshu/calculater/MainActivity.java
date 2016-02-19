package com.example.deepanshu.calculater;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static double res = 0.0;
    public static double multemp = 1.1;
    public static boolean divtemp = true;
    public static String operator = "";

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

        Button button_zero = (Button)findViewById(R.id.zero);
        button_zero.setOnClickListener(new MyListener());

        Button button_one = (Button)findViewById(R.id.one);
        button_one.setOnClickListener(new MyListener());

        Button button_two = (Button)findViewById(R.id.two);
        button_two.setOnClickListener(new MyListener());

        Button button_three = (Button)findViewById(R.id.three);
        button_three.setOnClickListener(new MyListener());

        Button button_four = (Button)findViewById(R.id.four);
        button_four.setOnClickListener(new MyListener());

        Button button_five = (Button)findViewById(R.id.five);
        button_five.setOnClickListener(new MyListener());

        Button button_six = (Button)findViewById(R.id.six);
        button_six.setOnClickListener(new MyListener());

        Button button_seven = (Button)findViewById(R.id.seven);
        button_seven.setOnClickListener(new MyListener());

        Button button_eight = (Button)findViewById(R.id.eight);
        button_eight.setOnClickListener(new MyListener());

        Button button_nine = (Button)findViewById(R.id.nine);
        button_nine.setOnClickListener(new MyListener());

        Button button_dot = (Button)findViewById(R.id.dot);
        button_dot.setOnClickListener(new MyListener());

        Button button_equal = (Button)findViewById(R.id.equal);
        button_equal.setOnClickListener(new MyListener());

        Button button_square = (Button)findViewById(R.id.square);
        button_square.setOnClickListener(new MyListener());

        Button button_cube = (Button)findViewById(R.id.cube);
        button_cube.setOnClickListener(new MyListener());

        Button button_squareroot = (Button)findViewById(R.id.squareroot);
        button_squareroot.setOnClickListener(new MyListener());

        Button button_divide = (Button)findViewById(R.id.divide);
        button_divide.setOnClickListener(new MyListener());

        Button button_clear = (Button)findViewById(R.id.clr);
        button_clear.setOnClickListener(new MyListener());

        Button button_plus = (Button)findViewById(R.id.plus);
        button_plus.setOnClickListener(new MyListener());

        Button button_minus = (Button)findViewById(R.id.minus);
        button_minus.setOnClickListener(new MyListener());

        Button button_multiply = (Button)findViewById(R.id.multiply);
        button_multiply.setOnClickListener(new MyListener());

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

class MyListener implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        int id = v.getId();
        TextView input = (TextView)((AppCompatActivity)v.getContext()).findViewById(R.id.input);
        if (id == R.id.zero) {
            input.setText(input.getText().toString() + "0");
        } else if (id == R.id.one) {
            input.setText(input.getText().toString() + "1");
        } else if (id == R.id.two) {
            input.setText(input.getText().toString() + "2");
        } else if (id == R.id.three) {
            input.setText(input.getText().toString() + "3");
        }  else if (id == R.id.four) {
            input.setText(input.getText().toString() + "4");
        }  else if (id == R.id.five) {
            input.setText(input.getText().toString() + "5");
        } else if (id == R.id.six) {
            input.setText(input.getText().toString() + "6");
        } else if (id == R.id.seven) {
            input.setText(input.getText().toString() + "7");
        } else if (id == R.id.eight) {
            input.setText(input.getText().toString() + "8");
        } else if (id == R.id.nine) {
            input.setText(input.getText().toString() + "9");
        } else if (id == R.id.dot) {
            input.setText(input.getText().toString() + ".");
        } else if (id == R.id.plus) {
            String value = input.getText().toString();
            TextView output = (TextView)((AppCompatActivity)v.getContext()).findViewById(R.id.output);
            if(value.equals("")) {
                Toast.makeText(v.getContext(), "Please input some value", Toast.LENGTH_SHORT).show();
            } else {
                try {
                    MainActivity.res = MainActivity.res + Double.parseDouble(value);
                    input.setText("");
                    output.setText(String.valueOf(MainActivity.res));
                    MainActivity.operator = "+";
                } catch (NumberFormatException e) {
                    Toast.makeText(v.getContext(), "Numbers not in correct format", Toast.LENGTH_SHORT).show();
                }
            }
        } else if (id == R.id.minus) {
            String value = input.getText().toString();
            TextView output = (TextView)((AppCompatActivity)v.getContext()).findViewById(R.id.output);
            if(value.equals("")) {
                Toast.makeText(v.getContext(), "Please input some value", Toast.LENGTH_SHORT).show();
            } else {
                try {
                    MainActivity.res = MainActivity.res - Double.parseDouble(value);
                    input.setText("");
                    output.setText(String.valueOf(MainActivity.res));
                    MainActivity.operator = "-";
                } catch (NumberFormatException e) {
                    Toast.makeText(v.getContext(), "Numbers not in correct format", Toast.LENGTH_SHORT).show();
                }
            }
        }  else if (id == R.id.multiply) {
            String value = input.getText().toString();
            TextView output = (TextView)((AppCompatActivity)v.getContext()).findViewById(R.id.output);
            if(value.equals("")) {
                Toast.makeText(v.getContext(), "Please input some value", Toast.LENGTH_SHORT).show();
            } else {
                try {
                    MainActivity.res = MainActivity.multemp * Double.parseDouble(value);
                    MainActivity.multemp = MainActivity.res;
                    input.setText("");
                    output.setText(String.valueOf(MainActivity.res));
                    MainActivity.operator = "*";
                } catch (NumberFormatException e) {
                    Toast.makeText(v.getContext(), "Numbers not in correct format", Toast.LENGTH_SHORT).show();
                }
            }
        }  else if (id == R.id.divide) {
            String value = input.getText().toString();
            TextView output = (TextView)((AppCompatActivity)v.getContext()).findViewById(R.id.output);
            if(value.equals("")) {
                Toast.makeText(v.getContext(), "Please input some value", Toast.LENGTH_SHORT).show();
            } else {
                try {
                    if (MainActivity.divtemp) {
                        MainActivity.res = Double.parseDouble(value);
                        MainActivity.divtemp = false;
                    } else {
                        MainActivity.res = MainActivity.res / Double.parseDouble(value);
                    }
                    output.setText(String.valueOf(MainActivity.res));
                    input.setText("");
                    MainActivity.operator = "/";
                } catch (NumberFormatException e) {
                    Toast.makeText(v.getContext(), "Numbers not in correct format", Toast.LENGTH_SHORT).show();
                } catch (ArithmeticException e) {
                    Toast.makeText(v.getContext(), "Divide by 0 is not allowed", Toast.LENGTH_SHORT).show();
                }
            }
        }  else if (id == R.id.square) {
            String value = input.getText().toString();
            TextView output = (TextView)((AppCompatActivity)v.getContext()).findViewById(R.id.output);
            if(value.equals("")) {
                Toast.makeText(v.getContext(), "Please input some value", Toast.LENGTH_SHORT).show();
            } else {
                try {
                    MainActivity.res = Double.parseDouble(value);
                    output.setText(String.valueOf(MainActivity.res * MainActivity.res));
                    MainActivity.operator = "s";
                    input.setText("");
                } catch (NumberFormatException e) {
                    Toast.makeText(v.getContext(), "Numbers not in correct format", Toast.LENGTH_SHORT).show();
                }
            }
        }  else if (id == R.id.cube) {
            String value = input.getText().toString();
            TextView output = (TextView)((AppCompatActivity)v.getContext()).findViewById(R.id.output);
            if(value.equals("")) {
                Toast.makeText(v.getContext(), "Please input some value", Toast.LENGTH_SHORT).show();
            } else {
                try {
                    MainActivity.res = Double.parseDouble(value);
                    output.setText(String.valueOf(MainActivity.res * MainActivity.res * MainActivity.res));
                    MainActivity.operator = "c";
                    input.setText("");
                } catch (NumberFormatException e) {
                    Toast.makeText(v.getContext(), "Numbers not in correct format", Toast.LENGTH_SHORT).show();
                }
            }
        }  else if (id == R.id.squareroot) {
            String value = input.getText().toString();
            TextView output = (TextView)((AppCompatActivity)v.getContext()).findViewById(R.id.output);
            if(value.equals("")) {
                Toast.makeText(v.getContext(), "Please input some value", Toast.LENGTH_SHORT).show();
            } else {
                try {
                    MainActivity.res = Double.parseDouble(value);
                    output.setText(String.valueOf(Math.sqrt(MainActivity.res)));
                    MainActivity.operator = "sq";
                    input.setText("");
                } catch (NumberFormatException e) {
                    Toast.makeText(v.getContext(), "Numbers not in correct format", Toast.LENGTH_SHORT).show();
                } catch (ArithmeticException e) {
                    Toast.makeText(v.getContext(), "Cannot take square-root of negative number", Toast.LENGTH_SHORT).show();
                }
            }
        } else if (id == R.id.equal) {
            String value = input.getText().toString();
            TextView output = (TextView)((AppCompatActivity)v.getContext()).findViewById(R.id.output);
            if(value.equals("")) {
                input.setText(output.getText().toString());
            } else {
                try {
                    switch (MainActivity.operator) {
                        case "+":
                            MainActivity.res = MainActivity.res + Double.parseDouble(value);
                            break;
                        case "-":
                            MainActivity.res = MainActivity.res - Double.parseDouble(value);
                            break;
                        case "*":
                            MainActivity.res = MainActivity.res * Double.parseDouble(value);
                            break;
                        case "/":
                            MainActivity.res = MainActivity.res / Double.parseDouble(value);
                            break;
                        default:
                            MainActivity.res = Double.parseDouble(value);
                            break;
                    }
                    output.setText("");
                    input.setText(String.valueOf(MainActivity.res));
                    MainActivity.res = 0.0;
                    MainActivity.divtemp = true;
                    MainActivity.operator = "";
                    MainActivity.multemp = 1.0;
                } catch (NumberFormatException e) {
                    Toast.makeText(v.getContext(), "Numbers not in correct format", Toast.LENGTH_SHORT).show();
                } catch (ArithmeticException e) {
                    Toast.makeText(v.getContext(), "Cannot divide by zero", Toast.LENGTH_SHORT).show();
                }
            }
        } else {
            input.setText("");
            ((TextView)((AppCompatActivity)v.getContext()).findViewById(R.id.output)).setText("");
            MainActivity.res = 0.0;
            MainActivity.divtemp = true;
            MainActivity.operator = "";
            MainActivity.multemp = 1.0;
        }
    }
}