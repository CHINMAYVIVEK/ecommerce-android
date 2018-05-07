package com.allandroidprojects.ecomsample.utility;

import android.content.Context;
import android.content.SharedPreferences;


public class Preference {

    private static SharedPreferences preferences;

    public static SharedPreferences getPreference(Context con) {
        if (preferences == null) {
            preferences = con.getSharedPreferences("appPreference",Context.MODE_PRIVATE);
        }
        return preferences;
    }

    public static void save(Context context, String key, int value) {
        getPreference(context).edit().putInt(key, value).commit();
    }

    public static void save(Context context, String key, long value) {
        getPreference(context).edit().putLong(key, value).commit();
    }


    public static void save(Context context, String key, String value) {
        getPreference(context).edit().putString(key, value).commit();
    }

    public static void save(Context context, String key, Boolean status) {
        getPreference(context).edit().putBoolean(key, status).commit();
    }

    public static String getString(Context context, String key) {
        return getPreference(context).getString(key, "");
    }


    public static int getInt(Context context, String key) {
        return getPreference(context).getInt(key, 0);
    }
    public static long getLong(Context context, String key) {
        return getPreference(context).getLong(key, 0);
    }


    public static boolean getBoolean(Context context, String key) {
        return getPreference(context).getBoolean(key, false);
    }



}

