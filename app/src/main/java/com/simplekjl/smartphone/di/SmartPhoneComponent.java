package com.simplekjl.smartphone.di;

import android.support.annotation.MainThread;

import com.simplekjl.smartphone.MainActivity;
import com.simplekjl.smartphone.SmartPhone;
import com.simplekjl.smartphone.parts.batteries.NickelCadmiumBattery;

import dagger.Component;

/**
 * In larger projects we need more redability and clean code so we will use field injection to
 * achieve this.
 *
 */

@Component(modules = {MemoryCardModule.class, BatteriesModule.class})
public interface SmartPhoneComponent {

    //zSmartPhone getSmartPhone();

    // per convention we use the name inject
    // we need to specify every place we would like to inject, let's say we need this instance 4 times
    // we will have 4 methods passing the instance
    void inject(MainActivity mainActivity);

}
