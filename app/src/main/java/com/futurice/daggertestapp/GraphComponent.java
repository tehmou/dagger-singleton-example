package com.futurice.daggertestapp;

import android.app.Activity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ttuo on 10/11/15.
 */
@Singleton
@Component(
        modules = {ActivityModule.class}
)
public interface GraphComponent {
    LoaderThing providesLoaderThing();
    void inject(MainActivity mainActivity);
    void inject(SecondaryActivity secondaryActivity);
}
