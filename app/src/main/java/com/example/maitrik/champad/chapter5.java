package com.example.maitrik.champad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chapter5 extends AppCompatActivity implements View.OnClickListener{
    Button level51,level52,level53;

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.level51:
                startActivity(new Intent(this, ch5lvl1.class));
                break;
            case R.id.level52:
                startActivity(new Intent(this, ch5lvl2.class));
                break;

            case R.id.level53:
                startActivity(new Intent(this, ch5lvl3.class));
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter5);

        level51 = (Button) findViewById(R.id.level51);
        level51.setOnClickListener(this);

        level52 = (Button) findViewById(R.id.level52);
        level52.setOnClickListener(this);

        level53 = (Button) findViewById(R.id.level53);
        level53.setOnClickListener(this);

    }
    @Override
    public void onWindowFocusChanged(boolean hasFocus){
        super.onWindowFocusChanged(hasFocus);
        View decorView =getWindow().getDecorView();
        if(hasFocus){
            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                    |View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    |View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    |View.SYSTEM_UI_FLAG_FULLSCREEN
                    |View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        }
    }
}
