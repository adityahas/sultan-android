package com.adityahas.sultan.screens.dummies;

import com.adityahas.sultan.screens.onboarding.LogInContract;

/**
 * Created by adityahadi on 05/11/17.
 */

public class DummyFragmentPresenter implements LogInContract.Presenter {

    private final LogInContract.View view;

    public DummyFragmentPresenter(LogInContract.View view) {
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
