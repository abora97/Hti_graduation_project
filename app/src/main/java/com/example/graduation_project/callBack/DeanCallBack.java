package com.example.graduation_project.callBack;

import com.example.graduation_project.model.deanDepartment.DeanDepartment;

public interface DeanCallBack {

    void onError(String msg);

    void onSecuess(DeanDepartment deanDepartment);
}
