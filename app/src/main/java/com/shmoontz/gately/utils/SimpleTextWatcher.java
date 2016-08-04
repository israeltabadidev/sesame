package com.shmoontz.gately.utils;

import android.text.Editable;
import android.text.TextWatcher;

/**
 * Created by danafridman on 01/08/2016.
 */
public abstract class SimpleTextWatcher implements TextWatcher {
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}
