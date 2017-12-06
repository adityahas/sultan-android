package com.adityahas.sultan.screens.onboarding;

/**
 * Created by adityahadi on 05/11/17.
 */

public class SignupPresenter implements SignupContract.Presenter {

    private final SignupContract.View view;

    public SignupPresenter(SignupContract.View v) {
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
    public void doSignup(String email, String password) {
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

        onSignupSuccess();
    }

    @Override
    public void onSignupSuccess() {
        view.onSignupSuccess();
    }
}
