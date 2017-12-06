package com.adityahas.sultan.screens.onboarding;

import com.adityahas.sultan.base.BasePresenter;
import com.adityahas.sultan.base.BaseView;

/**
 * Created by adityahadi on 05/11/17.
 */

public class SignupContract {

    interface View extends BaseView<SignupContract.Presenter> {
        void onSignupSuccess();

        void setErrorEmailField();

        void setErrorPasswordField();

        void setValidEmailField();

        void setValidPasswordField();
    }

    interface Presenter extends BasePresenter {
        void doSignup(String email, String password);

        void onSignupSuccess();
    }
}
