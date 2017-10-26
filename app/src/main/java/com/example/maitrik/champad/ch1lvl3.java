package com.example.maitrik.champad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ch1lvl3 extends AppCompatActivity implements View.OnClickListener {
Button next1a;

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.next1a:
                startActivity(new Intent(this, ch1a1.class));
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch1lvl3);
        next1a = (Button) findViewById(R.id.next1a);
        next1a.setOnClickListener(this);
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
