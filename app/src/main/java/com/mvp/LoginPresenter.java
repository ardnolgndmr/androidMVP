package com.mvp;

/**
 * Created by ardenolgundemir on 04/05/2017.
 */

public interface LoginPresenter {

    void validateCredentials(String username, String password);

    void onDestroy();
}
