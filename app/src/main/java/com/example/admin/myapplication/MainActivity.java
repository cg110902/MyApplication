package com.example.admin.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.telephony.TelephonyManager;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity
{

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textview);
        textView.setText("IMEI:" + getIMEI());
    }

    public String getIMEI()
    {
        TelephonyManager telephonyManager = (TelephonyManager) this.getSystemService(Context.TELEPHONY_SERVICE);

        String imei = telephonyManager.getDeviceId();
        return imei;
    }
}
