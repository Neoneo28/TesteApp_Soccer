package com.neoneo28.Soccer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar progressBar2;
    ProgressBar progressBar3;
    int value;
    int value2;
    Handler handler=new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar2=findViewById(R.id.progressBar2);

        progressBar3=findViewById(R.id.progressBar3);

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                startProgress();
                startProgress2();
            }
        });
        thread.start();


    }
    public void startProgress(){
        for (value=0;value<=29;value=value+1)

            try {
                Thread.sleep(40);
                progressBar2.setProgress(value);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        handler.post(new Runnable() {
            @Override
            public void run() {

            }

        });


    }



    public void startProgress2(){
        for (value2=0;value2<=69;value2=value2+1)

            try {
                Thread.sleep(40);
                progressBar3.setProgress(value2);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        handler.post(new Runnable() {
            @Override
            public void run() {
            }

        });


    }}
