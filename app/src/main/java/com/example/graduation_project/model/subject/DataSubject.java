
package com.example.graduation_project.model.subject;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataSubject implements Serializable
{

    @SerializedName("subjects")
    @Expose
    private List<Subject> subjects ;
    private final static long serialVersionUID = -9150076318254809102L;

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

}
