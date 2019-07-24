
package com.example.graduation_project.model.subject;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data_ implements Serializable
{

    @SerializedName("subjects")
    @Expose
    private List<Subject_> subjects = null;
    private final static long serialVersionUID = -5219520365311527403L;

    public List<Subject_> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject_> subjects) {
        this.subjects = subjects;
    }

}
