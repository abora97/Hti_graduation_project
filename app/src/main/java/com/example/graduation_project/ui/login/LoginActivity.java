package com.example.graduation_project.ui.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.graduation_project.R;
import com.example.graduation_project.ui.home.HomeActivity;
import com.example.graduation_project.ui.splash.SplashActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener, LoginContract.MainView {
    @BindView(R.id.user_id)
    EditText userId;
    @BindView(R.id.user_password)
    EditText userPassword;
    @BindView(R.id.login_bt)
    Button loginBt;
    @BindView(R.id.t_id)
    TextInputLayout tId;
    @BindView(R.id.t_Password)
    TextInputLayout tPassword;
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        loginBt.setOnClickListener(this);
        loginPresenter = new LoginPresenter(this,this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.login_bt:
                loginMethod();
                break;
        }
    }

    private void loginMethod() {
        String id = userId.getText().toString().trim();
        String password = userPassword.getText().toString().trim();
        if (id.isEmpty()) {
            YoYo.with(Techniques.Shake)
                    .duration(300)
                    .repeat(3)
                    .playOn(findViewById(R.id.user_id));
            tId.setError(getString(R.string.required));
            userId.requestFocus();
        } else if (password.isEmpty()) {
            YoYo.with(Techniques.Shake)
                    .duration(300)
                    .repeat(3)
                    .playOn(findViewById(R.id.user_password));
            tPassword.setError(getString(R.string.required));
            userPassword.requestFocus();
        } else {
            loginPresenter.requestDataFromServer(id, password);
        }

    }

    @Override
    public void getToken(String token) {
        Toast.makeText(LoginActivity.this, "R  " + token, Toast.LENGTH_LONG).show();
        startActivity(new Intent(LoginActivity.this, HomeActivity.class));
        finish();
    }

    @Override
    public void getError(String msg) {
        Toast.makeText(LoginActivity.this, "E  " + msg, Toast.LENGTH_LONG).show();
    }
}
