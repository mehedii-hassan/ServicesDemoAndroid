package com.example.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class MyStartedService extends Service {

    private static final String TAG = "Started Service";

    public MyStartedService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "Service created", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "Service created");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "Service Started", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "Service started");
        //stopSelf();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Service destroyed", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "Service destroyed");
    }
}