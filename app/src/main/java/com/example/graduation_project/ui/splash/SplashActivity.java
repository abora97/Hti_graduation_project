package com.example.graduation_project.ui.splash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.graduation_project.R;
import com.example.graduation_project.model.sql.DataBaseUserHelper;
import com.example.graduation_project.model.sql.userSql;
import com.example.graduation_project.ui.base.BaseActivity;
import com.example.graduation_project.ui.department.DepartmentActivity;
import com.example.graduation_project.ui.home.HomeActivity;
import com.example.graduation_project.ui.login.LoginActivity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SplashActivity extends BaseActivity implements SplashContract.launch, View.OnClickListener {

    @BindView(R.id.bu_student)
    Button buStudent;
    @BindView(R.id.bu_manager)
    Button buManager;

    private SplashPresenter splashPresenter;
    public static String DefaultLang;
    DataBaseUserHelper dataBaseCartHelper;
    List<userSql> list;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);
        splashPresenter = new SplashPresenter(this, this);

        dataBaseCartHelper = new DataBaseUserHelper(this);
        list = dataBaseCartHelper.getAllRecord();
        splashPresenter.changeLanguage();
        splashPresenter.initialization();


        buManager.setOnClickListener(this);
        buStudent.setOnClickListener(this);
    }


    @Override
    public void changeLanguage() {
        Toast.makeText(this, "test splash ", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void startActivityMethod() {

        if (list.size() < 1) {
            //ddddd
        } else {
            if (list.get(0).getRole().equals("student")) {
                startActivity(new Intent(SplashActivity.this, HomeActivity.class));
                finish();
            } else {
                startActivity(new Intent(SplashActivity.this, DepartmentActivity.class));
                finish();
            }
        }


//        if (list.size() < 1) {
//
//            startActivity(new Intent(SplashActivity.this, LoginActivity.class));
//           finish();
//        } else {
//            startActivity(new Intent(SplashActivity.this, HomeActivity.class));
//            finish();
//        }

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        splashPresenter.detachView();
    }

    @Override
    public void onClick(View view) {
        intent = new Intent(SplashActivity.this, LoginActivity.class);

        switch (view.getId()) {
            case R.id.bu_manager:
              //  Toast.makeText(this, "manager bu", Toast.LENGTH_SHORT).show();
                intent.putExtra("loginType", "manager");
                startActivity(intent);

                break;
            case R.id.bu_student:
           //     Toast.makeText(this, "student bu", Toast.LENGTH_SHORT).show();
                intent.putExtra("loginType", "student");
                startActivity(intent);

                break;
        }
    }
}
