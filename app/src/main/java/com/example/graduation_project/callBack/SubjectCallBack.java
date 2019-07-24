package com.example.graduation_project.callBack;



import com.example.graduation_project.model.subject.Data;
import com.example.graduation_project.model.subject.Subject;


public interface SubjectCallBack {


    void onError(String msg);

    void onSecuess(Subject subjects);
}
