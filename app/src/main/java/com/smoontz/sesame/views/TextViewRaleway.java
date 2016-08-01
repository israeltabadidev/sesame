package com.smoontz.sesame.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by danafridman on 01/08/2016.
 */
public class TextViewRaleway extends TextView {
    public TextViewRaleway(Context context) {
        this(context, null);
    }

    public TextViewRaleway(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TextViewRaleway(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "Raleway-SemiBold.ttf");
        setTypeface(tf);
    }
}
