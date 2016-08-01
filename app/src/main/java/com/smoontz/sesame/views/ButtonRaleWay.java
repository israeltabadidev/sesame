package com.smoontz.sesame.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by danafridman on 01/08/2016.
 */
public class ButtonRaleWay extends Button {
    public ButtonRaleWay(Context context) {
        super(context);
        init();
    }

    public ButtonRaleWay(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ButtonRaleWay(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "Raleway-SemiBold.ttf");
        setTypeface(tf);
    }
}
