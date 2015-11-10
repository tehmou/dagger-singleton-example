package com.futurice.daggertestapp;

import android.app.Application;

/**
 * Created by ttuo on 10/11/15.
 */
public class DaggerTestApplication extends Application {
    private GraphComponent graphComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        graphComponent = DaggerGraphComponent.create();
    }

    public GraphComponent getGraphComponent() {
        return graphComponent;
    }
}
