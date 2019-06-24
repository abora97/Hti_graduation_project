package com.example.graduation_project.ui.login;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

import com.example.graduation_project.callBack.LoginCallBack;
import com.example.graduation_project.data.remote.ApiCall;
import com.example.graduation_project.model.login.LoginData;
import com.example.graduation_project.model.sql.DataBaseUserHelper;
import com.example.graduation_project.model.sql.userSql;
import com.example.graduation_project.ui.base.BasePresenter;
import com.example.graduation_project.util.Constant;

import java.util.List;

public class LoginPresenter extends BasePresenter implements LoginContract.presenter {
    private LoginContract.MainView mainView;
    //private LoginContract.GetNoticeIntractor getNoticeIntractor;
    private Context context;
    DataBaseUserHelper dataBaseCartHelper;



    public LoginPresenter(LoginContract.MainView mainView) {
        this.mainView = mainView;
        // this.getNoticeIntractor = getNoticeIntractor;
    }

    public LoginPresenter(LoginContract.MainView mainView, Context context) {
        this.mainView = mainView;
        this.context = context;
    }

    @Override
    public void onDestroy() {
        mainView = null;
    }

    @Override
    public void requestDataFromServer(String id, String password) {

        dataBaseCartHelper = new DataBaseUserHelper(context);


        ApiCall.LoginApi(id, password, new LoginCallBack() {
            @Override
            public void onSecuess(LoginData response) {

                dataBaseCartHelper.insertDataUser(response.getData().getToken(),response.getData().getUser().getCId());
                mainView.getToken(response.getData().getToken());
            }

            @Override
            public void onError(String msg) {
                mainView.getError(msg);
            }
        });
    }
}
