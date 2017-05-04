package com.mvp.login;

import com.mvp.BaseView;

/**
 * Created by ardenolgundemir on 04/05/2017.
 */

public interface LoginView extends BaseView {

    void setUserNameError();

    void setPasswordError();

    void setNavigationHome();
}
