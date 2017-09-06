package com.example.akashb.demoapp;

import android.app.Application;
import android.support.annotation.VisibleForTesting;

import com.example.akashb.demoapp.di.component.AppComponent;
import com.example.akashb.demoapp.di.component.DaggerAppComponent;
import com.example.akashb.demoapp.di.module.ApplicationModule;

/**
 * Created by akashb on 04-09-2017.
 */

public class App extends Application {

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    @VisibleForTesting
    public void setmAppComponent(AppComponent mAppComponent) {
        this.mAppComponent = mAppComponent;
    }

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder().applicationModule(new ApplicationModule(this))
                .build();
    }


}
