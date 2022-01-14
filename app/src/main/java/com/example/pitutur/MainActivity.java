package com.example.pitutur;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.window.SplashScreen;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.layla);
        mediaPlayer.start();

        int SPLASH_SCREEN =3200;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        },SPLASH_SCREEN);
    }
}