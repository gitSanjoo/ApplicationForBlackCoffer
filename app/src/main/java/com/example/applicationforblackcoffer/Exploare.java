package com.example.applicationforblackcoffer;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;

import android.os.Bundle;

public class Exploare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exploare);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("     Explore");
        actionBar.setSubtitle("    Bangalore, India");
        actionBar.setIcon(R.drawable.three_line);
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

//        WindowCompat.setDecorFitsSystemWindows(getWindow(), true);

    }
}