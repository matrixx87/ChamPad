package com.example.maitrik.champad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ch5a5 extends AppCompatActivity implements View.OnClickListener{
Button next6,check5;
    EditText edit;
    TextView text,text1;
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.next6:
                startActivity(new Intent(this, MainMenu.class));
                break;
            case R.id.check5:
                String str = edit.getText().toString();
                int a = 51;
                String s1 = "WRONG ANSWER";
                String s2 = "THAT'S RIGHT";
                String s = String.valueOf(a);

                if (!str.equals(s)) {
                    text1.setText(s1);
                } else {
                    edit.setVisibility(View.INVISIBLE);
                    text1.setVisibility(View.INVISIBLE);
                    text.setText(str);
                    text1.setVisibility(View.VISIBLE);
                    text1.setText(s2);
                }
                break;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch5a5);

        next6 = (Button) findViewById(R.id.next6);
        check5= (Button) findViewById(R.id.check5);
        edit= (EditText)findViewById(R.id.editText);
        text=(TextView)findViewById(R.id.textView);
        text1=(TextView)findViewById(R.id.textView2);
        next6.setOnClickListener(this);
        check5.setOnClickListener(this);

        }


}
