package com.example.akashb.demoapp.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.akashb.demoapp.BaseActivity;
import com.example.akashb.demoapp.R;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getComponent().inject(this);

    }

    @Override
    protected int getLayoutResourceId() {
        return R.layout.activity_main;
    }
}
