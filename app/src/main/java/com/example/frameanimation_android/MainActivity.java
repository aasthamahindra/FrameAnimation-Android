package com.example.frameanimation_android;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private AnimationDrawable beeAnimation;
    private ImageView beeImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        beeImage = (ImageView) findViewById(R.id.beeID);
        beeImage.setBackgroundResource(R.drawable.bee_anim);
        beeAnimation = (AnimationDrawable) beeImage.getBackground();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        beeAnimation.start();

        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                beeAnimation.stop();
            }
        }, 5100);

        return super.onTouchEvent(event);
    }
}