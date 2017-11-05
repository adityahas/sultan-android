package com.adityahas.sultan.screens.dummies;

import com.adityahas.sultan.base.BasePresenter;
import com.adityahas.sultan.base.BaseView;
import com.adityahas.sultan.screens.onboarding.LogInContract;

/**
 * Created by adityahadi on 05/11/17.
 */

public class DummyFragmentContract {

    interface View extends BaseView<LogInContract.Presenter> {

    }

    interface Presenter extends BasePresenter {

    }
}
