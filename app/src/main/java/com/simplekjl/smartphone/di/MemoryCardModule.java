package com.simplekjl.smartphone.di;

import android.util.Log;

import com.simplekjl.smartphone.parts.MemoryCard;

import dagger.Module;
import dagger.Provides;

/**
 * Let's say we do not own the class MemoryCard we are going to provide the instance using module
 * (Verify that MemoryCard it isn't annotated anymore)
 *
 * for passing information to create the dependency of the memory let's add a field for the size
 *
 */
@Module
public class MemoryCardModule {

    private int memorySize;
    private static final String TAG = MemoryCardModule.class.getName();

    public MemoryCardModule(int memorySize) {
        this.memorySize = memorySize;
    }

    // for convenience the method should always follows the naming provide at the beginning
    @Provides
    MemoryCard provideMemoryCard() {
        // here we basically return the instance of the class
        Log.d(TAG, "provideMemoryCard: "+memorySize);
        return new MemoryCard();
    }
}
