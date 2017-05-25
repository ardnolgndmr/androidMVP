package com.mvp.dagger.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.mvp.R;
import com.mvp.dagger.App;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by ardenolgundemir on 25/05/2017.
 */

public class LoginActivity extends AppCompatActivity implements LoginView {

    @BindView(R.id.username)
    EditText username;
    @BindView(R.id.password)
    EditText password;
    @BindView(R.id.button)
    Button button;
    @BindView(R.id.progress)
    ProgressBar progress;

    @Inject
    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        ((App) getApplication()).getComponent().inject(this);
    }

    @Override
    protected void onDestroy() {
        loginPresenter.onDestroy();
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        loginPresenter.setView(this);
    }

    @Override
    public void showProgress() {
        progress.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progress.setVisibility(View.GONE);
    }


    @Override
    public void setUserNameError() {
        username.setError(getString(R.string.username_error));
    }

    @Override
    public void setPasswordError() {
        password.setError(getString(R.string.password_error));
    }


    @Override
    public void showUserSavedMessage() {
        Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_LONG).show();
    }

    @OnClick(R.id.button)
    public void onViewClicked() {
        loginPresenter.validateCredentials(username.getText().toString(), password.getText().toString());
    }
}
