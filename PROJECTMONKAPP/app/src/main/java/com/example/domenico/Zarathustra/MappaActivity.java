package com.example.mappa3;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MappaActivity extends AppCompatActivity implements View.OnClickListener {
    int size = 10;
    public Button click0,click1,click2,click3,click4,click5,click6,click7,click8;
    public Context c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mappa_activity);
        click0 = findViewById (R.id.button0);
        click1 = findViewById (R.id.button1);
        click2 = findViewById (R.id.button2);
        click3 = findViewById (R.id.button3);
        click4 = findViewById (R.id.button4);
        click5 = findViewById (R.id.button5);
        click6 = findViewById (R.id.button6);
        click7 = findViewById (R.id.button7);
        click8 = findViewById (R.id.button8);
        click0.setOnClickListener (this);
        click1.setOnClickListener (this);
        click2.setOnClickListener (this);
        click3.setOnClickListener (this);
        click4.setOnClickListener (this);
        click5.setOnClickListener (this);
        click6.setOnClickListener (this);
        click7.setOnClickListener (this);
        click8.setOnClickListener (this);

    }

    @Override
    public void onClick(View v) {
        Button b = (Button) v;
        if(b.getText().toString().equals("L")) {
            b.setText ("M");
        } else
            b.setText ("L");
    }
}
