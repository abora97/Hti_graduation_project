package com.example.graduation_project.data.remote;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.example.graduation_project.callBack.ComplainCallBack;
import com.example.graduation_project.callBack.ComplainCallBackRetrofit;
import com.example.graduation_project.callBack.DeanCallBack;
import com.example.graduation_project.callBack.DeanDoctorSubjectCallBack;
import com.example.graduation_project.callBack.DoctorSubjectCallBack;
import com.example.graduation_project.callBack.GetComplainCallBack;
import com.example.graduation_project.callBack.LoginCallBack;
import com.example.graduation_project.callBack.LoginManagerCallBack;
import com.example.graduation_project.callBack.QResultCallBack;
import com.example.graduation_project.callBack.QuestionnairesCallBack;
import com.example.graduation_project.callBack.SubjectCallBack;
import com.example.graduation_project.model.Complain.Complain;
import com.example.graduation_project.model.DeanDoctorSubject.DeanDoctor;
import com.example.graduation_project.model.DoctorSubject.GetDoctorSubject;
import com.example.graduation_project.model.QResult.Qresult;
import com.example.graduation_project.model.Questionnaires.Questionnaires;
import com.example.graduation_project.model.deanDepartment.DeanDepartment;
import com.example.graduation_project.model.getComplain.GetComplaints;
import com.example.graduation_project.model.login.Login;

import com.example.graduation_project.model.loginAdmin.LoginManager;
import com.example.graduation_project.model.subject.Subject;
import com.example.graduation_project.util.Constant;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

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

    public static void LoginManager(String id, String password, final LoginManagerCallBack loginCallBack) {
        AndroidNetworking.post(Constant.LOGIN_MANAGET_URL)
                .addBodyParameter(Constant.ID, id)
                .addBodyParameter(Constant.PASSWORD, password)
                .build()
                .getAsObject(LoginManager.class, new ParsedRequestListener<LoginManager>() {
                    @Override
                    public void onResponse(LoginManager response) {
                        loginCallBack.onSecuess(response.getData());
                    }

                    @Override
                    public void onError(ANError anError) {
                        loginCallBack.onError(anError.getErrorDetail());
                    }
                });
    }

    public static void DeanManager(String id, String password, final LoginManagerCallBack loginCallBack) {
        AndroidNetworking.post(Constant.LOGIN_DEAN_URL)
                .addBodyParameter(Constant.ID, id)
                .addBodyParameter(Constant.PASSWORD, password)
                .build()
                .getAsObject(LoginManager.class, new ParsedRequestListener<LoginManager>() {
                    @Override
                    public void onResponse(LoginManager response) {
                        loginCallBack.onSecuess(response.getData());
                    }

                    @Override
                    public void onError(ANError anError) {
                        loginCallBack.onError(anError.getErrorDetail());
                    }
                });
    }


    public static void deanDepartment(String token, final DeanCallBack deanCallBack) {
        String Authorization = "Bearer " + token;
        AndroidNetworking.get(Constant.DEAN_DEPARTMENT)
                .addHeaders(Constant.AUTHORIZATION, Authorization)
                .setPriority(Priority.HIGH)
                .build().getAsObject(DeanDepartment.class, new ParsedRequestListener<DeanDepartment>() {
            @Override
            public void onResponse(DeanDepartment response) {
                deanCallBack.onSecuess(response);
            }

            @Override
            public void onError(ANError anError) {
                deanCallBack.onError(anError.getErrorDetail());
            }
        });
    }


    public static void getDoctorSubject(String token, String id, final DoctorSubjectCallBack doctorSubjectCallBack) {
        String Authorization = "Bearer " + token;
        String URL = "http://questcomp.ml/public/api/managers/doctors/" + id + "/subjects";
        AndroidNetworking.get(URL)
                .addHeaders(Constant.AUTHORIZATION, Authorization)
                .setPriority(Priority.HIGH)
                .build().getAsObject(GetDoctorSubject.class, new ParsedRequestListener<GetDoctorSubject>() {
            @Override
            public void onResponse(GetDoctorSubject response) {
                doctorSubjectCallBack.onSecuess(response);
            }

            @Override
            public void onError(ANError anError) {
                doctorSubjectCallBack.onError(anError.getErrorDetail());
            }
        });

    }

    public static void getComplin(String token, final GetComplainCallBack getComplainCallBack) {
        String Authorization = "Bearer " + token;
        AndroidNetworking.get(Constant.GET_COMPLIN_URL)
                .addHeaders(Constant.AUTHORIZATION, Authorization)
                .setPriority(Priority.HIGH)
                .build().getAsObject(GetComplaints.class, new ParsedRequestListener<GetComplaints>() {
            @Override
            public void onResponse(GetComplaints response) {
                getComplainCallBack.onSecuess(response);
            }

            @Override
            public void onError(ANError anError) {
                getComplainCallBack.onError(anError.getErrorDetail());
            }
        });
    }

    public static void getQResult(String token, String docID, String subjectName, final QResultCallBack qResultCallBack) {
        String Authorization = "Bearer " + token;
        //
        // questcomp.ml/public/api/managers/doctors/1/subjects/software 1
        //
        String URL = "http://questcomp.ml/public/api/managers/doctors/" + docID + "/subjects/" + subjectName;

        AndroidNetworking.get(URL)
                .addHeaders(Constant.AUTHORIZATION, Authorization)
                .setPriority(Priority.HIGH)
                .build().getAsObject(Qresult.class, new ParsedRequestListener<Qresult>() {
            @Override
            public void onResponse(Qresult response) {
                qResultCallBack.onSecuess(response);
            }

            @Override
            public void onError(ANError anError) {
                qResultCallBack.onError(anError.getErrorDetail());
            }
        });
    }

    public static void getDepartmentDoctor(String token, String id, final DeanDoctorSubjectCallBack deanDoctorSubjectCallBack) {
        String Authorization = "Bearer " + token;
        //questcomp.ml/public/api/managers/departments/1/doctors
        String URL = "http://questcomp.ml/public/api/managers/departments/" + id + "/doctors";
        AndroidNetworking.get(URL)
                .addHeaders(Constant.AUTHORIZATION, Authorization)
                .setPriority(Priority.HIGH)
                .build().getAsObject(DeanDoctor.class, new ParsedRequestListener<DeanDoctor>() {
            @Override
            public void onResponse(DeanDoctor response) {
                deanDoctorSubjectCallBack.onSecuess(response);
            }

            @Override
            public void onError(ANError anError) {
                deanDoctorSubjectCallBack.onError(anError.getErrorDetail());
            }
        });

    }

    public static void managerDepartment(String token) {
        String Authorization = "Bearer " + token;
//        AndroidNetworking.get(Constant.MANAGER_DEPARTMENT)
//                .addHeaders(Constant.AUTHORIZATION, Authorization)
//                .setPriority(Priority.HIGH)
//                .build().getAsObject(De);


    }


    //   synchronized

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


    public static void Complain(int depart_id, String type, String topic, String desc, String token, final ComplainCallBackRetrofit complainCallBackRetrofit) {

        String Authorization = "Bearer " + token;

        Retrofit retrofit = new Retrofit.Builder().baseUrl(Constant.COMPLAIN_URL_RETROFIT).build();
        RetroApiCall getApiCall = retrofit.create(RetroApiCall.class);
        getApiCall.getJsonPlaceHolder(depart_id, type, topic, desc,Authorization).enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                complainCallBackRetrofit.onSecuess(response.message());
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                complainCallBackRetrofit.onError(t.getMessage());
            }
        });
    }


    public static void makeComplain(String depart_id, String type, String topic, String desc, String token, final ComplainCallBack complainCallBack) {
        String Authorization = "Bearer " + token;
        AndroidNetworking.post(Constant.COMPLAIN_URL)
                .addBodyParameter(Constant.COMPLAIN_DEPART, depart_id)
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
