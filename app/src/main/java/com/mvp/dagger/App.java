package com.mvp.dagger;

import android.app.Application;

import com.mvp.dagger.login.LoginModule;

/**
 * Created by ardenolgundemir on 25/05/2017.
 */

public class App extends Application {
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .loginModule(new LoginModule())
                .build();

    }

    public ApplicationComponent getComponent() {
        return component;
    }

}
