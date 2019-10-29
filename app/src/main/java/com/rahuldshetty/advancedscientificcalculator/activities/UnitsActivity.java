package com.rahuldshetty.advancedscientificcalculator.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.rahuldshetty.advancedscientificcalculator.R;

public class UnitsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_units);

        getSupportActionBar().setTitle("Units");
    }
}
