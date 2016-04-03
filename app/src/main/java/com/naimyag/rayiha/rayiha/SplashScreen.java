package com.naimyag.rayiha.rayiha;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread thread = new Thread() {

            @Override
            public void run() {

                try {
                    synchronized (this) {
                        wait(3000);
                    }
                } catch (InterruptedException e) {

                } finally {

                    finish();

                    Intent intent = new Intent();
                    intent.setClass(getApplicationContext(), MainActivity.class);
                    startActivity(intent);

                }

            }
        };

        thread.start();


    }
}
