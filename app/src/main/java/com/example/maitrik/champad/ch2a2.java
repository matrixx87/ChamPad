package com.example.maitrik.champad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ch2a2 extends AppCompatActivity implements View.OnClickListener{
Button next3,check2;
EditText ed21;
    TextView tv21,tv22;
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.next3:
                startActivity(new Intent(this, chapter3.class));
                break;
            case R.id.check2:
                String str = ed21.getText().toString();
                int a = 20;
                String s1 = "WRONG ANSWER";
                String s2 = "THAT'S RIGHT";
                String s = String.valueOf(a);

                if (!str.equals(s)) {
                    tv22.setText(s1);
                } else {
                    ed21.setVisibility(View.INVISIBLE);
                    tv22.setVisibility(View.INVISIBLE);
                    tv21.setText(str);
                    tv22.setVisibility(View.VISIBLE);
                    tv22.setText(s2);
                }
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch2a2);

        next3 = (Button) findViewById(R.id.next3);
        check2 = (Button) findViewById(R.id.check2);
        ed21 = (EditText) findViewById(R.id.editText8);
        tv21 = (TextView) findViewById(R.id.textView12);
        tv22 = (TextView) findViewById(R.id.textView11);
        next3.setOnClickListener(this);
        check2.setOnClickListener(this);
    }

}
