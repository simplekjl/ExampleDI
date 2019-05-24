package com.simplekjl.smartphone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.simplekjl.smartphone.di.DaggerSmartPhoneComponent;
import com.simplekjl.smartphone.di.SmartPhoneComponent;

/**
 * How do we add dependencies that are out of our scope, let's say we can't go inside the class
 * and annotate the method with @Inject?
 *
 * For that we are going to create Modules
 *
 */

public class MainActivity extends AppCompatActivity {

    SmartPhone smartPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SmartPhoneComponent smartPhoneComponent = DaggerSmartPhoneComponent.create();

        smartPhoneComponent.getSmartPhone().makeACall();

    }
}
