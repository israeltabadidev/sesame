package com.smoontz.sesame.utils;

import com.smoontz.sesame.R;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by danafridman on 30/07/2016.
 */
public class Consts {

    public static final String Step = "step";

    private static final Step step1;
    private static final Step step2;
    private static final Step step3;

    private static final Map<Integer, Step> steps = new HashMap<>();

    static {
        step1 = new Step(R.string.step_1_hint_text,R.string.step_1_title_text,R.string.next,R.string.step_1_desc);
        step2 = new Step(R.string.step_2_hint_text,R.string.step_2_title_text,R.string.next,R.string.step_2_desc);
        step3 = new Step(R.string.step_3_hint_text,R.string.step_3_title_text,R.string.next,R.string.step_3_desc);

        steps.put(1,step1);
        steps.put(2,step2);
        steps.put(3,step3);
    }


    public static int getHintForStep(int anInt) {
        return steps.get(anInt).getHintResId();
    }
}
