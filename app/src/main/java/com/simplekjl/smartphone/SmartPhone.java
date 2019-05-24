package com.simplekjl.smartphone;

import android.util.Log;

import com.simplekjl.smartphone.parts.Battery;
import com.simplekjl.smartphone.parts.MemoryCard;
import com.simplekjl.smartphone.parts.SIMCard;

import javax.inject.Inject;

/**
 * In Order to be able to use DI we need to annotate their constructors which is called
 * Construction injection
 */
public class SmartPhone {

    private static final String TAG = "SmartPhone";
    private Battery battery;
    private MemoryCard memoryCard;
    private SIMCard simCard;

    @Inject
    public SmartPhone(Battery battery, MemoryCard memoryCard, SIMCard simCard) {
        // here the instance came along with dagger
        this.battery = battery;
        this.memoryCard = memoryCard;
        this.simCard = simCard;
        // here we can call the method inside the instance battery
        battery.showType();
    }

    public void makeACall () {
        Log.d(TAG, "makeACall: makig a call.......");
    }
}
