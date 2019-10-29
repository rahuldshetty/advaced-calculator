package com.rahuldshetty.advancedscientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.rahuldshetty.advancedscientificcalculator.adapter.GridAdapter;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    private GridAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new GridAdapter(getApplicationContext());

        gridView = findViewById(R.id.gridView);
        gridView.setAdapter(adapter);

    }
}
