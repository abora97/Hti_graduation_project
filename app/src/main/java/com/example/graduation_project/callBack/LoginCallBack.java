package com.example.graduation_project.callBack;

import com.example.graduation_project.model.login.LoginData;

public interface LoginCallBack {
    void onSecuess(LoginData response);

    void onError(String msg);
}
