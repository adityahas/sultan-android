package com.adityahas.sultan.screens.onboarding;

/**
 * Created by adityahadi on 05/11/17.
 */

public class SignUpPresenter implements LogInContract.Presenter {

    private final LogInContract.View view;

    public SignUpPresenter(LogInContract.View view) {
        this.view = view;
        this.view.setPresenter(this);
    }

    @Override
    public void subscribe() {

    }

    @Override
    public void unsubscribe() {

    }
}
