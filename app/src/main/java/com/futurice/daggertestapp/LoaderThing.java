package com.futurice.daggertestapp;

import android.util.Log;

/**
 * Created by ttuo on 10/11/15.
 */
public class LoaderThing {
    private static final String TAG = LoaderThing.class.getSimpleName();

    private static int i = 0;
    private final int index = i++;

    public LoaderThing() {
        // Initialization code, only execute once!
        Log.d(TAG, "Initialize");
    }

    public int getIndex() {
        return index;
    }
}
