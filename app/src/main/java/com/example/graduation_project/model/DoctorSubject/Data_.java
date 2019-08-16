
package com.example.graduation_project.model.DoctorSubject;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data_ implements Serializable
{

    @SerializedName("subjects")
    @Expose
    private List<Subject> subjects = null;
    @SerializedName("doctor")
    @Expose
    private Doctor doctor;
    private final static long serialVersionUID = -6847300412384774584L;

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

}
