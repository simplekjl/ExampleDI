package com.simplekjl.smartphone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.simplekjl.smartphone.parts.Battery;

import javax.inject.Inject;

/**
 * Let's show the case of singleton with DI
 *
 *
 */

public class MainActivity extends AppCompatActivity {

    // we add the annotation to the field
    @Inject
    SmartPhone smartPhone;

    @Inject
    Battery battery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // here we access the Application using the following lines
        App.getApp().getSmartPhoneComponent().inject(this);

        smartPhone.makeACall();
        battery.showType();

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // To validate, check the logs and verify the timestamp in the creation object

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

    }
}
