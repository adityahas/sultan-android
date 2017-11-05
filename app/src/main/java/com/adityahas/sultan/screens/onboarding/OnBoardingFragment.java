package com.adityahas.sultan.screens.onboarding;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.adityahas.sultan.R;
import com.adityahas.sultan.base.BaseFragment;
import com.adityahas.sultan.screens.home.HomeActivity;
import com.adityahas.sultan.utilities.FragmentHelper;
import com.adityahas.sultan.utilities.Logger;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by adityahadi on 04/11/17.
 */

public class OnBoardingFragment extends BaseFragment implements OnBoardingContract.View {

    Logger logger = new Logger(this);

    OnBoardingContract.Presenter presenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getArgs(savedInstanceState);
        presenter = new OnBoardingPresenter(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_onboarding, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.subscribe();
    }

    @Override
    public void onPause() {
        super.onPause();
        presenter.unsubscribe();
    }

    @Override
    public void getArgs(Bundle bundle) {

    }

    public static OnBoardingFragment newInstance() {
        OnBoardingFragment fragment = new OnBoardingFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void setPresenter(OnBoardingContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @OnClick(R.id.button_cta_login)
    public void onLoginClick() {
        presenter.openLoginFragment();
    }

    @OnClick(R.id.textview_cta_signup)
    public void onSignupClick() {
        presenter.openSignupFragment();
    }

    @Override
    public void openHomeActivity() {
        HomeActivity.start(getContext());
    }

    @Override
    public void openLoginFragment() {
        FragmentHelper.attachFragment(getActivity(), R.id.content_frame, LogInFragment.newInstance());
    }

    @Override
    public void openSignupFragment() {
        FragmentHelper.attachFragment(getActivity(), R.id.content_frame, SignUpFragment.newInstance());
    }
}
