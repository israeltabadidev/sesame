package com.shmoontz.gately.activities;

import android.app.Application;

/**
 * Created by nuc on 05/08/16.
 */
public class GatelyApp extends Application {

    private static final String NUMBER_OF_GATES = "numberOfGates";
    private static final String PREF_NAME = "gately_prefs";

    public int getNumberOfGates() {
        return getSharedPreferences(PREF_NAME,MODE_PRIVATE).getInt(NUMBER_OF_GATES,0);
    }




}

