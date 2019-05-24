package com.simplekjl.smartphone.di;

import com.simplekjl.smartphone.parts.Battery;
import com.simplekjl.smartphone.parts.batteries.NickelCadmiumBattery;

import dagger.Module;
import dagger.Provides;

@Module
public class BatteriesModule {

    @Provides
    Battery provideNickelCadmiumBattery(NickelCadmiumBattery nickelCadmiumBattery){
        //for example purposes we are going to call the method in the class here to show
        // it was created
        nickelCadmiumBattery.showType();

        return  nickelCadmiumBattery;
    }
}
