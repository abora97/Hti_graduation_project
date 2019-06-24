package com.example.graduation_project.ui.home;

import com.example.graduation_project.callBack.SubjectCallBack;
import com.example.graduation_project.data.remote.ApiCall;
import com.example.graduation_project.model.subject.DataSubject;
import com.example.graduation_project.model.subject.SubjectModel;

public class HomePresenter implements HomeContract.presenter {

    HomeContract.viewMain viewMain;

    public HomePresenter(HomeContract.viewMain viewMain) {
        this.viewMain = viewMain;
    }



}
