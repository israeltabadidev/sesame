package com.smoontz.gately.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.smoontz.gately.R;
import com.smoontz.gately.utils.Consts;
import com.smoontz.gately.utils.SimpleTextWatcher;

/**
 * Created by danafridman on 30/07/2016.
 */
public class StepFragment extends Fragment {

    private TextView titleText;
    private TextView descriptionText;
    private EditText editText;
    private ImageView icon;

    private final TextWatcher watcher = new SimpleTextWatcher() {
        @Override
        public void afterTextChanged(Editable s) {
            super.afterTextChanged(s);
//            editText.setEnabled(s.length() > 0);
        }
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.layout_step, container, false);

        titleText = (TextView)v.findViewById(R.id.title);
        editText = (EditText) v.findViewById(R.id.editText);
        icon = (ImageView)v.findViewById(R.id.icon);

        final String key = Consts.Step;
        final int stepNumber = getArguments().getInt(key);

        titleText.setText(Consts.getTitleForStep(stepNumber));
        editText.setHint(Consts.getHintForStep(stepNumber));

        setupIcon(stepNumber);

        editText.addTextChangedListener(watcher);

        editText.requestFocus();

        return v;
    }

    private void setupIcon(int stepNumber) {
        final int iconForStep = Consts.getIconForStep(stepNumber);
        if (iconForStep == 0){
            icon.setVisibility(View.GONE);
        } else {
            icon.setImageResource(iconForStep);
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        editText.removeTextChangedListener(watcher);
    }
}
