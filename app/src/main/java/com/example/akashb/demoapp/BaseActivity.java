package com.example.akashb.demoapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.akashb.demoapp.di.component.ActivityComponent;
import com.example.akashb.demoapp.di.component.DaggerActivityComponent;
import com.example.akashb.demoapp.network.NetworkCheck;

import javax.inject.Inject;

/**
 * Created by akashb on 04-09-2017.
 */

public abstract class BaseActivity extends AppCompatActivity {

    private ActivityComponent mComponent;

    @Inject
    protected NetworkCheck networkCheck;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //test
        mComponent = DaggerActivityComponent.builder()
                .appComponent(getApp().getAppComponent()).build();
        if (getLayoutResourceId() != 0)
            setContentView(getLayoutResourceId());
    }

    protected App getApp() {
        return (App) getApplicationContext();
    }

    protected ActivityComponent getComponent() {
        return mComponent;
    }

    protected abstract int getLayoutResourceId();
}
