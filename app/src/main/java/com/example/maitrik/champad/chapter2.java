package com.example.maitrik.champad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chapter2 extends AppCompatActivity implements View.OnClickListener{
Button level21,level22,level23;

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.level21:
                startActivity(new Intent(this, ch2lvl1.class));
                break;

            case R.id.level22:
                startActivity(new Intent(this, ch2lvl2.class));
                break;
            case R.id.level23:
                startActivity(new Intent(this, ch2lvl3.class));
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter2);

        level21 = (Button) findViewById(R.id.level21);
        level21.setOnClickListener(this);

        level22 = (Button) findViewById(R.id.level22);
        level22.setOnClickListener(this);

        level23 = (Button) findViewById(R.id.level23);
        level23.setOnClickListener(this);
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
