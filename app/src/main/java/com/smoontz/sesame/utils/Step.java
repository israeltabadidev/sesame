package com.smoontz.sesame.utils;

/**
 * Created by danafridman on 30/07/2016.
 */
public class Step {
    private int hintResId;
    private int titleResId;
    private int nextResId;
    private int descResId;

    public Step(int hintResId, int titleResId, int nextResId, int descResId) {
        this.hintResId = hintResId;
        this.titleResId = titleResId;
        this.nextResId = nextResId;
        this.descResId = descResId;
    }

    public int getHintResId() {
        return hintResId;
    }

    public void setHintResId(int hintResId) {
        this.hintResId = hintResId;
    }

    public int getTitleResId() {
        return titleResId;
    }

    public void setTitleResId(int titleResId) {
        this.titleResId = titleResId;
    }

    public int getNextResId() {
        return nextResId;
    }

    public void setNextResId(int nextResId) {
        this.nextResId = nextResId;
    }

    public int getDescResId() {
        return descResId;
    }

    public void setDescResId(int descResId) {
        this.descResId = descResId;
    }
}
