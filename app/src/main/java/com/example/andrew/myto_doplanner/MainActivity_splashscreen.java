package com.example.andrew.myto_doplanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity_splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_splashscreen);
        Thread myThread = new Thread(){

            @Override
            public void run(){
                try {
                    sleep(3000);
                    Intent intent;
                    intent = new Intent(getApplicationContext(), MainActivitymain.class);
                    startActivity(intent);
                    finish();

                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };
        myThread.start();

    }
    @Override
    public void onStart(){
        super.onStart();
    }

    @Override
    public void onStop(){
        super.onStop();
    }
}

