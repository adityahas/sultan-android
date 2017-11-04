package com.adityahas.sultan.base;

import android.content.Context;

/**
 * Created by adityahadi on 04/11/17.
 */

public interface BaseView<T> {
    void setPresenter(T presenter);

    Context getContext();
}
