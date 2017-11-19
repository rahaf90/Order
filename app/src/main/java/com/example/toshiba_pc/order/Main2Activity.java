package com.example.toshiba_pc.order;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        TextView text = (TextView) findViewById(R.id.toto);

        text.setText(getIntent().getExtras().getString("location"));

        TextView t=(TextView)findViewById(R.id.t11);
        TextView t1=(TextView)findViewById(R.id.t12);
        t.setText(getIntent().getExtras().getString("check"));
        t1.setText(getIntent().getExtras().getString("check2"));

       TextView tete=(TextView)findViewById(R.id.t22);
        TextView tete1=(TextView)findViewById(R.id.t23);
        TextView tete3=(TextView)findViewById(R.id.t24);

        tete.setText(getIntent().getExtras().getString("but1"));

        tete1.setText(getIntent().getStringExtra("but2"));

        tete3.setText(getIntent().getStringExtra("but3"));


    }

}
