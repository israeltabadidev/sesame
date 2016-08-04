package com.shmoontz.gately.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EditText;

import com.shmoontz.gately.R;

/**
 * Created by danafridman on 01/08/2016.
 */
public class EditTextRalewayRegular extends EditText {


    public EditTextRalewayRegular(Context context) {
        super(context);
        init();
    }

    public EditTextRalewayRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public EditTextRalewayRegular(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public EditTextRalewayRegular(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "Raleway-Regular.ttf");
        setTypeface(tf);
        getBackground().setColorFilter(getContext().getResources().getColor(R.color.primary), PorterDuff.Mode.SRC_IN);
    }
}
