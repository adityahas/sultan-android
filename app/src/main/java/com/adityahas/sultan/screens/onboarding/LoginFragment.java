package com.adityahas.sultan.screens.onboarding;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.adityahas.sultan.R;
import com.adityahas.sultan.base.BaseFragment;
import com.adityahas.sultan.screens.home.HomeActivity;
import com.adityahas.sultan.utilities.Logger;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by adityahadi on 05/11/17.
 */

public class LoginFragment extends BaseFragment implements LoginContract.View {

    Logger logger = new Logger(this);

    LoginContract.Presenter presenter;

    @BindView(R.id.text_input_layout_email)
    TextInputLayout textInputLayoutEmail;
    @BindView(R.id.text_input_layout_password)
    TextInputLayout textInputLayoutPassword;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getArgs(savedInstanceState);

        // Create the presenter
        new LoginPresenter(this);
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
    public void setPresenter(LoginContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void getArgs(Bundle bundle) {

    }

    public static LoginFragment newInstance() {
        LoginFragment fragment = new LoginFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @OnClick(R.id.cta_login)
    public void onLoginClick() {
        presenter.doLogin(
                textInputLayoutEmail.getEditText().getText().toString(),
                textInputLayoutPassword.getEditText().getText().toString()
        );
    }

    @Override
    public void onLoginSuccess() {
        HomeActivity.start(getContext());
        getActivity().finish();
    }

    @Override
    public void setErrorEmailField() {
        textInputLayoutEmail.setError(getResources().getString(R.string.error_login_invalid_email));
        textInputLayoutEmail.setErrorEnabled(true);
    }

    @Override
    public void setErrorPasswordField() {
        textInputLayoutPassword.setError(getResources().getString(R.string.error_login_invalid_password));
        textInputLayoutPassword.setErrorEnabled(true);
    }

    @Override
    public void setValidEmailField() {
        textInputLayoutEmail.setErrorEnabled(false);
    }

    @Override
    public void setValidPasswordField() {
        textInputLayoutPassword.setErrorEnabled(false);
    }
}
