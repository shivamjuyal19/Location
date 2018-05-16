package com.example.pc77.locationapp;

import android.location.LocationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    LocationManager lm;
    Location l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=new Location(this);
        lm=(LocationManager)getSystemService(LOCATION_SERVICE);
    }

    @Override
    protected void onResume() {
        super.onResume();
        try {
            lm.requestLocationUpdates(LocationManager.GPS_PROVIDER,2000,10,l);
        }catch(SecurityException s)
        {

        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        lm.removeUpdates(l);
    }
}
