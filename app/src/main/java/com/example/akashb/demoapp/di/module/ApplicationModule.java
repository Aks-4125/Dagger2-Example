package com.example.akashb.demoapp.di.module;

import android.content.Context;

import com.example.akashb.demoapp.App;
import com.example.akashb.demoapp.network.NetworkCheck;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by akashb on 04-09-2017.
 */


@Module
public class ApplicationModule {
    private App mApp;

    public ApplicationModule(App app) {
        mApp = app;
    }

    @Provides
    @Singleton
    public Context appContext() {
        return mApp;
    }


    @Provides
    @Singleton
    public NetworkCheck networkCheck() {
        return new NetworkCheck(mApp);
    }


}

