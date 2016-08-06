package com.shmoontz.gately.utils;

import android.util.Log;

/**
 * Created by nuc on 06/08/16.
 */
public class LogUtils {

    private static final String TAG = LogUtils.class.getSimpleName();

    public static void logd(String msg){
        Log.d(TAG, msg);
    }
    public static void loge(String msg){
        Log.e(TAG, msg);
    }
    public static void logi(String msg){
        Log.i(TAG, msg);
    }
    public static void logw(String msg){
        Log.w(TAG, msg);
    }

}
