package com.example.aakash.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    ImageView mainLogo;
    TextView tvMain, tvTag;
    Animation animation_1, animation_2, animation_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mainLogo = (ImageView) findViewById(R.id.main_logo);
        tvMain = (TextView) findViewById(R.id.tv_main);
        tvTag = (TextView) findViewById(R.id.tv_tag);
        animation_1 = AnimationUtils.loadAnimation(getBaseContext(), R.anim.rotate);
        animation_2 = AnimationUtils.loadAnimation(getBaseContext(), R.anim.antirotate);
//        animation_3 = AnimationUtils.loadAnimation(getBaseContext(), R.anim.rotate);


        mainLogo.startAnimation(animation_2);
        animation_2.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                mainLogo.startAnimation(animation_1);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        animation_1.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                mainLogo.startAnimation(animation_2);
                finish();
                Intent intent = new Intent(getBaseContext(), WelcomeActivity.class);
                startActivity(intent);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
}
