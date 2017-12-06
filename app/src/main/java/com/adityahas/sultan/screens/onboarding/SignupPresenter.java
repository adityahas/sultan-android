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
}
