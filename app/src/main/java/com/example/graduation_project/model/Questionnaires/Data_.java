
package com.example.graduation_project.model.Questionnaires;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data_ implements Serializable
{

    @SerializedName("questionnaire")
    @Expose
    private Questionnaire questionnaire;
    private final static long serialVersionUID = -490733927744717765L;

    public Questionnaire getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(Questionnaire questionnaire) {
        this.questionnaire = questionnaire;
    }

}
