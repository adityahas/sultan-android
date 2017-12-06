package com.adityahas.sultan.di.app;

import android.content.Context;

import com.adityahas.sultan.App;

import dagger.Module;
import dagger.Provides;

/**
 * Created by adityahadi on 12/11/17.
 */

@Module
public class AppModule {
    private App app;

    public AppModule(App app) {
        this.app = app;
    }

    @Provides
    public App provideApplication() {
        return app;
    }

    @Provides
    public Context provideContext() {
        return app;
    }
}
