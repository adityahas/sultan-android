package com.adityahas.sultan.screens.dummies;

/**
 * Created by adityahadi on 05/11/17.
 */

public class DummyFragmentPresenter implements DummyFragmentContract.Presenter {

    private final DummyFragmentContract.View view;

    public DummyFragmentPresenter(DummyFragmentContract.View view) {
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
