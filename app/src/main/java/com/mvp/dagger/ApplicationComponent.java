package com.mvp.dagger;


import com.mvp.dagger.login.LoginActivity;
import com.mvp.dagger.login.LoginModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by ardenolgundemir on 25/05/2017.
 */
@Singleton
@Component(modules = {ApplicationModule.class, LoginModule.class})


public interface ApplicationComponent {
    void inject(LoginActivity target);
}
