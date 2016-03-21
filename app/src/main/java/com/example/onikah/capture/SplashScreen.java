package com.example.onikah.capture;

/**
 * Created by onikah on 3/21/16.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;



public class SplashScreen extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
//5000 milli seconds are delaying time to redirect to NextActivity
        mHandler.sendEmptyMessageDelayed(0, 5000);

    }

    private Handler mHandler = new Handler() {
        public void handleMessage(android.os.Message msg) {
            startActivity(new Intent(SplashScreen.this, MainActivity.class));
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            finish();
        }

        ;

    };
}