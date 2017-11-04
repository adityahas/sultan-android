package com.adityahas.sultan.activities.base;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by adityahadi on 04/11/17.
 */

public abstract class BaseFragment extends Fragment {

    public Fragment getFragment() {
        return this;
    }

    public abstract void getArgs(Bundle bundle);

    public Context getContext() {
        return getActivity();
    }

}
