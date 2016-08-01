package com.smoontz.sesame.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;

import com.smoontz.sesame.R;
import com.smoontz.sesame.utils.Consts;

/**
 * Created by danafridman on 30/07/2016.
 */
public class MainActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_add_new_gate_holder);

        StepFragment fragment = new StepFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(Consts.Step, 1);
        fragment.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.content, fragment).commit();
    }


}
