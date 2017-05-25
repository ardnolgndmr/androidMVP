package com.mvp.dagger.login;

import com.mvp.BaseView;

/**
 * Created by ardenolgundemir on 25/05/2017.
 */

public interface LoginView extends BaseView {


    //Error
    void setUserNameError();
    void setPasswordError();


    //Success Message
    void showUserSavedMessage();


}
