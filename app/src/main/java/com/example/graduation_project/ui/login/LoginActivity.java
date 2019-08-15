package com.example.graduation_project.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.graduation_project.R;
import com.example.graduation_project.callBack.LoginCallBack;
import com.example.graduation_project.callBack.LoginManagerCallBack;
import com.example.graduation_project.data.remote.ApiCall;
import com.example.graduation_project.model.login.Data;
import com.example.graduation_project.model.sql.DataBaseUserHelper;
import com.example.graduation_project.ui.department.DepartmentActivity;
import com.example.graduation_project.ui.home.HomeActivity;

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
    @BindView(R.id.tv_login_type)
    TextView tvLoginType;
    private LoginPresenter loginPresenter;

    DataBaseUserHelper dataBaseCartHelper;
    String loginType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        loginBt.setOnClickListener(this);
        loginPresenter = new LoginPresenter(this, this);

        loginType = getIntent().getStringExtra("loginType");

//        if (loginType.equals("student")) {
//            tvLoginType.setText("student login");
//        } else if (loginType.equals("manager")) {
//            tvLoginType.setText("manager login");
//        }

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

            if (loginType.equals("student")) {
                loginStudent(id, password);
            } else if (loginType.equals("manager")) {
                loginManager(id, password);
            } else if (loginType.equals("dean")) {
                loginDean(id, password);
            }
        }

    }

    private void loginDean(String id, String password) {
        dataBaseCartHelper = new DataBaseUserHelper(this);


        ApiCall.DeanManager(id, password, new LoginManagerCallBack() {

            @Override
            public void onSecuess(com.example.graduation_project.model.loginAdmin.Data response) {
                String userToken = response.getData().getToken();
                int userID = response.getData().getManager().getId();
                String userName = response.getData().getManager().getName();
                String userGpa = "2";
                String userDeptID = (String) response.getData().getManager().getDepartmentId();
                String managerRole = response.getData().getManager().getRole();

                dataBaseCartHelper.insertDataUser(userToken, userID, userName, userGpa, userDeptID, managerRole);

                startActivity(new Intent(LoginActivity.this, DepartmentActivity.class));
                finish();
            }


            @Override
            public void onError(String msg) {
                Toast.makeText(LoginActivity.this, "E  " + msg, Toast.LENGTH_LONG).show();
            }
        });

    }


    private void loginManager(String id, String password) {


        dataBaseCartHelper = new DataBaseUserHelper(this);


        ApiCall.LoginManager(id, password, new LoginManagerCallBack() {

            @Override
            public void onSecuess(com.example.graduation_project.model.loginAdmin.Data response) {
                String userToken = response.getData().getToken();
                int userID = response.getData().getManager().getId();
                String userName = response.getData().getManager().getName();
                String userGpa = "2";
                String userDeptID = (String) response.getData().getManager().getDepartmentId();
                String managerRole = response.getData().getManager().getRole();

                dataBaseCartHelper.insertDataUser(userToken, userID, userName, userGpa, userDeptID, managerRole);

                startActivity(new Intent(LoginActivity.this, DepartmentActivity.class));
                finish();
            }


            @Override
            public void onError(String msg) {
                Toast.makeText(LoginActivity.this, "E  " + msg, Toast.LENGTH_LONG).show();
            }
        });

    }


    private void loginStudent(String id, String password) {


        dataBaseCartHelper = new DataBaseUserHelper(this);


        ApiCall.LoginApi(id, password, new LoginCallBack() {
            @Override
            public void onSecuess(Data response) {
                String userToken = response.getData().getToken();
                int userID = Integer.parseInt(response.getData().getUser().getCId());
                String userName = response.getData().getUser().getName();
                String userGpa = response.getData().getUser().getGpa();
                String userDeptID = response.getData().getUser().getDepartmentId();


                dataBaseCartHelper.insertDataUser(userToken, userID, userName, userGpa, userDeptID, "student");

                startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                finish();
            }

            @Override
            public void onError(String msg) {
                Toast.makeText(LoginActivity.this, "Invalid user name or password.", Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public void getToken(String token) {
        // Toast.makeText(LoginActivity.this, "R  " + token, Toast.LENGTH_LONG).show();
        startActivity(new Intent(LoginActivity.this, HomeActivity.class));
        finish();
    }

    @Override
    public void getError(String msg) {
        Toast.makeText(LoginActivity.this, "E  " + msg, Toast.LENGTH_LONG).show();
    }
}
