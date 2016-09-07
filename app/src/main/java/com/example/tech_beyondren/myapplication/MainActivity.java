package com.example.tech_beyondren.myapplication;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imgRobot;
    private ImageView imgRect;
    private TextView textView;
    private ImageView imgClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgRobot = (ImageView) findViewById(R.id.robot_shrug);
        imgRect = (ImageView) findViewById(R.id.rect_rotate);
        imgClock = (ImageView) findViewById(R.id.clock);
        imgClock.setOnClickListener(this);
        imgRect.setOnClickListener(this);
        imgRobot.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        Drawable drawable = ((ImageView)v).getDrawable();
        if (drawable instanceof Animatable){
            ((Animatable) drawable).start();
        }
    }
}
