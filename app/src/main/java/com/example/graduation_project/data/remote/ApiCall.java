package com.example.graduation_project.data.remote;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.example.graduation_project.callBack.ComplainCallBack;
import com.example.graduation_project.callBack.LoginCallBack;
import com.example.graduation_project.callBack.SubjectCallBack;
import com.example.graduation_project.model.Complain.Complain;
import com.example.graduation_project.model.login.Login;

import com.example.graduation_project.model.subject.Data;

import com.example.graduation_project.model.subject.Subject;
import com.example.graduation_project.util.Constant;

import java.util.List;

public class ApiCall {
    public static void LoginApi(String id, String password, final LoginCallBack loginCallBack) {
        AndroidNetworking.post(Constant.LOGIN_URL)
                .addBodyParameter(Constant.ID, id)
                .addBodyParameter(Constant.PASSWORD, password)
                .build()
                .getAsObject(Login.class, new ParsedRequestListener<Login>() {
                    @Override
                    public void onResponse(Login response) {
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
                .build().getAsObject(Subject.class, new ParsedRequestListener<Subject>() {
            @Override
            public void onResponse(Subject response) {
                subjectCallBack.onSecuess(response);
            }

            @Override
            public void onError(ANError anError) {
                subjectCallBack.onError(anError.getErrorDetail());
            }
        });
    }

    public static void makeComplain(String depart, String type, String topic, String desc, String token, final ComplainCallBack complainCallBack) {
        String Authorization = "Bearer " + token;
        AndroidNetworking.post(Constant.COMPLAIN_URL)
                .addBodyParameter(Constant.COMPLAIN_DEPART, depart)
                .addBodyParameter(Constant.COMPLAIN_TYPE, type)
                .addBodyParameter(Constant.COMPLAIN_TOPIC, topic)
                .addBodyParameter(Constant.COMPLAIN_DESCRIPTION, desc)
                .addHeaders(Constant.AUTHORIZATION, Authorization)
                .build().getAsObject(Complain.class, new ParsedRequestListener<Complain>() {

            @Override
            public void onResponse(Complain response) {
                complainCallBack.onSecuess(response);
            }

            @Override
            public void onError(ANError anError) {
                complainCallBack.onError(anError.getErrorDetail());
            }
        });

    }

    public static void getQuestionnaires(String q1_1, String q1_2, String q1_3, String q1_4, String q1_5, String q1_6, String q1_7,
                                         String q2_1, String q2_2, String q2_3, String q2_4,
                                         String q3_1, String q3_2, String q3_3, String q3_4, String q3_5, String q3_6, String q3_7, String q3_8
                                         , String q4_1, String q4_2, String q4_3, String q4_4, String q4_5, String q4_6, String q4_7, String q4_8, String q4_9, String q4_10
                                         , String q5_1, String q5_2, String q5_3, String q5_4, String q5_5
                                         , String q6_1, String q6_2, String q6_3, String q6_4, String q6_5, String q6_6, String q6_7, String q6_8, String q6_9, String q6_10,
                                         String q7_1, String q7_2, String q7_3, String q7_4, String q7_5, String q7_6, String q7_7, String q7_8,
                                         String q8_1, String q8_2, String q8_3, String q8_4, String q8_5, String q8_6, String q8_7) {

    }
}
