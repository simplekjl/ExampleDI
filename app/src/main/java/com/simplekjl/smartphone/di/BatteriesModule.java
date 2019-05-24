package com.simplekjl.smartphone.di;

import com.simplekjl.smartphone.parts.Battery;
import com.simplekjl.smartphone.parts.batteries.NickelCadmiumBattery;

import dagger.Binds;
import dagger.Module;

/**
 * this is another method to create the same kind of dependency injection
 * using Abstract class and methods , check changes in SmartPhone which is the class using the instance.
 *
 * Annotations
 * Instead of using Provides we use the annotation Binds
 */
@Module
abstract class BatteriesModule {

    @Binds
    abstract Battery provideNickelCadmiumBattery(NickelCadmiumBattery nickelCadmiumBattery);
}
