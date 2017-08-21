package com.ayen.ayenapp.Views;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.ayen.ayenapp.R;

/**
 * Created by monodeepdas112 on 14/8/17.
 */

public class SplashScreenActivity extends AppCompatActivity
{
    ImageView companyLogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_splash_screen);
        setUpUIElements();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                preCheckAppState();
            }
        },2000);
    }

    private void setUpUIElements() {
        companyLogo = (ImageView)findViewById(R.id.comapny_logo);
    }

    protected void preCheckAppState(){
        //TODO here goes the code to check if the app starts for the first time and hence SplashScreen needs to be displayed or else
        //not required and we directly go to the
        Intent intent=new Intent(SplashScreenActivity.this,LoginActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                preCheckAppState();
            }
        },2000);
    }
}
