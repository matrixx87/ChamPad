package com.example.maitrik.champad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chapter4 extends AppCompatActivity implements View.OnClickListener{
    Button level41,level42,level43;

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.level41:
                startActivity(new Intent(this, ch4lvl1.class));
                break;
            case R.id.level42:
                startActivity(new Intent(this, ch4lvl2.class));
                break;
            case R.id.level43:
                startActivity(new Intent(this, ch4lvl3.class));
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter4);
        level41 = (Button) findViewById(R.id.level41);
        level41.setOnClickListener(this);

        level42 = (Button) findViewById(R.id.level42);
        level42.setOnClickListener(this);

        level43 = (Button) findViewById(R.id.level43);
        level43.setOnClickListener(this);

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
