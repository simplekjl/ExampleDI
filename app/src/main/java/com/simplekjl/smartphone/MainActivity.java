package com.simplekjl.smartphone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.simplekjl.smartphone.parts.Battery;

import javax.inject.Inject;

/**
 * Using the concept of Application layer into our application
 * Since we are going to use the application everywhere it's a good practice to have it aside
 *
 * Check:
 * Application class
 * Manifest android:name=".App"
 *
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

        // here we access the Application using the following lines
        App.getApp().getSmartPhoneComponent().inject(this);

        smartPhone.makeACall();
        battery.showType();

    }
}
