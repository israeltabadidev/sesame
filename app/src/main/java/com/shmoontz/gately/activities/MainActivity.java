package com.shmoontz.gately.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.TextView;

import com.shmoontz.gately.R;
import com.shmoontz.gately.utils.Consts;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by danafridman on 30/07/2016.
 */
public class MainActivity extends AbsActivity {

    private static final long ANIM_DURATION = 150;
    private int currentStep = 1;
    private TextView textViewToolbar;
    private View s1, s2, s3, s4;
    private Map map = new HashMap(4);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        s1 = findViewById(R.id.s1);
        s2 = findViewById(R.id.s2);
        s3 = findViewById(R.id.s3);
        s4 = findViewById(R.id.s4);

        map.put(1, s1);
        map.put(2, s2);
        map.put(3, s3);
        map.put(4, s4);


        showNextStep();
        findViewById(R.id.action).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentStep <= Consts.steps.size()) {
                    showNextStep();
                } else {
                    showFinalStep();
                }
            }
        });
    }

    private void showFinalStep() {
        Fragment fragment = new FinalStepFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content, fragment).addToBackStack(null);
        transaction.commit();

        s3.animate().scaleX(1f).scaleY(1f).setDuration(ANIM_DURATION);
        s4.animate().scaleX(2f).scaleY(2f).setDuration(ANIM_DURATION);
    }

    private void showNextStep() {
        StepFragment fragment = new StepFragment();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        bundle.putInt(Consts.Step, currentStep);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.content, fragment).addToBackStack(null);
        transaction.commit();

        switch (currentStep) {
            case 2:
                s1.animate().scaleX(0.5f).scaleY(0.5f).setDuration(ANIM_DURATION);
                s2.animate().scaleX(2f).scaleY(2f).setDuration(ANIM_DURATION);
                break;
            case 3:
                s2.animate().scaleX(1f).scaleY(1f).setDuration(ANIM_DURATION);
                s3.animate().scaleX(2f).scaleY(2f).setDuration(ANIM_DURATION);
                break;
            default:
                break;
        }

        currentStep++;
    }

    @Override
    public void onBackPressed() {
        switch (currentStep) {
            case 3:
                s3.animate().scaleX(1f).scaleY(1f).setDuration(ANIM_DURATION);
                s2.animate().scaleX(2f).scaleY(2f).setDuration(ANIM_DURATION);
                break;
            case 2:
                s2.animate().scaleX(1f).scaleY(1f).setDuration(ANIM_DURATION);
                s1.animate().scaleX(1f).scaleY(1f).setDuration(ANIM_DURATION);
                break;
            case 4:
                s4.animate().scaleX(1f).scaleY(1f).setDuration(ANIM_DURATION);
                s3.animate().scaleX(1f).scaleY(1f).setDuration(ANIM_DURATION);
                break;
            default:
                break;
        }

        if (currentStep > 1) {
            currentStep--;
            super.onBackPressed();
        } else {
            finish();
        }
    }


    @Override
    protected int getContentViewResId() {
        return R.layout.layout_add_new_gate_holder;
    }

    @Override
    public int getStatusbarColor() {
        return R.color.statusBarColor;
    }
}
