package com.example.applicationforblackcoffer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Group;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Group group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        group=findViewById(R.id.group);

        group.setVisibility(View.GONE);
    }
}