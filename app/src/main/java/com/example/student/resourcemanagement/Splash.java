package com.example.student.resourcemanagement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by student on 3/29/2017.
 */

public class Splash extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread timerThread = new Thread(){
        public void run(){
            try {
                sleep(2500);

            }catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            finally {
                Intent intent = new Intent(Splash.this,Login.class);
                startActivity(intent);
            }
        }
        };
            timerThread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
