package com.adityahas.sultan.screens.onboarding;

/**
 * Created by adityahadi on 05/11/17.
 */

public class LoginPresenter implements LoginContract.Presenter {

    private final LoginContract.View view;

    public LoginPresenter(LoginContract.View v) {
        view = v;
        view.setPresenter(this);
    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unsubscribe() {

    }

    @Override
    public void doLogin() {
        onLoginSuccess();
    }

    @Override
    public void onLoginSuccess() {
        view.onLoginSuccess();
    }
}
