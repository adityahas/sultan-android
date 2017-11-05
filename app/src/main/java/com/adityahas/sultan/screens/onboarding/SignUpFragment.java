package com.adityahas.sultan.screens.onboarding;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.adityahas.sultan.R;
import com.adityahas.sultan.base.BaseFragment;
import com.adityahas.sultan.utilities.FragmentHelper;
import com.adityahas.sultan.utilities.Logger;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by adityahadi on 05/11/17.
 */

public class SignUpFragment extends BaseFragment implements LogInContract.View {

    Logger logger = new Logger(this);

    LogInContract.Presenter presenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getArgs(savedInstanceState);
        presenter = new LogInPresenter(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_signup, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.subscribe();
    }

    @Override
    public void onStop() {
        super.onStop();
        presenter.unsubscribe();
    }

    @Override
    public void setPresenter(LogInContract.Presenter presenter) {

    }

    @Override
    public void getArgs(Bundle bundle) {

    }

    public static SignUpFragment newInstance() {
        SignUpFragment fragment = new SignUpFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @OnClick(R.id.cta_signup)
    public void onSignupClick() {
        logger.error("Signup button clicked");
    }

    @OnClick(R.id.textview_cta_signup)
    public void onLoginClick() {
        FragmentHelper.attachFragment(getActivity(), R.id.content_frame, LogInFragment.newInstance());
    }
}
