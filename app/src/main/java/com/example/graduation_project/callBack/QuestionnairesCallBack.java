package com.example.graduation_project.callBack;

import com.example.graduation_project.model.Questionnaires.Questionnaires;

public interface QuestionnairesCallBack {
    void onError(String msg);

    void onSecuess(Questionnaires questionnaires);
}
