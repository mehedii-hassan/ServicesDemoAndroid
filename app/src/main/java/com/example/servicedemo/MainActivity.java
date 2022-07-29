package com.example.servicedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.servicedemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnStartStartedService.setOnClickListener(v -> {
            startService(new Intent(MainActivity.this,MyStartedService.class));


        });
        binding.btnStopStartedService.setOnClickListener(v -> {
            stopService(new Intent(MainActivity.this,MyStartedService.class));


        });
    }
}