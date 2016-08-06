package com.shmoontz.gately.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by danafridman on 01/08/2016.
 */
public class TextViewRalewayRegular extends TextView {
    public TextViewRalewayRegular(Context context) {
        this(context, null);
    }

    public TextViewRalewayRegular(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TextViewRalewayRegular(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "Raleway-Regular.ttf");
        setTypeface(tf);
    }
}
