package com.futurice.daggertestapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import javax.inject.Inject;

public class SecondaryActivity extends AppCompatActivity {
    private static final String TAG = SecondaryActivity.class.getSimpleName();

    @Inject
    LoaderThing loaderThing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((DaggerTestApplication) getApplication()).getGraphComponent().inject(this);

        setContentView(R.layout.activity_secondary);
        Log.d(TAG, "Index: " + loaderThing.getIndex());
        ((TextView) findViewById(R.id.index_text_view)).setText("#" + loaderThing.getIndex());
    }
}
