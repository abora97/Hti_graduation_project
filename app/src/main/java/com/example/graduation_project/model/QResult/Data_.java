
package com.example.graduation_project.model.QResult;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data_ implements Serializable
{

    @SerializedName("doctor")
    @Expose
    private Doctor doctor;
    @SerializedName("subject")
    @Expose
    private Subject subject;
    @SerializedName("categoriesRules")
    @Expose
    private CategoriesRules categoriesRules;
    private final static long serialVersionUID = 1590131423420767501L;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public CategoriesRules getCategoriesRules() {
        return categoriesRules;
    }

    public void setCategoriesRules(CategoriesRules categoriesRules) {
        this.categoriesRules = categoriesRules;
    }

}
