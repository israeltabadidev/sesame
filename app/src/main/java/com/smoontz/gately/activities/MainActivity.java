package com.smoontz.gately.activities;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.smoontz.gately.R;
import com.smoontz.gately.utils.Consts;

/**
 * Created by danafridman on 30/07/2016.
 */
public class MainActivity extends FragmentActivity {

    private int currentStep = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_add_new_gate_holder);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.statusBarColor));
        }
        showNextStep(false);

        findViewById(R.id.action).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentStep <= 3) {
                    showNextStep(true);
                }
            }
        });

    }

    private void showNextStep(boolean animate) {
        StepFragment fragment = new StepFragment();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        bundle.putInt(Consts.Step, currentStep);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content, fragment).addToBackStack(null);
        transaction.commit();
        currentStep++;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (currentStep > 1) {
            currentStep--;
        }
    }
}
