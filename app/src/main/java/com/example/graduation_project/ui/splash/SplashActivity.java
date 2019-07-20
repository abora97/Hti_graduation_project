package com.example.graduation_project.ui.splash;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.graduation_project.R;
import com.example.graduation_project.model.sql.DataBaseUserHelper;
import com.example.graduation_project.model.sql.userSql;
import com.example.graduation_project.ui.base.BaseActivity;
import com.example.graduation_project.ui.department.DepartmentActivity;
import com.example.graduation_project.ui.home.HomeActivity;
import com.example.graduation_project.ui.login.LoginActivity;


import java.util.List;

public class SplashActivity extends BaseActivity implements SplashContract.launch {
    private SplashPresenter splashPresenter;
    public static String DefaultLang;
    DataBaseUserHelper dataBaseCartHelper;
    List<userSql> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashPresenter = new SplashPresenter(this, this);

        dataBaseCartHelper = new DataBaseUserHelper(this);
        list = dataBaseCartHelper.getAllRecord();
        splashPresenter.changeLanguage();
        splashPresenter.initialization();


    }


    @Override
    public void changeLanguage() {
        Toast.makeText(this, "test splash ", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void startActivityMethod() {
//        if (list.size() < 1) {
//            startActivity(new Intent(SplashActivity.this, LoginActivity.class));
//            finish();
//        }  else {
//            startActivity(new Intent(SplashActivity.this, HomeActivity.class));
//            finish();
//        }
        startActivity(new Intent(SplashActivity.this, DepartmentActivity.class));
        finish();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        splashPresenter.detachView();
    }
}
