package com.shmoontz.gately.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.shmoontz.gately.R;

public class SplashActivity extends AbsActivity {

    private Button actionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        actionButton = (Button) findViewById(R.id.action);
        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        });
    }

    @Override
    protected int getContentViewResId() {
        return R.layout.layout_splash;
    }

    @Override
    public StatusbarConfig getStatusBarEnum() {
        return StatusbarConfig.Transparent;
    }
}
