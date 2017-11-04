package com.adityahas.sultan.activities.screens.onboarding;

import com.adityahas.sultan.activities.base.BasePresenter;
import com.adityahas.sultan.activities.base.BaseView;

/**
 * Created by adityahadi on 04/11/17.
 */

public interface OnBoardingContract {

    interface View extends BaseView<Presenter> {
        void openHomeActivity();

        void openLogInFragment();
    }

    interface Presenter extends BasePresenter {
        void openLogInFragment();
    }
}
