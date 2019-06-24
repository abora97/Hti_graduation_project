package com.example.graduation_project.callBack;



import com.example.graduation_project.model.subject.SubjectModel;

public interface SubjectCallBack {


    void onError(String msg);

    void onSecuess(SubjectModel subjects);
}
