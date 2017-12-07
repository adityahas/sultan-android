package com.adityahas.sultan.screens.onboarding;

/**
 * Created by adityahadi on 05/11/17.
 */

public class LoginPresenter implements LoginContract.Presenter {

    private final LoginContract.View view;

    public LoginPresenter(LoginContract.View view) {
        this.view = view;
        this.view.setPresenter(this);
    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unsubscribe() {

    }

    @Override
    public void doLogin(String email, String password) {
        email = email.trim();
        password = password.trim();

        view.setValidEmailField();
        if (email.isEmpty()) {
            view.setErrorEmailField();
            return;
        }

        view.setValidPasswordField();
        if (password.isEmpty()) {
            view.setErrorPasswordField();
            return;
        }

        onLoginSuccess();
    }

    @Override
    public void onLoginSuccess() {
        view.onLoginSuccess();
    }
}
