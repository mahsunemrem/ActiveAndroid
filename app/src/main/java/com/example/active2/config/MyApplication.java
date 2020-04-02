package com.example.active2.config;

import com.activeandroid.ActiveAndroid;

public class MyApplication extends com.activeandroid.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ActiveAndroid.initialize(this);
    }
}
