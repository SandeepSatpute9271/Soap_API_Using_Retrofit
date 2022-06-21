package com.app.soapapiwithretrofit.utils;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;

import com.app.soapapiwithretrofit.MainActivity;

import java.net.InetAddress;
import java.util.Date;

 /* Created by Sandeep(Techno Learning) on 16,June,2022
         */

public class Utils {

    public static boolean hasValue(String data) {
        if (data == null || data.length() == 0) {
            return false;
        }
        else {
            if (data.equalsIgnoreCase("null") || data.equalsIgnoreCase("nil")) {
                return false;
            }
        }
        return true;
    }

    public static boolean isConnectedToInternet(Context _context) {
        ConnectivityManager connectivity = (ConnectivityManager) _context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity != null) {
            NetworkInfo info = connectivity.getActiveNetworkInfo();
            if (info != null) {
                if (info.getState() == NetworkInfo.State.CONNECTED) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isInternetAvailable() {
        try {
            InetAddress ipAddr = InetAddress.getByName("https://www.google.com/"); //You can replace it with your name

            if (ipAddr.equals("")) {
                return false;
            } else {
                return true;
            }

        } catch (Exception e) {
            return false;
        }

    }

    public static ProgressDialog showProgressBar(Context context){
        ProgressDialog pDialog = ProgressDialog.show(context,
                "",
                "Loading...",
                true);
        return pDialog;
    }
}
