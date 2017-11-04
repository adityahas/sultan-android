package com.adityahas.sultan.base;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by adityahadi on 04/11/17.
 */

public abstract class BaseActivity extends AppCompatActivity {
    public Context getContext() {
        return this;
    }
}
