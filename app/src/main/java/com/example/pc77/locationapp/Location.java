package com.example.pc77.locationapp;

import android.content.Context;
import android.location.LocationListener;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by pc77 on 3/4/18.
 */

public class Location implements LocationListener {
    Context context;
    Location(Context context)
    {
        this.context=context;
    }
    @Override
    public void onLocationChanged(android.location.Location location) {
        Toast.makeText(context,"Location :"+location.getLatitude() +location.getLongitude(),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {
        Toast.makeText(context,"GPS Status Changed",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onProviderEnabled(String s) {
        Toast.makeText(context,"Location provider Enabled",Toast.LENGTH_SHORT).show();
    }
    
    @Override
    public void onProviderDisabled(String s) {
        Toast.makeText(context,"Location provider Disabled",Toast.LENGTH_SHORT).show();
    }
}
