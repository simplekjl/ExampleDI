package com.simplekjl.smartphone;

import android.util.Log;

import com.simplekjl.smartphone.parts.Battery;
import com.simplekjl.smartphone.parts.MemoryCard;
import com.simplekjl.smartphone.parts.SIMCard;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * To make a singleton injection we need to annotate the class we want as a singleton as well as its
 * component
 */

@Singleton
public class SmartPhone {

    private static final String TAG = "SmartPhone";
    private Battery battery;
    private MemoryCard memoryCard;
    private SIMCard simCard;

    // let's validate the time we are creating the instance
    private String time;


    @Inject
    public SmartPhone(Battery battery, MemoryCard memoryCard, SIMCard simCard) {
        // here the instance came along with dagger
        this.battery = battery;
        this.memoryCard = memoryCard;
        this.simCard = simCard;
        // here we can call the method inside the instance battery
        SimpleDateFormat df = new SimpleDateFormat("EEE,d MMM yyyy, HH:mm:ss");
        time = df.format(Calendar.getInstance().getTime());
        battery.showType();
    }

    public void makeACall () {
        Log.d(TAG, "makeACall: makig a call.......");
        Log.d(TAG, "created time is: "+time);
    }
}
