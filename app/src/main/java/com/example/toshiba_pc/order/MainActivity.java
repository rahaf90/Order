package com.example.toshiba_pc.order;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {
    EditText et;
    CheckBox ch1;
    CheckBox ch2;
    RadioGroup g;
    RadioButton r1;
    RadioButton r2;
    RadioButton r3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ch1 = (CheckBox) findViewById(R.id.checkBox1);
        ch2 = (CheckBox) findViewById(R.id.checkbox2);
        r1 = (RadioButton) findViewById(R.id.r1);
        r2 = (RadioButton) findViewById(R.id.r2);
        r3 = (RadioButton) findViewById(R.id.r3);
        et = (EditText) findViewById(R.id.editname);
        Button b = (Button) findViewById(R.id.mysendbutton);
        g = (RadioGroup) findViewById(R.id.group);

    }


    public void send(View v) {


        Intent i = new Intent(MainActivity.this, Main2Activity.class);
        i.setAction(Intent.ACTION_VIEW);
        String message = et.getText().toString();
        i.putExtra("location", message);


        if (ch1.isChecked()) {
            String m = ch1.getText().toString();
            i.putExtra("check", m);
        }
        if (ch2.isChecked()) {
            String m2 = ch2.getText().toString();
            i.putExtra("check2", m2);
        }

        if (r1.isChecked()) {

            String b1 = r1.getText().toString();
            i.putExtra("but1", b1);
        } else if (r2.isChecked()) {

            i.putExtra("but2", r2.getText().toString());

        } else if (r3.isChecked()) {
            i.putExtra("but3",r3.getText().toString());
        }

            startActivity(i);
        /*

        another way
        int idOfSelected = g.getCheckedRadioButtonId();

        switch(idOfSelected) {
            case R.id.r1:

                String b1 = r1.getText().toString();
                i.putExtra("but1", b1);
                break;

            case R.id.r2:
                i.putExtra("but2", r2.getText().toString());
                break;

            case R.id.r3:
                i.putExtra("but3",r3.getText().toString());
                 break;
                 */
        }

    }




