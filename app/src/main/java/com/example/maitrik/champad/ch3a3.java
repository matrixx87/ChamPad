package com.example.maitrik.champad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ch3a3 extends AppCompatActivity implements View.OnClickListener{
    Button next4,check3;
    EditText ed31;
    TextView tv31,tv32;

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.next4:
                startActivity(new Intent(this, chapter4.class));
                break;
            case R.id.check3:
                String str = ed31.getText().toString();
                int a = 43;
                String s1 = "WRONG ANSWER";
                String s2 = "THAT'S RIGHT";
                String s = String.valueOf(a);

                if (!str.equals(s)) {
                    tv32.setText(s1);
                } else {
                    ed31.setVisibility(View.INVISIBLE);
                    tv32.setVisibility(View.INVISIBLE);
                    tv31.setText(str);
                    tv32.setVisibility(View.VISIBLE);
                    tv32.setText(s2);
                }
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch3a3);

        next4 = (Button) findViewById(R.id.next4);
        check3=(Button)findViewById(R.id.check3) ;
        ed31=(EditText) findViewById(R.id.editText7);
        tv31=(TextView)findViewById(R.id.textView10) ;
        tv32=(TextView)findViewById(R.id.textView9) ;
        next4.setOnClickListener(this);
        check3.setOnClickListener(this);
    }

}
