package com.example.graduation_project.callBack;

import com.example.graduation_project.model.Complain.Complain;

public interface ComplainCallBackRetrofit {
    void onError(String msg);

    void onSecuess(String complain);
}
