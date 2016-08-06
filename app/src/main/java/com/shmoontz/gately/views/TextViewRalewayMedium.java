package com.shmoontz.gately.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by danafridman on 01/08/2016.
 */
public class TextViewRalewayMedium extends TextView {
    public TextViewRalewayMedium(Context context) {
        this(context, null);
    }

    public TextViewRalewayMedium(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TextViewRalewayMedium(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "Raleway-Medium.ttf");
        setTypeface(tf);
    }
}
