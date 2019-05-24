package com.simplekjl.smartphone;

import android.app.Application;

import com.simplekjl.smartphone.di.DaggerSmartPhoneComponent;
import com.simplekjl.smartphone.di.MemoryCardModule;
import com.simplekjl.smartphone.di.SmartPhoneComponent;

/**
 * The need of a application class will be always when there are static classes that are shared among
 * the app, or we have analytics classes and so on.
 *
 * If we do not follow this pattern we might need to add a lot of repetitive logic in all our activities
 *
 */

public class App extends Application {

    private static App app;
    private SmartPhoneComponent smartPhoneComponent;


    public static App getApp(){
        return app;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        app = this;

        // this is the logic that we might duplicate if we do not follow this pattern
        //since at least one of our modules has a state, we need to pass the variables in here
        smartPhoneComponent = DaggerSmartPhoneComponent.builder()
                .memoryCardModule(new MemoryCardModule(100))
                .build();

    }

    public SmartPhoneComponent getSmartPhoneComponent(){
        return  smartPhoneComponent;
    }
}
