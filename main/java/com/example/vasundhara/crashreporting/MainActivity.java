package com.example.vasundhara.crashreporting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.crash.FirebaseCrash;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirebaseCrash.log("Activity created");
        FirebaseCrash.logcat(Log.ERROR, "here", "NPE caught");
        FirebaseCrash.report(new Exception("My first Android non-fatal error"));
    }
}
