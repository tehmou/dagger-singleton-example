package com.futurice.daggertestapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Inject
    LoaderThing loaderThing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((DaggerTestApplication) getApplication()).getGraphComponent().inject(this);

        setContentView(R.layout.activity_main);
        Log.d(TAG, "Index: " + loaderThing.getIndex());
        ((TextView) findViewById(R.id.index_text_view)).setText("#" + loaderThing.getIndex());

        findViewById(R.id.open_activity_button).setOnClickListener(
                (event) -> {
                    Intent intent = new Intent(this, SecondaryActivity.class);
                    startActivity(intent);
                }
        );
    }
}
