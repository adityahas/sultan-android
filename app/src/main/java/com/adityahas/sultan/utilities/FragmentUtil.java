package com.adityahas.sultan.utilities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by adityahadi on 04/11/17.
 */

public class FragmentUtil {

    static Logger logger = new Logger("FragmentUtil");

    public static void attachFragment(
            FragmentActivity fragmentActivity,
            int containerViewId,
            Fragment fragment
    ) {
        attachFragment(fragmentActivity, containerViewId, fragment, false);
    }

    public static void attachFragment(
            FragmentActivity fragmentActivity,
            int containerViewId,
            Fragment fragment,
            boolean clearBackStack
    ) {

        String fragmentTAG = fragment.getClass().getSimpleName();

        FragmentManager fragmentManager = fragmentActivity.getSupportFragmentManager();

        if (clearBackStack) {
            for (int i = 0; i < fragmentManager.getBackStackEntryCount(); i++) {
                fragmentManager.popBackStack();
            }
        }

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if (fragmentManager.findFragmentByTag(fragmentTAG) == null) {
            // logger.error("Fragment is not added, add it: " + fragmentTAG);
            fragmentTransaction.replace(containerViewId, fragment, fragmentTAG);
            fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            fragmentTransaction.addToBackStack(fragmentTAG);
            fragmentTransaction.commit();
        } else {
            // logger.error("Fragment already added, show it");
            fragmentTransaction.show(fragment);
            fragmentTransaction.commit();
        }
    }

    public void removeFragmentFromBackStack(FragmentActivity fragmentActivity, String fragmentTAG) {
        FragmentManager fragmentManager = fragmentActivity.getSupportFragmentManager();
        fragmentManager.popBackStack(fragmentTAG, FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }
}
