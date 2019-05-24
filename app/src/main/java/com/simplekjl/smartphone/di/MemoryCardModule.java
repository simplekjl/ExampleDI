package com.simplekjl.smartphone.di;

import com.simplekjl.smartphone.parts.MemoryCard;

import dagger.Module;
import dagger.Provides;

/**
 * Let's say we do not own the class MemoryCard we are going to provide the instance using module
 * (Verify that MemoryCard it isn't annotated anymore)
 *
 */
@Module
public class MemoryCardModule {

    // for convenience the method should always follows the naming provide at the beginning
    @Provides
    MemoryCard provideMemoryCard() {
        // here we basically return the instance of the class
        return new MemoryCard();
    }
}
