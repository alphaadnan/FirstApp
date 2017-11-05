package com.example.adnanhusain.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et;
    TextView tv;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.et);
        tv = (TextView) findViewById(R.id.tv);
        bt = (Button) findViewById(R.id.btn);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text = et.getText().toString();
                tv.setText(text);

            }
        });


    }
}
