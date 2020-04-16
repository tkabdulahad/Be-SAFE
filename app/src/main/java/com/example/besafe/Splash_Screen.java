package com.example.besafe;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class Splash_Screen extends AppCompatActivity {

    SharedPreferences prefs = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        prefs = getSharedPreferences("com.Be SAFE.Be SAFE", MODE_PRIVATE);
        if (prefs.getBoolean("firstrun", true)) {
            prefs.edit().putBoolean("firstrun", false).apply();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent mainIntent = new Intent(Splash_Screen.this, OTP.class);
                    Splash_Screen.this.startActivity(mainIntent);
                    Splash_Screen.this.finish();
                }
            }, 2000);
        } else {


            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent mainIntent = new Intent(Splash_Screen.this, OTP.class);
                    Splash_Screen.this.startActivity(mainIntent);
                    Splash_Screen.this.finish();
                }
            }, 2000);
        }

    }
}

