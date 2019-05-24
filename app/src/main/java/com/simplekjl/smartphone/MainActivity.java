package com.simplekjl.smartphone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.simplekjl.smartphone.di.DaggerSmartPhoneComponent;
import com.simplekjl.smartphone.di.SmartPhoneComponent;

import javax.inject.Inject;

/**
 * Using field injection below
 */

public class MainActivity extends AppCompatActivity {

    // we add the annotation to the field
    @Inject
    SmartPhone smartPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SmartPhoneComponent smartPhoneComponent = DaggerSmartPhoneComponent.create();

        //smartPhoneComponent.getSmartPhone().makeACall();
        // now we pass the instance to get smartPhone instance
        smartPhoneComponent.inject(this);

        smartPhone.makeACall();

    }
}
