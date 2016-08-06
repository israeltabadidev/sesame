package com.shmoontz.gately.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shmoontz.gately.R;

/**
 * Created by danafridman on 30/07/2016.
 */
public class FinalStepFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.layout_final_step, container, false);



        return v;
    }

}
