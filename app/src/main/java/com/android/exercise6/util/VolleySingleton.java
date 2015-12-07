package com.android.exercise6.util;

import com.android.exercise6.MainApplication;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by Khang on 07/12/2015.
 */
public class VolleySingleton {
    private static RequestQueue mRequestQueue;
    public synchronized static RequestQueue getRequestQueue(){
        if (mRequestQueue == null)
            mRequestQueue = Volley.newRequestQueue(MainApplication.sharedContext);
        return mRequestQueue;
    }
}
