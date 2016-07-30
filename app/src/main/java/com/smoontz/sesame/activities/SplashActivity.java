package com.smoontz.sesame.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.smoontz.sesame.R;
import com.smoontz.sesame.activities.MainActivity;

public class SplashActivity extends AppCompatActivity {

    Button actionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_splash);

        actionButton = (Button) findViewById(R.id.action);

        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        });

    }
}
