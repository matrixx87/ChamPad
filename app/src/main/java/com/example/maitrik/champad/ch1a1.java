package com.example.maitrik.champad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ch1a1 extends AppCompatActivity implements View.OnClickListener{

    Button next2,check1;
    EditText ed11,ed12,ed13,ed14,ed15;
    TextView tv11,tv12,tv13,tv14,tv15,tv16;

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.next2:
                startActivity(new Intent(this, chapter2.class));
                break;

            case R.id.check1:
                String str = ed11.getText().toString();
                int a = 4;
                String s1 = "WRONG ANSWER";
                String s2 = "THAT'S RIGHT";
                String s = String.valueOf(a);

                if (!str.equals(s)) {
                    Toast.makeText(getApplicationContext(),"WRONG ANSWER",Toast.LENGTH_SHORT).show();
                } else {
                    ed11.setVisibility(View.INVISIBLE);
                    tv16.setVisibility(View.INVISIBLE);
                    tv11.setText(str);
                    tv16.setVisibility(View.VISIBLE);
                    tv16.setText(s2);
                }
                String str1 = ed12.getText().toString();
                int a1 = 5;
                String s42 = "WRONG ANSWER";
                String s42a = "THAT'S RIGHT";
                String sa = String.valueOf(a1);

                if (!str1.equals(sa)) {
                    tv16.setText(s42);
                } else {
                    ed12.setVisibility(View.INVISIBLE);
                    tv16.setVisibility(View.INVISIBLE);
                    tv12.setText(str1);
                    tv16.setVisibility(View.VISIBLE);
                    tv16.setText(s42a);
                }
                String str2 = ed13.getText().toString();
                int a2 = 6;
                String s43 = "WRONG ANSWER";
                String s43a = "THAT'S RIGHT";
                String sb = String.valueOf(a2);

                if (!str2.equals(sb)) {
                    tv16.setText(s43);
                } else {
                    ed13.setVisibility(View.INVISIBLE);
                    tv16.setVisibility(View.INVISIBLE);
                    tv13.setText(str2);
                    tv16.setVisibility(View.VISIBLE);
                    tv16.setText(s43a);
                }
                String str3 = ed14.getText().toString();
                int a3 = 7;
                String s44 = "WRONG ANSWER";
                String s44a = "THAT'S RIGHT";
                String sc = String.valueOf(a3);

                if (!str3.equals(sc)) {
                    tv16.setText(s44);
                } else {
                    ed14.setVisibility(View.INVISIBLE);
                    tv16.setVisibility(View.INVISIBLE);
                    tv14.setText(str3);
                    tv16.setVisibility(View.VISIBLE);
                    tv16.setText(s44a);
                }
                String str4 = ed15.getText().toString();
                int a4 = 10;
                String s45 = "WRONG ANSWER";
                String s45a = "THAT'S RIGHT";
                String sd = String.valueOf(a4);

                if (!str4.equals(sd)) {
                    tv16.setText(s45);
                } else {
                    ed15.setVisibility(View.INVISIBLE);
                    tv16.setVisibility(View.INVISIBLE);
                    tv15.setText(str4);
                    tv16.setVisibility(View.VISIBLE);
                    tv16.setText(s45a);
                }

                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch1a1);

        next2 = (Button) findViewById(R.id.next2);
        check1 = (Button) findViewById(R.id.check1);
        ed11 = (EditText) findViewById(R.id.editText9);
        ed12 = (EditText) findViewById(R.id.editText10);
        ed13 = (EditText) findViewById(R.id.editText11);
        ed14 = (EditText) findViewById(R.id.editText12);
        ed15 = (EditText) findViewById(R.id.editText13);
        tv11 = (TextView) findViewById(R.id.textView14);
        tv12 = (TextView) findViewById(R.id.textView15);
        tv13 = (TextView) findViewById(R.id.textView16);
        tv14 = (TextView) findViewById(R.id.textView17);
        tv15 = (TextView) findViewById(R.id.textView18);
        tv16 = (TextView) findViewById(R.id.textView13);
        next2.setOnClickListener(this);
        check1.setOnClickListener(this);
    }

}
