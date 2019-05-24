package com.simplekjl.smartphone.parts.batteries;

import android.util.Log;

import com.simplekjl.smartphone.parts.Battery;

import javax.inject.Inject;

/**
 * Here we create the imlementation of the Battery on the
 */
public class NickelCadmiumBattery implements Battery {

    private static final String TAG = NickelCadmiumBattery.class.getName();
    private static final String batteryType = "Nickel Cadmium Battery";

    @Inject
    public NickelCadmiumBattery() {

    }

    @Override
    public void showType() {
        Log.d(TAG, batteryType);
    }
}
