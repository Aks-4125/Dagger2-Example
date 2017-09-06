package com.example.akashb.demoapp.di.component;

import com.example.akashb.demoapp.BaseActivity;
import com.example.akashb.demoapp.ui.MainActivity;
import com.example.akashb.demoapp.di.scope.ActivityScope;

import dagger.Component;

/**
 * Created by akashb on 04-09-2017.
 */

@ActivityScope
@Component(dependencies = AppComponent.class)
public interface ActivityComponent extends AppComponent {
    void inject(MainActivity mainActivity);
   // void inject(BaseActivity mainActivity);

}

