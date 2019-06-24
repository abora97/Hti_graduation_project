package com.example.graduation_project.data.remote;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.example.graduation_project.callBack.LoginCallBack;
import com.example.graduation_project.callBack.SubjectCallBack;
import com.example.graduation_project.model.login.LoginModel;

import com.example.graduation_project.model.subject.DataSubject;
import com.example.graduation_project.model.subject.SubjectModel;
import com.example.graduation_project.util.Constant;

import java.util.List;

public class ApiCall {
    public static void LoginApi(String id, String password, final LoginCallBack loginCallBack) {
        AndroidNetworking.post(Constant.LOGIN_URL)
                .addBodyParameter(Constant.ID, id)
                .addBodyParameter(Constant.PASSWORD, password)
                .build()
                .getAsObject(LoginModel.class, new ParsedRequestListener<LoginModel>() {
                    @Override
                    public void onResponse(LoginModel response) {
                        loginCallBack.onSecuess(response.getData());
                    }

                    @Override
                    public void onError(ANError anError) {
                        loginCallBack.onError(anError.getErrorDetail());
                    }
                });


    }

    public static void getSubjectApi(String token, final SubjectCallBack subjectCallBack) {
        String Authorization = "Bearer " + token;
        AndroidNetworking.get(Constant.SUBJECT_URL)
                //.addQueryParameter(Constant.AUTHORIZATION,Authorization)
                .addHeaders(Constant.AUTHORIZATION, Authorization)
                .setPriority(Priority.HIGH)
                .build().getAsObject(SubjectModel.class, new ParsedRequestListener<SubjectModel>() {
            @Override
            public void onResponse(SubjectModel response) {
                subjectCallBack.onSecuess(response);
            }

            @Override
            public void onError(ANError anError) {
                subjectCallBack.onError(anError.getErrorDetail());
            }
        });
    }

    public static void getQuestionnaires() {

    }
}
