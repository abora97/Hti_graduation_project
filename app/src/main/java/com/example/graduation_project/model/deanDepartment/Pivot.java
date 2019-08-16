
package com.example.graduation_project.model.deanDepartment;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pivot implements Serializable
{

    @SerializedName("department_id")
    @Expose
    private String departmentId;
    @SerializedName("doctor_id")
    @Expose
    private String doctorId;
    private final static long serialVersionUID = -8834609216232983417L;

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

}
