package com.simplekjl.smartphone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.simplekjl.smartphone.di.DaggerSmartPhoneComponent;
import com.simplekjl.smartphone.di.SmartPhoneComponent;

/**
 * How the dependencies are structured in the project?
 *
 * Well to describe this we can make  a small three to understand this concept
 *
 *            -> Battery
 * SmartPhone -> MemoryCard
 *            -> SIMCard -> ServiceProvider (this is also a dependency to SmartPhone since is needed
 *                          it to create a direct dependency of SmartPhone)
 *
 * All this can be easily construct by dagger user annotations and understanding the types of
 * dependency
 *
 * Types of injection:
 * Field injection
 * Parameter injection
 * Constructor Injection
 *
 *
 */

public class MainActivity extends AppCompatActivity {

    SmartPhone smartPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        SmartPhoneComponent smartPhoneComponent = DaggerSmartPhoneComponent.create();

        smartPhoneComponent.getSmartPhone().makeACall();

    }
}
