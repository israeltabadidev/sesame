package com.smoontz.sesame.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.smoontz.sesame.R;
import com.smoontz.sesame.utils.Consts;

/**
 * Created by danafridman on 30/07/2016.
 */
public class StepFragment extends Fragment {
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.layout_step, container, false);

        ((EditText)v.findViewById(R.id.editText)).setHint(Consts.getHintForStep(getArguments().getInt(Consts.Step)));

        return v;
    }
}
