package com.mvp.dagger.login;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ardenolgundemir on 25/05/2017.
 */
@Module
public class LoginModule {



    @Provides
    public LoginPresenter provideLoginPresenter(){
        return new LoginPresenterImpl();
    }
}
