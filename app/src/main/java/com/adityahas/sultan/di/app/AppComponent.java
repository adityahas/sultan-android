package com.adityahas.sultan.di.app;

import android.content.Context;

import com.adityahas.sultan.App;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by adityahadi on 12/11/17.
 */

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(App app);

    Context contex();

    App app();
}
