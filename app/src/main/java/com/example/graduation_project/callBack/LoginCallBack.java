package com.example.graduation_project.callBack;

import com.example.graduation_project.model.login.Data;

public interface LoginCallBack {
    void onSecuess(Data response);

    void onError(String msg);
}
