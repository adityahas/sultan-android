package com.adityahas.sultan.screens;

import android.os.Bundle;

import com.adityahas.sultan.R;
import com.adityahas.sultan.base.BaseActivity;
import com.adityahas.sultan.screens.onboarding.OnBoardingActivity;
import com.adityahas.sultan.utilities.Logger;

public class LaunchScreenActivity extends BaseActivity {

    Logger logger = new Logger(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next();
    }

    private void next() {
        finish();
        OnBoardingActivity.start(this);
    }
}
