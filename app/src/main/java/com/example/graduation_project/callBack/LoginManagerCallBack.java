package com.example.graduation_project.callBack;

import com.example.graduation_project.model.loginAdmin.Data;

public interface LoginManagerCallBack {
    void onSecuess(Data response);

    void onError(String msg);
}
