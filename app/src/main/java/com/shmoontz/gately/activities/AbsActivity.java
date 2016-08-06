package com.shmoontz.gately.activities;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.WindowManager;

/**
 * Created by nuc on 06/08/16.
 */
public abstract class AbsActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewResId());
        handleWindowFlags();

    }

    private void handleWindowFlags() {


        if (getStatusBarEnum() == StatusbarConfig.Transparent) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            }
        } else if (getStatusBarEnum() == StatusbarConfig.Colored){
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                getWindow().setStatusBarColor(getResources().getColor(getStatusbarColor()));
            }
        }
    }

    public int getStatusbarColor() {
        return 0;
    }

    protected abstract int getContentViewResId();

    public StatusbarConfig getStatusBarEnum(){
        return StatusbarConfig.Normal;
    }
}
