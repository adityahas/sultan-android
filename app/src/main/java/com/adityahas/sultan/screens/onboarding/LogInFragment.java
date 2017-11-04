package com.adityahas.sultan.screens.onboarding;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.adityahas.sultan.R;
import com.adityahas.sultan.base.BaseFragment;
import com.adityahas.sultan.utilities.FragmentUtil;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by adityahadi on 05/11/17.
 */

public class LogInFragment extends BaseFragment implements LogInContract.View {

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

        View view = inflater.inflate(R.layout.fragment_login, container, false);
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

    public static LogInFragment newInstance() {
        LogInFragment fragment = new LogInFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @OnClick(R.id.cta_login)
    public void onButtonLoginClick() {
        FragmentUtil.attachFragment(getActivity(), R.id.content_frame, LogInFragment.newInstance(), true);
    }
}