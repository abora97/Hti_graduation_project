
package com.example.graduation_project.model.DeanDoctorSubject;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data_ implements Serializable
{

    @SerializedName("department")
    @Expose
    private Department department;
    private final static long serialVersionUID = 3434353828942164673L;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}
