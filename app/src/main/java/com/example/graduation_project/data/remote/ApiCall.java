package com.example.graduation_project.data.remote;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.example.graduation_project.callBack.ComplainCallBack;
import com.example.graduation_project.callBack.LoginCallBack;
import com.example.graduation_project.callBack.QuestionnairesCallBack;
import com.example.graduation_project.callBack.SubjectCallBack;
import com.example.graduation_project.model.Complain.Complain;
import com.example.graduation_project.model.Questionnaires.Questionnaires;
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

    public static void getQuestionnaires(String token, String subjectID, String doctorID, String assID, String q1_1, String q1_2, String q1_3, String q1_4, String q1_5, String q1_6, String q1_7,
                                         String q2_1, String q2_2, String q2_3, String q2_4,
                                         String q3_1, String q3_2, String q3_3, String q3_4, String q3_5, String q3_6, String q3_7, String q3_8
            , String q4_1, String q4_2, String q4_3, String q4_4, String q4_5, String q4_6, String q4_7, String q4_8, String q4_9, String q4_10
            , String q5_1, String q5_2, String q5_3, String q5_4, String q5_5, String q6_1, String q6_2, String q6_3, String q6_4, String q6_5, String q6_6, String q6_7, String q6_8, String q6_9, String q6_10, String q7_1, String q7_2, String q7_3, String q7_4, String q7_5, String q7_6, String q7_7, String q7_8,
                                         String q8_1, String q8_2, String q8_3, String q8_4, String q8_5, String q8_6, String q8_7, final QuestionnairesCallBack questionnairesCallBack) {
        String authorization = "Bearer " + token;
        AndroidNetworking.post(Constant.QUESTIONNAIRES_URL)
                .addHeaders(Constant.AUTHORIZATION, authorization)
                .addBodyParameter(Constant.SUB_ID, subjectID)
                .addBodyParameter(Constant.DOC_ID, doctorID)
                .addBodyParameter(Constant.ASS_ID, assID)
                .addBodyParameter(Constant.Q1, q1_1)
                .addBodyParameter(Constant.Q2, q1_2)
                .addBodyParameter(Constant.Q3, q1_3)
                .addBodyParameter(Constant.Q4, q1_4)
                .addBodyParameter(Constant.Q5, q1_5)
                .addBodyParameter(Constant.Q6, q1_6)
                .addBodyParameter(Constant.Q7, q1_7)
                .addBodyParameter(Constant.Q8, q2_1)
                .addBodyParameter(Constant.Q9, q2_2)
                .addBodyParameter(Constant.Q10, q2_3)
                .addBodyParameter(Constant.Q11, q2_4)
                .addBodyParameter(Constant.Q12, q3_1)
                .addBodyParameter(Constant.Q13, q3_2)
                .addBodyParameter(Constant.Q14, q3_3)
                .addBodyParameter(Constant.Q15, q3_4)
                .addBodyParameter(Constant.Q16, q3_5)
                .addBodyParameter(Constant.Q17, q3_6)
                .addBodyParameter(Constant.Q18, q3_7)
                .addBodyParameter(Constant.Q19, q3_8)
                .addBodyParameter(Constant.Q20, q4_1)
                .addBodyParameter(Constant.Q21, q4_2)
                .addBodyParameter(Constant.Q22, q4_3)
                .addBodyParameter(Constant.Q23, q4_4)
                .addBodyParameter(Constant.Q24, q4_5)
                .addBodyParameter(Constant.Q25, q4_6)
                .addBodyParameter(Constant.Q26, q4_7)
                .addBodyParameter(Constant.Q27, q4_8)
                .addBodyParameter(Constant.Q28, q4_9)
                .addBodyParameter(Constant.Q29, q4_10)
                .addBodyParameter(Constant.Q30, q5_1)
                .addBodyParameter(Constant.Q31, q5_2)
                .addBodyParameter(Constant.Q32, q5_3)
                .addBodyParameter(Constant.Q33, q5_4)
                .addBodyParameter(Constant.Q34, q5_5)
                .addBodyParameter(Constant.Q35, q6_1)
                .addBodyParameter(Constant.Q36, q6_2)
                .addBodyParameter(Constant.Q37, q6_3)
                .addBodyParameter(Constant.Q38, q6_4)
                .addBodyParameter(Constant.Q39, q6_5)
                .addBodyParameter(Constant.Q40, q6_6)
                .addBodyParameter(Constant.Q41, q6_7)
                .addBodyParameter(Constant.Q42, q6_8)
                .addBodyParameter(Constant.Q43, q6_9)
                .addBodyParameter(Constant.Q44, q6_10)
                .addBodyParameter(Constant.Q45, q7_1)
                .addBodyParameter(Constant.Q46, q7_2)
                .addBodyParameter(Constant.Q47, q7_3)
                .addBodyParameter(Constant.Q48, q7_4)
                .addBodyParameter(Constant.Q49, q7_5)
                .addBodyParameter(Constant.Q50, q7_6)
                .addBodyParameter(Constant.Q51, q7_7)
                .addBodyParameter(Constant.Q52, q7_8)
                .addBodyParameter(Constant.Q53, q8_1)
                .addBodyParameter(Constant.Q54, q8_2)
                .addBodyParameter(Constant.Q55, q8_3)
                .addBodyParameter(Constant.Q56, q8_4)
                .addBodyParameter(Constant.Q57, q8_5)
                .addBodyParameter(Constant.Q58, q8_6)
                .addBodyParameter(Constant.Q59, q8_7)
                .build().getAsObject(Questionnaires.class, new ParsedRequestListener<Questionnaires>() {
            @Override
            public void onResponse(Questionnaires response) {
                questionnairesCallBack.onSecuess(response);
            }

            @Override
            public void onError(ANError anError) {
                questionnairesCallBack.onError(anError.getErrorDetail());
            }
        });


    }


}
