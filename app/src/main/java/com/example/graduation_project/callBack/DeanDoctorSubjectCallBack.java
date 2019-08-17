package com.example.graduation_project.callBack;


import com.example.graduation_project.model.DeanDoctorSubject.DeanDoctor;

public interface DeanDoctorSubjectCallBack {

    void onError(String msg);

    void onSecuess(DeanDoctor getDoctorSubject);
}
