package com.example.akashb.demoapp.di.component;

import com.example.akashb.demoapp.network.NetworkCheck;
import com.example.akashb.demoapp.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by akashb on 04-09-2017.
 */

@Singleton
@Component(modules = {ApplicationModule.class})
public interface AppComponent {

    NetworkCheck networkCheck();

}