package com.adityahas.sultan.screens.onboarding;

import com.adityahas.sultan.base.BasePresenter;
import com.adityahas.sultan.base.BaseView;

/**
 * Created by adityahadi on 05/11/17.
 */

public interface LoginContract {

    interface View extends BaseView<Presenter> {
        void onLoginSuccess();

        void setErrorEmailField();

        void setErrorPasswordField();

        void setValidEmailField();

        void setValidPasswordField();
    }

    interface Presenter extends BasePresenter {
        void doLogin(String email, String password);
        void onLoginSuccess();
    }
}
