package com.futurice.daggertestapp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ttuo on 10/11/15.
 */
@Module
public class ActivityModule {
    @Provides @Singleton
    LoaderThing providesLoaderThing() {
        return new LoaderThing();
    }
}
