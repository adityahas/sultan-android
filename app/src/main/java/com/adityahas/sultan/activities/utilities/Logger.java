package com.adityahas.sultan.activities.utilities;

import android.util.Log;

import com.adityahas.sultan.BuildConfig;

/**
 * Created by adityahadi on 05/11/17.
 */

public class Logger {

    public String tag = "";

    public Logger(Object clazz) {
        this.tag = clazz.getClass().getSimpleName();
    }

    public Logger(String className) {
        this.tag = className;
    }

    public void debug(String msg) {
        Log.d(BuildConfig.APPLICATION_ID, "[" + tag + "] " + msg);
    }

    public void debug(int msg) {
        debug(String.valueOf(msg));
    }

    public void error(String msg) {
        Log.e(BuildConfig.APPLICATION_ID, "[" + tag + "] " + msg);
    }

    public void error(int msg) {
        error(String.valueOf(msg));
    }
}
