package com.example.sunny.poze_map03;

import android.app.Application;

import com.mapbox.mapboxsdk.Mapbox;

/**
 * Created by Maroof Ahmed Siddique on 04-05-2018.
 * maroofahmedsiddique@gmail.com
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Mapbox Access token
        Mapbox.getInstance(getApplicationContext(), getResources().getString(R.string.access_token));

    }
}
