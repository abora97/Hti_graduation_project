package com.example.graduation_project.ui.subject;

import com.example.graduation_project.callBack.SubjectCallBack;
import com.example.graduation_project.data.remote.ApiCall;
import com.example.graduation_project.model.subject.Data;
import com.example.graduation_project.model.subject.Subject;


public class SubjectPresenter {
    SubjectContract.viewMain viewMain;

    public SubjectPresenter(SubjectContract.viewMain viewMain) {
        this.viewMain = viewMain;
    }

    public void getSubject(String token) {
        ApiCall.getSubjectApi(token, new SubjectCallBack() {

            @Override
            public void onError(String msg) {
                viewMain.showError(msg);
            }

            @Override
            public void onSecuess(Subject subjects) {
                viewMain.showData(subjects);
            }

        });
    }
}
