package com.simplekjl.smartphone.di;

import com.simplekjl.smartphone.SmartPhone;
import com.simplekjl.smartphone.parts.batteries.NickelCadmiumBattery;

import dagger.Component;

/**
 * This interface will communicate and give back an instance of the needed objects
 *
 * Now since we have a Module with dependencies we can't access we need to add the class in the
 * annotation
 * Here we add the new Moduel for the batteries
 *
 */

@Component(modules = {MemoryCardModule.class, BatteriesModule.class})
public interface SmartPhoneComponent {

    SmartPhone getSmartPhone();
}
