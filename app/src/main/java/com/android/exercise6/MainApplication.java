package com.android.exercise6;

import android.app.Application;
import android.content.Context;

/**
 * Created by Khang on 07/12/2015.
 */
public class MainApplication extends Application{
    public static Context sharedContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sharedContext = this;
    }
}
