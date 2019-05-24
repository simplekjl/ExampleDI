package com.simplekjl.smartphone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.simplekjl.smartphone.di.DaggerSmartPhoneComponent;
import com.simplekjl.smartphone.di.MemoryCardModule;
import com.simplekjl.smartphone.di.SmartPhoneComponent;
import com.simplekjl.smartphone.parts.Battery;

import javax.inject.Inject;

/**
 * Using field injection below
 */

public class MainActivity extends AppCompatActivity {

    // we add the annotation to the field
    @Inject
    SmartPhone smartPhone;

    @Inject
    Battery battery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //since at least one of our modules has a state, we need to pass the variables in here
        SmartPhoneComponent smartPhoneComponent = DaggerSmartPhoneComponent.builder()
                .memoryCardModule(new MemoryCardModule(100))
                .build();

        //smartPhoneComponent.getSmartPhone().makeACall();
        // now we pass the instance to get smartPhone instance
        smartPhoneComponent.inject(this);

        smartPhone.makeACall();
        battery.showType();

    }
}
