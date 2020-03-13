package com.example.a20secondchattingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        SystemClock.sleep(3000);
        Intent intent=new Intent(SplashScreenActivity.this,LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
