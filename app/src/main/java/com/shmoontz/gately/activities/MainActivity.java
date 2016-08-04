package com.shmoontz.gately.activities;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.TextView;

import com.shmoontz.gately.R;
import com.shmoontz.gately.utils.Consts;

/**
 * Created by danafridman on 30/07/2016.
 */
public class MainActivity extends FragmentActivity {

    private int currentStep = 1;
    private TextView textViewToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_add_new_gate_holder);

        textViewToolbar = (TextView) findViewById(R.id.toolbarText);
        updateToolbar();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.statusBarColor));
        }

        showNextStep();
        findViewById(R.id.action).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentStep <= Consts.steps.size()) {
                    showNextStep();
                }
            }
        });
    }

    private void updateToolbar() {
        textViewToolbar.setText(getString(R.string.gate_details) + " " + String.valueOf(currentStep));
    }

    private void showNextStep() {
        updateToolbar();

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
        if (currentStep > 1) {
            currentStep--;
            updateToolbar();
            super.onBackPressed();
        } else {
            finish();
        }
    }
}
