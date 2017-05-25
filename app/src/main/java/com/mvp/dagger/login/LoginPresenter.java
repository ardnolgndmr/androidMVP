package com.mvp.dagger.login;

/**
 * Created by ardenolgundemir on 25/05/2017.
 */

public interface LoginPresenter {

    void setView(LoginView view);

    void validateCredentials(String username, String password);

    void onDestroy();
}
