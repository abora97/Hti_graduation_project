package com.example.graduation_project.callBack;

import com.example.graduation_project.model.Complain.Complain;

public interface ComplainCallBack {
    void onError(String msg);

    void onSecuess(Complain complain);
}
