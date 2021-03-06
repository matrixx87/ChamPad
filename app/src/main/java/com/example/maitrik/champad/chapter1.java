package com.example.maitrik.champad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chapter1 extends AppCompatActivity implements View.OnClickListener {
Button level11,level12,level13;

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.level11:
                startActivity(new Intent(this, ch1lvl1.class));
                break;
            case R.id.level12:
                startActivity(new Intent(this, ch1lvl2.class));
                break;
            case R.id.level13:
                startActivity(new Intent(this, ch1lvl3.class));
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter1);

        level11= (Button) findViewById(R.id.level11);
        level11.setOnClickListener(this);

        level12= (Button) findViewById(R.id.level12);
        level12.setOnClickListener(this);

        level13= (Button) findViewById(R.id.level13);
        level13.setOnClickListener(this);

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
