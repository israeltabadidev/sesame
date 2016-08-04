package com.shmoontz.gately.utils;

/**
 * Created by danafridman on 30/07/2016.
 */
public class Step {
    private int hintResId;
    private int titleResId;
    private int nextResId;
    private int descResId;
    private int iconResId;

    public Step(int hintResId, int titleResId, int nextResId, int descResId, int iconResId) {
        this.hintResId = hintResId;
        this.titleResId = titleResId;
        this.nextResId = nextResId;
        this.descResId = descResId;
        this.iconResId = iconResId;
    }

    public int getHintResId() {
        return hintResId;
    }


    public int getTitleResId() {
        return titleResId;
    }


    public int getNextResId() {
        return nextResId;
    }


    public int getDescResId() {
        return descResId;
    }


    public int getIconResId() {
        return iconResId;
    }

}
