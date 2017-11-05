package com.adityahas.sultan.screens.onboarding;

/**
 * Created by adityahadi on 04/11/17.
 */

public class OnBoardingPresenter implements OnBoardingContract.Presenter {

    private OnBoardingContract.View view;

    public OnBoardingPresenter(OnBoardingContract.View view) {
        this.view = view;
        this.view.setPresenter(this);
    }

    @Override
    public void subscribe() {
        if (isAlreadyLoggedIn())
            view.openHomeActivity();
    }

    @Override
    public void unsubscribe() {

    }

    private boolean isAlreadyLoggedIn() {
        return false;
    }

    @Override
    public void openLoginFragment() {
        view.openLoginFragment();
    }

    @Override
    public void openSignupFragment() {
        view.openSignupFragment();
    }
}
