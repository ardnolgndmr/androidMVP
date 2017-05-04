package com.mvp.login;

/**
 * Created by ardenolgundemir on 04/05/2017.
 */

public class LoginPresenterImpl implements LoginPresenter,LoginInteractor.OnLoginFinishedListener {

    LoginView loginView;
    LoginInteractor loginInteractor;


    public LoginPresenterImpl(LoginView loginView){
        this.loginView = loginView;
        this.loginInteractor = new LoginInteracorImpl();

    }


    @Override
    public void validateCredentials(String username, String password) {
        if (loginView != null){
            loginView.showProgress();
        }
        loginInteractor.login(username,password,this);
    }

    @Override
    public void onDestroy() {
        loginView = null;
    }

    @Override
    public void onUsernameError() {
        if (loginView != null){
            loginView.hideProgress();
            loginView.setUserNameError();
        }
    }

    @Override
    public void onPasswordError() {
        if (loginView != null){
            loginView.hideProgress();
            loginView.setPasswordError();
        }
    }

    @Override
    public void onSuccess() {
        if (loginView != null){
            loginView.hideProgress();
            loginView.setNavigationHome();
        }
    }
}
