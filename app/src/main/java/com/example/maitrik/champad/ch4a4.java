package com.example.maitrik.champad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ch4a4 extends AppCompatActivity implements View.OnClickListener{
Button next5,check4;
    EditText ed41,ed42,ed43,ed44,ed45;
    TextView tv41,tv42,tv43,tv44,tv45,tv46;

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.next5:
                startActivity(new Intent(this, chapter5.class));
                break;
            case R.id.check4:
                String str = ed41.getText().toString();
                int a = 2;
                String s1 = "WRONG ANSWER";
                String s2 = "THAT'S RIGHT";
                String s = String.valueOf(a);

                if (!str.equals(s)) {
                    tv46.setText(s1);
                } else {
                    ed41.setVisibility(View.INVISIBLE);
                    tv46.setVisibility(View.INVISIBLE);
                    tv41.setText(str);
                    tv46.setVisibility(View.VISIBLE);
                    tv46.setText(s2);
                }
                String str1 = ed42.getText().toString();
                int a1 = 3;
                String s42 = "WRONG ANSWER";
                String s42a = "THAT'S RIGHT";
                String sa = String.valueOf(a1);

                if (!str1.equals(sa)) {
                    tv46.setText(s42);
                } else {
                    ed42.setVisibility(View.INVISIBLE);
                    tv46.setVisibility(View.INVISIBLE);
                    tv42.setText(str1);
                    tv46.setVisibility(View.VISIBLE);
                    tv46.setText(s42a);
                }
                String str2 = ed43.getText().toString();
                int a2 = 1;
                String s43 = "WRONG ANSWER";
                String s43a = "THAT'S RIGHT";
                String sb = String.valueOf(a2);

                if (!str2.equals(sb)) {
                    tv46.setText(s43);
                } else {
                    ed43.setVisibility(View.INVISIBLE);
                    tv46.setVisibility(View.INVISIBLE);
                    tv43.setText(str2);
                    tv46.setVisibility(View.VISIBLE);
                    tv46.setText(s43a);
                }
                String str3 = ed44.getText().toString();
                int a3 = 2;
                String s44 = "WRONG ANSWER";
                String s44a = "THAT'S RIGHT";
                String sc = String.valueOf(a3);

                if (!str3.equals(sc)) {
                    tv46.setText(s44);
                } else {
                    ed44.setVisibility(View.INVISIBLE);
                    tv46.setVisibility(View.INVISIBLE);
                    tv44.setText(str3);
                    tv46.setVisibility(View.VISIBLE);
                    tv46.setText(s44a);
                }
                String str4 = ed45.getText().toString();
                int a4 = 1;
                String s45 = "WRONG ANSWER";
                String s45a = "THAT'S RIGHT";
                String sd = String.valueOf(a4);

                if (!str4.equals(sd)) {
                    tv46.setText(s45);
                } else {
                    ed45.setVisibility(View.INVISIBLE);
                    tv46.setVisibility(View.INVISIBLE);
                    tv45.setText(str4);
                    tv46.setVisibility(View.VISIBLE);
                    tv46.setText(s45a);
                }

                break;

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch4a4);

        next5= (Button) findViewById(R.id.next5);
        check4 = (Button)findViewById(R.id.check4);
        ed41 = (EditText)findViewById(R.id.editText2);
        ed42 = (EditText)findViewById(R.id.editText3);
        ed43 = (EditText)findViewById(R.id.editText4);
        ed44 = (EditText)findViewById(R.id.editText5);
        ed45 = (EditText)findViewById(R.id.editText6);
        tv41=(TextView)findViewById(R.id.textView3);
        tv42=(TextView)findViewById(R.id.textView4);
        tv43=(TextView)findViewById(R.id.textView5);
        tv44=(TextView)findViewById(R.id.textView6);
        tv45=(TextView)findViewById(R.id.textView7);
        tv46=(TextView)findViewById(R.id.textView8);
        next5.setOnClickListener(this);
        check4.setOnClickListener(this);
    }

}
