package com.example.maitrik.champad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity implements View.OnClickListener{
  Button chapter1,chapter2,chapter3,chapter4,chapter5;



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.chapter1:
                startActivity(new Intent(this, chapter1.class));
                break;
            case R.id.chapter2:
                startActivity(new Intent(this, chapter2.class));
                break;
            case R.id.chapter3:
                startActivity(new Intent(this, chapter3.class));
                break;
            case R.id.chapter4:
                startActivity(new Intent(this, chapter4.class));
                break;
            case R.id.chapter5:
                startActivity(new Intent(this, chapter5.class));
                break;
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        chapter1 = (Button) findViewById(R.id.chapter1);
        chapter1.setOnClickListener(this);

        chapter2 = (Button) findViewById(R.id.chapter2);
        chapter2.setOnClickListener(this);

        chapter3 = (Button) findViewById(R.id.chapter3);
        chapter3.setOnClickListener(this);

        chapter4 = (Button) findViewById(R.id.chapter4);
        chapter4.setOnClickListener(this);

        chapter5= (Button) findViewById(R.id.chapter5);
        chapter5.setOnClickListener(this);
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
