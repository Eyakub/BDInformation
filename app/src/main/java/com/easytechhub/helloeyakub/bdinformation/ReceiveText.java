package com.easytechhub.helloeyakub.bdinformation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Eyakub on 10/31/2017.
 */

public class ReceiveText extends AppCompatActivity {

    TextView tv;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information);

        tv = (TextView) findViewById(R.id.informationCity);

        Intent intent = getIntent();


    }
}
