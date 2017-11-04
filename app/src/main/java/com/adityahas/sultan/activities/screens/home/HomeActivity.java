package com.adityahas.sultan.activities.screens.home;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.adityahas.sultan.activities.base.BaseActivity;

/**
 * Created by adityahadi on 05/11/17.
 */

public class HomeActivity extends BaseActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, HomeActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
