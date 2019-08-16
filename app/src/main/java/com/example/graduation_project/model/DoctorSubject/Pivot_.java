
package com.example.graduation_project.model.DoctorSubject;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pivot_ implements Serializable
{

    @SerializedName("doctor_id")
    @Expose
    private String doctorId;
    @SerializedName("subject_id")
    @Expose
    private String subjectId;
    private final static long serialVersionUID = 5163332871129841502L;

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

}
