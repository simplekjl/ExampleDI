package com.simplekjl.smartphone.di;

import com.simplekjl.smartphone.SmartPhone;

import dagger.Component;

/**
 * This interface will communicate and give back an instance of the needed objects
 */

@Component
public interface SmartPhoneComponent {

    SmartPhone getSmartPhone();
}
