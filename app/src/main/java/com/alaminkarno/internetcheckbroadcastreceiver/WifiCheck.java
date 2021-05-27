package com.alaminkarno.internetcheckbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.widget.Toast;

public class WifiCheck extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        int wifiState = intent.getIntExtra(WifiManager.EXTRA_WIFI_STATE,WifiManager.WIFI_STATE_UNKNOWN);

        if(wifiState == WifiManager.WIFI_STATE_ENABLED){
            Toast.makeText(context, "Wifi Enable", Toast.LENGTH_SHORT).show();
        }
        else if(wifiState == WifiManager.WIFI_STATE_DISABLED){
            Toast.makeText(context, "WiFi Disable", Toast.LENGTH_SHORT).show();
        }
    }
}
