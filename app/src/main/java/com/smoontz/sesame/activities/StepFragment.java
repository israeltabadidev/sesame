package com.smoontz.sesame.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
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


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.layout_step, container, false);

        final EditText editText = (EditText) v.findViewById(R.id.editText);
        editText.setHint(Consts.getHintForStep(getArguments().getInt(Consts.Step)));

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                editText.setEnabled(count>0);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        return v;
    }
}
