package com.adityahas.sultan.activities.screens.onboarding;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.adityahas.sultan.R;
import com.adityahas.sultan.activities.base.BaseActivity;
import com.adityahas.sultan.activities.utilities.FragmentUtil;
import com.adityahas.sultan.activities.utilities.Logger;

import butterknife.ButterKnife;

/**
 * Created by adityahadi on 04/11/17.
 */

public class OnBoardingActivity extends BaseActivity {

    Logger logger = new Logger(this);

    public static void start(Context context) {
        Intent intent = new Intent(context, OnBoardingActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        context.startActivity(intent);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);
        ButterKnife.bind(this);

        FragmentUtil.attachFragment(this, R.id.content_frame, OnBoardingFragment.newInstance());
    }


}
