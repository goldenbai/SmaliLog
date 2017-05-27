package com.android.samlilog;

import android.util.Log;

/**
 * Created by baiyf on 17-5-27.
 */

public class SmaliLog {

    private static final String TAG = "SmaliLog";


    // public methods

    public static void printStack() {
        try {
            throwUpException();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printLog(String msg) {
        Log.e(TAG, msg);
    }


    // private methods

    private static void throwUpException() throws Exception {
        throw new Exception("H.throwException");
    }

}
