package com.adityahas.sultan;

import android.app.Application;

import com.adityahas.sultan.di.app.AppComponent;
import com.adityahas.sultan.di.app.AppModule;
import com.adityahas.sultan.di.app.DaggerAppComponent;

/**
 * Created by adityahadi on 12/11/17.
 */

public class App extends Application {
    private AppComponent component;

    public void setAppComponent() {
        component = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getComponent() {
        return component;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        this.setAppComponent();
    }
}
