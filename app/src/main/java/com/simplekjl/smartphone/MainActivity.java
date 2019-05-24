package com.simplekjl.smartphone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.simplekjl.smartphone.di.DaggerSmartPhoneComponent;
import com.simplekjl.smartphone.di.SmartPhoneComponent;

/**
 * how to provide a interface class as a dependency?
 *
 * Let's change our class battery to an interface to demonstrate this example
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
