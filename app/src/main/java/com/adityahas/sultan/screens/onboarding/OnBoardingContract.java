package com.adityahas.sultan.screens.onboarding;

import com.adityahas.sultan.base.BasePresenter;
import com.adityahas.sultan.base.BaseView;

/**
 * Created by adityahadi on 04/11/17.
 */

public interface OnBoardingContract {

    interface View extends BaseView<Presenter> {
        void openHomeActivity();

        void openLoginFragment();

        void openSignupFragment();
    }

    interface Presenter extends BasePresenter {
        void openLoginFragment();

        void openSignupFragment();
    }
}
