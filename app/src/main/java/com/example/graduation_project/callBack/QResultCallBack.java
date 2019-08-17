package com.example.graduation_project.callBack;


import com.example.graduation_project.model.QResult.Qresult;

public interface QResultCallBack {

    void onError(String msg);

    void onSecuess(Qresult qresult);
}
