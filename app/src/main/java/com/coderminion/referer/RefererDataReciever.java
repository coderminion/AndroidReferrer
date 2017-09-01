package com.coderminion.referer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;

/**
 * Created by phoenix on 1/9/17.
 */

    public class RefererDataReciever extends BroadcastReceiver {
        public static final String ACTION_UPDATE_DATA = "ACTION_UPDATE_DATA";
        private static final String ACTION_INSTALL_REFERRER = "com.android.vending.INSTALL_REFERRER";
        private static final String KEY_REFERRER = "referrer";

        public static final String REFERRER_DATA = "REFERRER_DATA";

        public RefererDataReciever() {
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                Log.e("RefererDataReciever", "Intent is null");
                return;
            }
            if (!ACTION_INSTALL_REFERRER.equals(intent.getAction())) {
                Log.e("RefererDataReciever", "Wrong action! Expected: " + ACTION_INSTALL_REFERRER + " but was: " + intent.getAction());
                return;
            }
            Bundle extras = intent.getExtras();
            if (intent.getExtras() == null) {
                Log.e("RefererDataReciever", "No data in intent");
                return;
            }

            //TODO get referer from here
            SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
            if (!sp.contains(REFERRER_DATA)) {
                sp.edit().putString(REFERRER_DATA, (String) extras.get(KEY_REFERRER)).apply();
            }

            LocalBroadcastManager.getInstance(context).sendBroadcast(new Intent(ACTION_UPDATE_DATA));
        }
    }