package com.example.graduation_project.callBack;

import com.example.graduation_project.model.DoctorSubject.GetDoctorSubject;

public interface DoctorSubjectCallBack {

    void onError(String msg);

    void onSecuess(GetDoctorSubject getDoctorSubject);
}
