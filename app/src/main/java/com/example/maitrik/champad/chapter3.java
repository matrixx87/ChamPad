package com.example.maitrik.champad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chapter3 extends AppCompatActivity implements View.OnClickListener{
    Button level31,level32,level33;

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.level31:
                startActivity(new Intent(this,ch3lvl1.class));
                break;

            case R.id.level32:
                startActivity(new Intent(this, ch3lvl2.class));
                break;
            case R.id.level33:
                startActivity(new Intent(this, ch3lvl3.class));
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter3);

        level31 = (Button) findViewById(R.id.level31);
        level31.setOnClickListener(this);

        level32 = (Button) findViewById(R.id.level32);
        level32.setOnClickListener(this);

        level33 = (Button) findViewById(R.id.level33);
        level33.setOnClickListener(this);
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
