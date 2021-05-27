package com.alaminkarno.internetcheckbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class InternetCheck extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = connectivityManager.getActiveNetworkInfo();

        boolean network = activeNetwork !=null && activeNetwork.isConnectedOrConnecting();

        if(network){
            Toast.makeText(context, "Internet Connected", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(context, "Internet Disconnected", Toast.LENGTH_SHORT).show();
        }
    }
}
