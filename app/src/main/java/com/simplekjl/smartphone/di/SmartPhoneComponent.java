package com.simplekjl.smartphone.di;

import com.simplekjl.smartphone.SmartPhone;

import dagger.Component;

/**
 * This interface will communicate and give back an instance of the needed objects
 *
 * Now since we have a Module with dependencies we can't access we need to add the class in the
 * annotation
 */

@Component(modules = MemoryCardModule.class)
public interface SmartPhoneComponent {

    SmartPhone getSmartPhone();
}
